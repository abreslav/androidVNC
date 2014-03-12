package com.example.adsl

import android.view.ContextMenu
import android.view.ViewGroup
import android.content.Context
import android.widget.*
import android.app.AlertDialog
import android.widget.LinearLayout.LayoutParams
import android.view.View 


fun android.app.SearchManager.onDismiss(l: () -> Unit) {
    setOnDismissListener(l)
}

fun android.app.SearchManager.onCancel(l: () -> Unit) {
    setOnCancelListener(l)
}

fun android.app.AlertDialog.Builder.onCancel(l: (android.content.DialogInterface?) -> Unit) {
    setOnCancelListener(l)
}

fun android.app.AlertDialog.Builder.onKey(l: (android.content.DialogInterface?, Int, android.view.KeyEvent?) -> Boolean) {
    setOnKeyListener(l)
}

class __BuilderOnItemSelectedListener {
    var _onItemSelected: (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit = { p0, p1, p2, p3 ->  }
    fun onItemSelected(f : (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit) { _onItemSelected = f }
    var _onNothingSelected: (p0: android.widget.AdapterView<*>?) -> Unit = { p0 ->  }
    fun onNothingSelected(f : (p0: android.widget.AdapterView<*>?) -> Unit) { _onNothingSelected = f }
}

fun android.app.AlertDialog.Builder.onItemSelected(init: __BuilderOnItemSelectedListener.() -> Unit) {
    val wrapper = __BuilderOnItemSelectedListener()
    wrapper.init()
    val listener = object: android.widget.AdapterView.OnItemSelectedListener {
        override fun onItemSelected(p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long): Unit {
            return wrapper._onItemSelected(p0!!, p1!!, p2, p3)
        }
        override fun onNothingSelected(p0: android.widget.AdapterView<*>?): Unit {
            return wrapper._onNothingSelected(p0!!)
        }
    }
    setOnItemSelectedListener(listener)
}

fun android.app.Dialog.onCancel(l: (android.content.DialogInterface?) -> Unit) {
    setOnCancelListener(l)
}

fun android.app.Dialog.onDismiss(l: (android.content.DialogInterface?) -> Unit) {
    setOnDismissListener(l)
}

fun android.app.Dialog.onShow(l: (android.content.DialogInterface?) -> Unit) {
    setOnShowListener(l)
}

fun android.app.Dialog.onKey(l: (android.content.DialogInterface?, Int, android.view.KeyEvent?) -> Boolean) {
    setOnKeyListener(l)
}

fun android.preference.Preference.onPreferenceChange(l: (android.preference.Preference?, Any?) -> Boolean) {
    setOnPreferenceChangeListener(l)
}

fun android.preference.Preference.onPreferenceClick(l: (android.preference.Preference?) -> Boolean) {
    setOnPreferenceClickListener(l)
}

fun android.os.CancellationSignal.onCancel(l: () -> Unit) {
    setOnCancelListener(l)
}

fun android.graphics.SurfaceTexture.onFrameAvailable(l: (android.graphics.SurfaceTexture?) -> Unit) {
    setOnFrameAvailableListener(l)
}

fun android.speech.tts.TextToSpeech.onUtteranceCompleted(l: (String?) -> Unit) {
    setOnUtteranceCompletedListener(l)
}

class __TextToSpeechUtteranceProgressListener {
    var _onStart: (p0: String?) -> Unit = { p0 ->  }
    fun onStart(f : (p0: String?) -> Unit) { _onStart = f }
    var _onDone: (p0: String?) -> Unit = { p0 ->  }
    fun onDone(f : (p0: String?) -> Unit) { _onDone = f }
    var _onError: (p0: String?) -> Unit = { p0 ->  }
    fun onError(f : (p0: String?) -> Unit) { _onError = f }
}

fun android.speech.tts.TextToSpeech.onUtteranceProgress(init: __TextToSpeechUtteranceProgressListener.() -> Unit) {
    val wrapper = __TextToSpeechUtteranceProgressListener()
    wrapper.init()
    val listener = object: android.speech.tts.UtteranceProgressListener() {
        override fun onStart(p0: String?): Unit {
            return wrapper._onStart(p0!!)
        }
        override fun onDone(p0: String?): Unit {
            return wrapper._onDone(p0!!)
        }
        override fun onError(p0: String?): Unit {
            return wrapper._onError(p0!!)
        }
    }
    setOnUtteranceProgressListener(listener)
}

fun android.drm.DrmManagerClient.onInfo(l: (android.drm.DrmManagerClient?, android.drm.DrmInfoEvent?) -> Unit) {
    setOnInfoListener(l)
}

fun android.drm.DrmManagerClient.onEvent(l: (android.drm.DrmManagerClient?, android.drm.DrmEvent?) -> Unit) {
    setOnEventListener(l)
}

fun android.drm.DrmManagerClient.onError(l: (android.drm.DrmManagerClient?, android.drm.DrmErrorEvent?) -> Unit) {
    setOnErrorListener(l)
}

fun android.media.SoundPool.onLoadComplete(l: (android.media.SoundPool?, Int, Int) -> Unit) {
    setOnLoadCompleteListener(l)
}

fun android.media.MediaRecorder.onError(l: (android.media.MediaRecorder?, Int, Int) -> Unit) {
    setOnErrorListener(l)
}

fun android.media.MediaRecorder.onInfo(l: (android.media.MediaRecorder?, Int, Int) -> Unit) {
    setOnInfoListener(l)
}

fun android.media.MediaPlayer.onPrepared(l: (android.media.MediaPlayer?) -> Unit) {
    setOnPreparedListener(l)
}

fun android.media.MediaPlayer.onCompletion(l: (android.media.MediaPlayer?) -> Unit) {
    setOnCompletionListener(l)
}

fun android.media.MediaPlayer.onBufferingUpdate(l: (android.media.MediaPlayer?, Int) -> Unit) {
    setOnBufferingUpdateListener(l)
}

fun android.media.MediaPlayer.onSeekComplete(l: (android.media.MediaPlayer?) -> Unit) {
    setOnSeekCompleteListener(l)
}

fun android.media.MediaPlayer.onVideoSizeChanged(l: (android.media.MediaPlayer?, Int, Int) -> Unit) {
    setOnVideoSizeChangedListener(l)
}

fun android.media.MediaPlayer.onTimedText(l: (android.media.MediaPlayer?, android.media.TimedText?) -> Unit) {
    setOnTimedTextListener(l)
}

fun android.media.MediaPlayer.onError(l: (android.media.MediaPlayer?, Int, Int) -> Boolean) {
    setOnErrorListener(l)
}

fun android.media.MediaPlayer.onInfo(l: (android.media.MediaPlayer?, Int, Int) -> Boolean) {
    setOnInfoListener(l)
}

fun android.view.MenuItem.onMenuItemClick(l: (android.view.MenuItem?) -> Boolean) {
    setOnMenuItemClickListener(l)
}

class __MenuItemOnActionExpandListener {
    var _onMenuItemActionExpand: (p0: android.view.MenuItem?) -> Boolean = { p0 -> false }
    fun onMenuItemActionExpand(f : (p0: android.view.MenuItem?) -> Boolean) { _onMenuItemActionExpand = f }
    var _onMenuItemActionCollapse: (p0: android.view.MenuItem?) -> Boolean = { p0 -> false }
    fun onMenuItemActionCollapse(f : (p0: android.view.MenuItem?) -> Boolean) { _onMenuItemActionCollapse = f }
}

fun android.view.MenuItem.onActionExpand(init: __MenuItemOnActionExpandListener.() -> Unit) {
    val wrapper = __MenuItemOnActionExpandListener()
    wrapper.init()
    val listener = object: android.view.MenuItem.OnActionExpandListener {
        override fun onMenuItemActionExpand(p0: android.view.MenuItem?): Boolean {
            return wrapper._onMenuItemActionExpand(p0!!)
        }
        override fun onMenuItemActionCollapse(p0: android.view.MenuItem?): Boolean {
            return wrapper._onMenuItemActionCollapse(p0!!)
        }
    }
    setOnActionExpandListener(listener)
}

fun android.view.View.onFocusChange(l: (android.view.View?, Boolean) -> Unit) {
    setOnFocusChangeListener(l)
}

fun android.view.View.onClick(l: (android.view.View?) -> Unit) {
    setOnClickListener(l)
}

fun android.view.View.onLongClick(l: (android.view.View?) -> Boolean) {
    setOnLongClickListener(l)
}

fun android.view.View.onCreateContextMenu(l: (android.view.ContextMenu?, android.view.View?, android.view.ContextMenu.ContextMenuInfo?) -> Unit) {
    setOnCreateContextMenuListener(l)
}

fun android.view.View.onKey(l: (android.view.View?, Int, android.view.KeyEvent?) -> Boolean) {
    setOnKeyListener(l)
}

fun android.view.View.onTouch(l: (android.view.View?, android.view.MotionEvent?) -> Boolean) {
    setOnTouchListener(l)
}

fun android.view.View.onGenericMotion(l: (android.view.View?, android.view.MotionEvent?) -> Boolean) {
    setOnGenericMotionListener(l)
}

fun android.view.View.onHover(l: (android.view.View?, android.view.MotionEvent?) -> Boolean) {
    setOnHoverListener(l)
}

fun android.view.View.onDrag(l: (android.view.View?, android.view.DragEvent?) -> Boolean) {
    setOnDragListener(l)
}

fun android.view.View.onSystemUiVisibilityChange(l: (Int) -> Unit) {
    setOnSystemUiVisibilityChangeListener(l)
}

class __GestureDetectorOnDoubleTapListener {
    var _onSingleTapConfirmed: (p0: android.view.MotionEvent?) -> Boolean = { p0 -> false }
    fun onSingleTapConfirmed(f : (p0: android.view.MotionEvent?) -> Boolean) { _onSingleTapConfirmed = f }
    var _onDoubleTap: (p0: android.view.MotionEvent?) -> Boolean = { p0 -> false }
    fun onDoubleTap(f : (p0: android.view.MotionEvent?) -> Boolean) { _onDoubleTap = f }
    var _onDoubleTapEvent: (p0: android.view.MotionEvent?) -> Boolean = { p0 -> false }
    fun onDoubleTapEvent(f : (p0: android.view.MotionEvent?) -> Boolean) { _onDoubleTapEvent = f }
}

fun android.view.GestureDetector.onDoubleTap(init: __GestureDetectorOnDoubleTapListener.() -> Unit) {
    val wrapper = __GestureDetectorOnDoubleTapListener()
    wrapper.init()
    val listener = object: android.view.GestureDetector.OnDoubleTapListener {
        override fun onSingleTapConfirmed(p0: android.view.MotionEvent?): Boolean {
            return wrapper._onSingleTapConfirmed(p0!!)
        }
        override fun onDoubleTap(p0: android.view.MotionEvent?): Boolean {
            return wrapper._onDoubleTap(p0!!)
        }
        override fun onDoubleTapEvent(p0: android.view.MotionEvent?): Boolean {
            return wrapper._onDoubleTapEvent(p0!!)
        }
    }
    setOnDoubleTapListener(listener)
}

fun android.widget.PopupMenu.onMenuItemClick(l: (android.view.MenuItem?) -> Boolean) {
    setOnMenuItemClickListener(l)
}

fun android.widget.PopupMenu.onDismiss(l: (android.widget.PopupMenu?) -> Unit) {
    setOnDismissListener(l)
}

fun android.widget.ListPopupWindow.onItemClick(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
    setOnItemClickListener(l)
}

class __ListPopupWindowOnItemSelectedListener {
    var _onItemSelected: (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit = { p0, p1, p2, p3 ->  }
    fun onItemSelected(f : (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit) { _onItemSelected = f }
    var _onNothingSelected: (p0: android.widget.AdapterView<*>?) -> Unit = { p0 ->  }
    fun onNothingSelected(f : (p0: android.widget.AdapterView<*>?) -> Unit) { _onNothingSelected = f }
}

fun android.widget.ListPopupWindow.onItemSelected(init: __ListPopupWindowOnItemSelectedListener.() -> Unit) {
    val wrapper = __ListPopupWindowOnItemSelectedListener()
    wrapper.init()
    val listener = object: android.widget.AdapterView.OnItemSelectedListener {
        override fun onItemSelected(p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long): Unit {
            return wrapper._onItemSelected(p0!!, p1!!, p2, p3)
        }
        override fun onNothingSelected(p0: android.widget.AdapterView<*>?): Unit {
            return wrapper._onNothingSelected(p0!!)
        }
    }
    setOnItemSelectedListener(listener)
}

fun android.widget.ListPopupWindow.onDismiss(l: () -> Unit) {
    setOnDismissListener(l)
}

class __ZoomButtonsControllerOnZoomListener {
    var _onVisibilityChanged: (p0: Boolean) -> Unit = { p0 ->  }
    fun onVisibilityChanged(f : (p0: Boolean) -> Unit) { _onVisibilityChanged = f }
    var _onZoom: (p0: Boolean) -> Unit = { p0 ->  }
    fun onZoom(f : (p0: Boolean) -> Unit) { _onZoom = f }
}

fun android.widget.ZoomButtonsController.onZoom(init: __ZoomButtonsControllerOnZoomListener.() -> Unit) {
    val wrapper = __ZoomButtonsControllerOnZoomListener()
    wrapper.init()
    val listener = object: android.widget.ZoomButtonsController.OnZoomListener {
        override fun onVisibilityChanged(p0: Boolean): Unit {
            return wrapper._onVisibilityChanged(p0)
        }
        override fun onZoom(p0: Boolean): Unit {
            return wrapper._onZoom(p0)
        }
    }
    setOnZoomListener(listener)
}

fun android.widget.PopupWindow.onDismiss(l: () -> Unit) {
    setOnDismissListener(l)
}

fun android.widget.ShareActionProvider.onShareTargetSelected(l: (android.widget.ShareActionProvider?, android.content.Intent?) -> Boolean) {
    setOnShareTargetSelectedListener(l)
}

class __KeyboardViewOnKeyboardActionListener {
    var _onPress: (p0: Int) -> Unit = { p0 ->  }
    fun onPress(f : (p0: Int) -> Unit) { _onPress = f }
    var _onRelease: (p0: Int) -> Unit = { p0 ->  }
    fun onRelease(f : (p0: Int) -> Unit) { _onRelease = f }
    var _onKey: (p0: Int, p1: IntArray?) -> Unit = { p0, p1 ->  }
    fun onKey(f : (p0: Int, p1: IntArray?) -> Unit) { _onKey = f }
    var _onText: (p0: CharSequence?) -> Unit = { p0 ->  }
    fun onText(f : (p0: CharSequence?) -> Unit) { _onText = f }
    var _swipeLeft: () -> Unit = {  ->  }
    fun swipeLeft(f : () -> Unit) { _swipeLeft = f }
    var _swipeRight: () -> Unit = {  ->  }
    fun swipeRight(f : () -> Unit) { _swipeRight = f }
    var _swipeDown: () -> Unit = {  ->  }
    fun swipeDown(f : () -> Unit) { _swipeDown = f }
    var _swipeUp: () -> Unit = {  ->  }
    fun swipeUp(f : () -> Unit) { _swipeUp = f }
}

fun android.view.ViewStub.onInflate(l: (android.view.ViewStub?, android.view.View?) -> Unit) {
    setOnInflateListener(l)
}

class __ViewGroupOnHierarchyChangeListener {
    var _onChildViewAdded: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewAdded(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewAdded = f }
    var _onChildViewRemoved: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewRemoved(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewRemoved = f }
}

fun android.widget.TextView.onEditorAction(l: (android.widget.TextView?, Int, android.view.KeyEvent?) -> Boolean) {
    setOnEditorActionListener(l)
}

fun android.app.FragmentBreadCrumbs.onBreadCrumbClick(l: (android.app.FragmentManager.BackStackEntry?, Int) -> Boolean) {
    setOnBreadCrumbClickListener(l)
}

fun android.widget.SlidingDrawer.onDrawerOpen(l: () -> Unit) {
    setOnDrawerOpenListener(l)
}

fun android.widget.SlidingDrawer.onDrawerClose(l: () -> Unit) {
    setOnDrawerCloseListener(l)
}

class __SlidingDrawerOnDrawerScrollListener {
    var _onScrollStarted: () -> Unit = {  ->  }
    fun onScrollStarted(f : () -> Unit) { _onScrollStarted = f }
    var _onScrollEnded: () -> Unit = {  ->  }
    fun onScrollEnded(f : () -> Unit) { _onScrollEnded = f }
}

fun android.widget.AdapterView<out android.widget.Adapter?>.onItemClick(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
    setOnItemClickListener(l)
}

fun android.widget.AdapterView<out android.widget.Adapter?>.onItemLongClick(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Boolean) {
    setOnItemLongClickListener(l)
}

class __AdapterViewOnItemSelectedListener {
    var _onItemSelected: (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit = { p0, p1, p2, p3 ->  }
    fun onItemSelected(f : (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit) { _onItemSelected = f }
    var _onNothingSelected: (p0: android.widget.AdapterView<*>?) -> Unit = { p0 ->  }
    fun onNothingSelected(f : (p0: android.widget.AdapterView<*>?) -> Unit) { _onNothingSelected = f }
}

fun android.widget.AdapterView<out android.widget.Adapter?>.onClick(l: (android.view.View?) -> Unit) {
    setOnClickListener(l)
}

fun android.widget.VideoView.onPrepared(l: (android.media.MediaPlayer?) -> Unit) {
    setOnPreparedListener(l)
}

fun android.widget.VideoView.onCompletion(l: (android.media.MediaPlayer?) -> Unit) {
    setOnCompletionListener(l)
}

fun android.widget.VideoView.onError(l: (android.media.MediaPlayer?, Int, Int) -> Boolean) {
    setOnErrorListener(l)
}

fun android.widget.Chronometer.onChronometerTick(l: (android.widget.Chronometer?) -> Unit) {
    setOnChronometerTickListener(l)
}

fun android.widget.CalendarView.onDateChange(l: (android.widget.CalendarView?, Int, Int, Int) -> Unit) {
    setOnDateChangeListener(l)
}

fun android.widget.TimePicker.onTimeChanged(l: (android.widget.TimePicker?, Int, Int) -> Unit) {
    setOnTimeChangedListener(l)
}

fun android.widget.TabHost.onTabChanged(l: (String?) -> Unit) {
    setOnTabChangedListener(l)
}

class __AbsListViewOnScrollListener {
    var _onScrollStateChanged: (p0: android.widget.AbsListView?, p1: Int) -> Unit = { p0, p1 ->  }
    fun onScrollStateChanged(f : (p0: android.widget.AbsListView?, p1: Int) -> Unit) { _onScrollStateChanged = f }
    var _onScroll: (p0: android.widget.AbsListView?, p1: Int, p2: Int, p3: Int) -> Unit = { p0, p1, p2, p3 ->  }
    fun onScroll(f : (p0: android.widget.AbsListView?, p1: Int, p2: Int, p3: Int) -> Unit) { _onScroll = f }
}

class __TableLayoutOnHierarchyChangeListener {
    var _onChildViewAdded: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewAdded(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewAdded = f }
    var _onChildViewRemoved: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewRemoved(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewRemoved = f }
}

class __TableRowOnHierarchyChangeListener {
    var _onChildViewAdded: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewAdded(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewAdded = f }
    var _onChildViewRemoved: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewRemoved(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewRemoved = f }
}

fun android.widget.NumberPicker.onValueChanged(l: (android.widget.NumberPicker?, Int, Int) -> Unit) {
    setOnValueChangedListener(l)
}

fun android.widget.NumberPicker.onScroll(l: (android.widget.NumberPicker?, Int) -> Unit) {
    setOnScrollListener(l)
}

class __RadioGroupOnHierarchyChangeListener {
    var _onChildViewAdded: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewAdded(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewAdded = f }
    var _onChildViewRemoved: (p0: android.view.View?, p1: android.view.View?) -> Unit = { p0, p1 ->  }
    fun onChildViewRemoved(f : (p0: android.view.View?, p1: android.view.View?) -> Unit) { _onChildViewRemoved = f }
}

fun android.widget.RadioGroup.onCheckedChange(l: (android.widget.RadioGroup?, Int) -> Unit) {
    setOnCheckedChangeListener(l)
}

fun android.widget.ZoomControls.onZoomInClick(l: (android.view.View?) -> Unit) {
    setOnZoomInClickListener(l)
}

fun android.widget.ZoomControls.onZoomOutClick(l: (android.view.View?) -> Unit) {
    setOnZoomOutClickListener(l)
}

class __SearchViewOnQueryTextListener {
    var _onQueryTextSubmit: (p0: String?) -> Boolean = { p0 -> false }
    fun onQueryTextSubmit(f : (p0: String?) -> Boolean) { _onQueryTextSubmit = f }
    var _onQueryTextChange: (p0: String?) -> Boolean = { p0 -> false }
    fun onQueryTextChange(f : (p0: String?) -> Boolean) { _onQueryTextChange = f }
}

fun android.widget.SearchView.onClose(l: () -> Boolean) {
    setOnCloseListener(l)
}

fun android.widget.SearchView.onQueryTextFocusChange(l: (android.view.View?, Boolean) -> Unit) {
    setOnQueryTextFocusChangeListener(l)
}

class __SearchViewOnSuggestionListener {
    var _onSuggestionSelect: (p0: Int) -> Boolean = { p0 -> false }
    fun onSuggestionSelect(f : (p0: Int) -> Boolean) { _onSuggestionSelect = f }
    var _onSuggestionClick: (p0: Int) -> Boolean = { p0 -> false }
    fun onSuggestionClick(f : (p0: Int) -> Boolean) { _onSuggestionClick = f }
}

fun android.widget.SearchView.onSearchClick(l: (android.view.View?) -> Unit) {
    setOnSearchClickListener(l)
}

fun android.widget.CompoundButton.onCheckedChange(l: (android.widget.CompoundButton?, Boolean) -> Unit) {
    setOnCheckedChangeListener(l)
}

fun android.widget.AutoCompleteTextView.onClick(l: (android.view.View?) -> Unit) {
    setOnClickListener(l)
}

fun android.widget.AutoCompleteTextView.onItemClick(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
    setOnItemClickListener(l)
}

class __AutoCompleteTextViewOnItemSelectedListener {
    var _onItemSelected: (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit = { p0, p1, p2, p3 ->  }
    fun onItemSelected(f : (p0: android.widget.AdapterView<*>?, p1: android.view.View?, p2: Int, p3: Long) -> Unit) { _onItemSelected = f }
    var _onNothingSelected: (p0: android.widget.AdapterView<*>?) -> Unit = { p0 ->  }
    fun onNothingSelected(f : (p0: android.widget.AdapterView<*>?) -> Unit) { _onNothingSelected = f }
}

class __SeekBarOnSeekBarChangeListener {
    var _onProgressChanged: (p0: android.widget.SeekBar?, p1: Int, p2: Boolean) -> Unit = { p0, p1, p2 ->  }
    fun onProgressChanged(f : (p0: android.widget.SeekBar?, p1: Int, p2: Boolean) -> Unit) { _onProgressChanged = f }
    var _onStartTrackingTouch: (p0: android.widget.SeekBar?) -> Unit = { p0 ->  }
    fun onStartTrackingTouch(f : (p0: android.widget.SeekBar?) -> Unit) { _onStartTrackingTouch = f }
    var _onStopTrackingTouch: (p0: android.widget.SeekBar?) -> Unit = { p0 ->  }
    fun onStopTrackingTouch(f : (p0: android.widget.SeekBar?) -> Unit) { _onStopTrackingTouch = f }
}

fun android.widget.RatingBar.onRatingBarChange(l: (android.widget.RatingBar?, Float, Boolean) -> Unit) {
    setOnRatingBarChangeListener(l)
}

fun android.widget.Spinner.onItemClick(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
    setOnItemClickListener(l)
}

fun android.widget.ExpandableListView.onItemClick(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
    setOnItemClickListener(l)
}

fun android.widget.ExpandableListView.onGroupCollapse(l: (Int) -> Unit) {
    setOnGroupCollapseListener(l)
}

fun android.widget.ExpandableListView.onGroupExpand(l: (Int) -> Unit) {
    setOnGroupExpandListener(l)
}

fun android.widget.ExpandableListView.onGroupClick(l: (android.widget.ExpandableListView?, android.view.View?, Int, Long) -> Boolean) {
    setOnGroupClickListener(l)
}

fun android.widget.ExpandableListView.onChildClick(l: (android.widget.ExpandableListView?, android.view.View?, Int, Int, Long) -> Boolean) {
    setOnChildClickListener(l)
}

