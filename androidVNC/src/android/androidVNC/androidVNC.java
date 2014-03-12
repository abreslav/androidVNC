/* 
 * This is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this software; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,
 * USA.
 */

//
// androidVNC is the Activity for setting VNC server IP and port.
//

package android.androidVNC;

import android.app.Activity;
import android.app.Dialog;
import android.app.ActivityManager.MemoryInfo;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Collections;


public class androidVNC extends Activity {
    private SettingsUI ui;

    private VncDatabase database;
	private ConnectionBean selected;
    private boolean repeaterTextSet;

	@Override
	public void onCreate(Bundle icicle) {

		super.onCreate(icicle);

        ui = new SettingsUI(this);


        ui.getRepeater().setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showDialog(R.layout.repeater_dialog);
            }
        });
		ui.getImportExport().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(R.layout.importexport);
            }
        });
        COLORMODEL[] models=COLORMODEL.values();
		ArrayAdapter<COLORMODEL> colorSpinnerAdapter = new ArrayAdapter<COLORMODEL>(this, android.R.layout.simple_spinner_item, models);
        ui.getColorFormat().setAdapter(colorSpinnerAdapter);
		ui.getColorFormat().setSelection(0);
        ui.getConnection().setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> ad, View view, int itemIndex, long id) {
                selected = (ConnectionBean) ad.getSelectedItem();
                updateViewFromSelected();
            }

            @Override
            public void onNothingSelected(AdapterView<?> ad) {
                selected = null;
            }
        });
		ui.getConnection().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            /* (non-Javadoc)
             * @see android.widget.AdapterView.OnItemLongClickListener#onItemLongClick(android.widget.AdapterView, android.view.View, int, long)
             */
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int arg2, long arg3) {
                ui.getConnection().setSelection(arg2);
                selected = (ConnectionBean) ui.getConnection().getItemAtPosition(arg2);
                canvasStart();
                return true;
            }

        });
        ui.getGo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canvasStart();
            }
        });
		
		database = new VncDatabase(this);
	}
	
	protected void onDestroy() {
		database.close();
		super.onDestroy();
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateDialog(int)
	 */
	@Override
	protected Dialog onCreateDialog(int id) {
		if (id == R.layout.importexport)
			return new ImportExportDialog(this);
		else
			return new RepeaterDialog(this);
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.androidvncmenu,menu);
		return true;
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onMenuOpened(int, android.view.Menu)
	 */
	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
		menu.findItem(R.id.itemDeleteConnection).setEnabled(selected!=null && ! selected.isNew());
		menu.findItem(R.id.itemSaveAsCopy).setEnabled(selected!=null && ! selected.isNew());
		return true;
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId())
		{
		case R.id.itemSaveAsCopy :
			if (selected.getNickname().equals(ui.getNickname().getText().toString()))
				ui.getNickname().setText("Copy of " + selected.getNickname());
			updateSelectedFromView();
			selected.set_Id(0);
			saveAndWriteRecent();
			arriveOnPage();
			break;
		case R.id.itemDeleteConnection :
			Utils.showYesNoPrompt(this, "Delete?", "Delete " + selected.getNickname() + "?",
					new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int i)
				{
					selected.Gen_delete(database.getWritableDatabase());
					arriveOnPage();
				}
			}, null);
			break;
		case R.id.itemOpenDoc :
			Utils.showDocumentation(this);
			break;
		}
		return true;
	}

	private void updateViewFromSelected() {
		if (selected==null)
			return;
		ui.getIp().setText(selected.getAddress());
		ui.getPort().setText(Integer.toString(selected.getPort()));
		if (selected.getKeepPassword() || selected.getPassword().length()>0) {
			ui.getPassword().setText(selected.getPassword());
		}
		ui.getForceFullScreenGroup().check(selected.getForceFull() == BitmapImplHint.AUTO ? R.id.radioForceFullScreenAuto : (selected.getForceFull() == BitmapImplHint.FULL ? R.id.radioForceFullScreenOn : R.id.radioForceFullScreenOff));
		ui.getKeepPassword().setChecked(selected.getKeepPassword());
		ui.getUseLocalCursor().setChecked(selected.getUseLocalCursor());
		ui.getNickname().setText(selected.getNickname());
		ui.getUsername().setText(selected.getUserName());
		COLORMODEL cm = COLORMODEL.valueOf(selected.getColorModel());
		COLORMODEL[] colors=COLORMODEL.values();
		for (int i=0; i<colors.length; ++i)
		{
			if (colors[i] == cm) {
				ui.getColorFormat().setSelection(i);
				break;
			}
		}
		updateRepeaterInfo(selected.getUseRepeater(), selected.getRepeaterId());
	}
	
	/**
	 * Called when changing view to match selected connection or from
	 * Repeater dialog to update the repeater information shown.
	 * @param repeaterId If null or empty, show text for not using repeater
	 */
	void updateRepeaterInfo(boolean useRepeater, String repeaterId)
	{
		if (useRepeater)
		{
			ui.getRepeaterId().setText(repeaterId);
			repeaterTextSet = true;
		}
		else
		{
			ui.getRepeaterId().setText(getText(R.string.repeater_empty_text));
			repeaterTextSet = false;
		}
	}
	
	private void updateSelectedFromView() {
		if (selected==null) {
			return;
		}
		selected.setAddress(ui.getIp().getText().toString());
		try
		{
			selected.setPort(Integer.parseInt(ui.getPort().getText().toString()));
		}
		catch (NumberFormatException nfe)
		{
			
		}
		selected.setNickname(ui.getNickname().getText().toString());
		selected.setUserName(ui.getUsername().getText().toString());
		selected.setForceFull(ui.getForceFullScreenGroup().getCheckedRadioButtonId()==R.id.radioForceFullScreenAuto ? BitmapImplHint.AUTO : (ui.getForceFullScreenGroup().getCheckedRadioButtonId()==R.id.radioForceFullScreenOn ? BitmapImplHint.FULL : BitmapImplHint.TILE));
		selected.setPassword(ui.getPassword().getText().toString());
		selected.setKeepPassword(ui.getKeepPassword().isChecked());
		selected.setUseLocalCursor(ui.getUseLocalCursor().isChecked());
		selected.setColorModel(((COLORMODEL) ui.getColorFormat().getSelectedItem()).nameString());
		if (repeaterTextSet)
		{
			selected.setRepeaterId(ui.getRepeaterId().getText().toString());
			selected.setUseRepeater(true);
		}
		else
		{
			selected.setUseRepeater(false);
		}
	}
	
	protected void onStart() {
		super.onStart();
		arriveOnPage();
	}
	
	/**
	 * Return the object representing the app global state in the database, or null
	 * if the object hasn't been set up yet
	 * @param db App's database -- only needs to be readable
	 * @return Object representing the single persistent instance of MostRecentBean, which
	 * is the app's global state
	 */
	static MostRecentBean getMostRecent(SQLiteDatabase db)
	{
		ArrayList<MostRecentBean> recents = new ArrayList<MostRecentBean>(1);
		MostRecentBean.getAll(db, MostRecentBean.GEN_TABLE_NAME, recents, MostRecentBean.GEN_NEW);
		if (recents.size() == 0)
			return null;
		return recents.get(0);
	}
	
	void arriveOnPage() {
		ArrayList<ConnectionBean> connections=new ArrayList<ConnectionBean>();
		ConnectionBean.getAll(database.getReadableDatabase(), ConnectionBean.GEN_TABLE_NAME, connections, ConnectionBean.newInstance);
		Collections.sort(connections);
		connections.add(0, new ConnectionBean());
		int connectionIndex=0;
		if ( connections.size()>1)
		{
			MostRecentBean mostRecent = getMostRecent(database.getReadableDatabase());
			if (mostRecent != null)
			{
				for ( int i=1; i<connections.size(); ++i)
				{
					if (connections.get(i).get_Id() == mostRecent.getConnectionId())
					{
						connectionIndex=i;
						break;
					}
				}
			}
		}
		ui.getConnection().setAdapter(new ArrayAdapter<ConnectionBean>(this, android.R.layout.simple_spinner_item,
                connections.toArray(new ConnectionBean[connections.size()])));
		ui.getConnection().setSelection(connectionIndex, false);
		selected=connections.get(connectionIndex);
		updateViewFromSelected();
		IntroTextDialog.showIntroTextIfNecessary(this, database);
	}
	
	protected void onStop() {
		super.onStop();
		if ( selected == null ) {
			return;
		}
		updateSelectedFromView();
		selected.save(database.getWritableDatabase());
	}
	
	VncDatabase getDatabaseHelper()
	{
		return database;
	}
	
	private void canvasStart() {
		if (selected == null) return;
		MemoryInfo info = Utils.getMemoryInfo(this);
		if (info.lowMemory) {
			// Low Memory situation.  Prompt.
			Utils.showYesNoPrompt(this, "Continue?", "Android reports low system memory.\nContinue with VNC connection?", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					vnc();
				}
			}, null);
		} else
			vnc();
	}
	
	private void saveAndWriteRecent()
	{
		SQLiteDatabase db = database.getWritableDatabase();
		db.beginTransaction();
		try
		{
			selected.save(db);
			MostRecentBean mostRecent = getMostRecent(db);
			if (mostRecent == null)
			{
				mostRecent = new MostRecentBean();
				mostRecent.setConnectionId(selected.get_Id());
				mostRecent.Gen_insert(db);
			}
			else
			{
				mostRecent.setConnectionId(selected.get_Id());
				mostRecent.Gen_update(db);
			}
			db.setTransactionSuccessful();
		}
		finally
		{
			db.endTransaction();
		}
	}
	
	private void vnc() {
		updateSelectedFromView();
		saveAndWriteRecent();
		Intent intent = new Intent(this, VncCanvasActivity.class);
		intent.putExtra(VncConstants.CONNECTION,selected.Gen_getValues());
		startActivity(intent);
	}
}
