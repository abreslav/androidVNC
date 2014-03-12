package com.example.adsl

import android.widget.*
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT


fun android.app.Activity.fragmentBreadCrumbs(init: _FragmentBreadCrumbs.() -> Unit) {
    val layout = _FragmentBreadCrumbs(android.app.FragmentBreadCrumbs(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.relativeLayout(init: _RelativeLayout.() -> Unit) {
    val layout = _RelativeLayout(android.widget.RelativeLayout(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.absoluteLayout(init: _AbsoluteLayout.() -> Unit) {
    val layout = _AbsoluteLayout(android.widget.AbsoluteLayout(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.slidingDrawer(attrs: android.util.AttributeSet?, init: _SlidingDrawer.() -> Unit) {
    val layout = _SlidingDrawer(android.widget.SlidingDrawer(this, attrs!!), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.frameLayout(init: _FrameLayout.() -> Unit) {
    val layout = _FrameLayout(android.widget.FrameLayout(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.linearLayout(init: _LinearLayout.() -> Unit) {
    val layout = _LinearLayout(android.widget.LinearLayout(this), this)
    layout.init()
    val v = layout.viewGroup.getChildCount()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.vertical(width: Int = MATCH_PARENT, height: Int = WRAP_CONTENT, init: _LinearLayout.() -> Unit) {
    linearLayout {
        init()
        viewGroup.layoutParams(width, height)
        orientation = LinearLayout.VERTICAL
    }
}

fun android.app.Activity.horizontal(width: Int = MATCH_PARENT, height: Int = WRAP_CONTENT, init: _LinearLayout.() -> Unit) {
    linearLayout {
        init()
        viewGroup.layoutParams(width, height)
        orientation = LinearLayout.HORIZONTAL
    }
}


fun android.app.Activity.gridLayout(init: _GridLayout.() -> Unit) {
    val layout = _GridLayout(android.widget.GridLayout(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.twoLineListItem(init: _TwoLineListItem.() -> Unit) {
    val layout = _TwoLineListItem(android.widget.TwoLineListItem(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.dialerFilter(init: _DialerFilter.() -> Unit) {
    val layout = _DialerFilter(android.widget.DialerFilter(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.webView(init: _WebView.() -> Unit) {
    val layout = _WebView(android.webkit.WebView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.appWidgetHostView(init: _AppWidgetHostView.() -> Unit) {
    val layout = _AppWidgetHostView(android.appwidget.AppWidgetHostView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.gestureOverlayView(init: _GestureOverlayView.() -> Unit) {
    val layout = _GestureOverlayView(android.gesture.GestureOverlayView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.calendarView(init: _CalendarView.() -> Unit) {
    val layout = _CalendarView(android.widget.CalendarView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.horizontalScrollView(init: _HorizontalScrollView.() -> Unit) {
    val layout = _HorizontalScrollView(android.widget.HorizontalScrollView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.scrollView(init: _ScrollView.() -> Unit) {
    val layout = _ScrollView(android.widget.ScrollView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.datePicker(init: _DatePicker.() -> Unit) {
    val layout = _DatePicker(android.widget.DatePicker(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.timePicker(init: _TimePicker.() -> Unit) {
    val layout = _TimePicker(android.widget.TimePicker(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.tabHost(init: _TabHost.() -> Unit) {
    val layout = _TabHost(android.widget.TabHost(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.viewAnimator(init: _ViewAnimator.() -> Unit) {
    val layout = _ViewAnimator(android.widget.ViewAnimator(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.mediaController(init: _MediaController.() -> Unit) {
    val layout = _MediaController(android.widget.MediaController(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.tableLayout(init: _TableLayout.() -> Unit) {
    val layout = _TableLayout(android.widget.TableLayout(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.tableRow(init: _TableRow.() -> Unit) {
    val layout = _TableRow(android.widget.TableRow(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.numberPicker(init: _NumberPicker.() -> Unit) {
    val layout = _NumberPicker(android.widget.NumberPicker(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.tabWidget(init: _TabWidget.() -> Unit) {
    val layout = _TabWidget(android.widget.TabWidget(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.radioGroup(init: _RadioGroup.() -> Unit) {
    val layout = _RadioGroup(android.widget.RadioGroup(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.zoomControls(init: _ZoomControls.() -> Unit) {
    val layout = _ZoomControls(android.widget.ZoomControls(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.searchView(init: _SearchView.() -> Unit) {
    val layout = _SearchView(android.widget.SearchView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.viewSwitcher(init: _ViewSwitcher.() -> Unit) {
    val layout = _ViewSwitcher(android.widget.ViewSwitcher(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.viewFlipper(init: _ViewFlipper.() -> Unit) {
    val layout = _ViewFlipper(android.widget.ViewFlipper(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.listView(init: _ListView.() -> Unit) {
    val layout = _ListView(android.widget.ListView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.gridView(init: _GridView.() -> Unit) {
    val layout = _GridView(android.widget.GridView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.spinner(init: _Spinner.() -> Unit) {
    val layout = _Spinner(android.widget.Spinner(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.gallery(init: _Gallery.() -> Unit) {
    val layout = _Gallery(android.widget.Gallery(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.adapterViewFlipper(init: _AdapterViewFlipper.() -> Unit) {
    val layout = _AdapterViewFlipper(android.widget.AdapterViewFlipper(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.stackView(init: _StackView.() -> Unit) {
    val layout = _StackView(android.widget.StackView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.textSwitcher(init: _TextSwitcher.() -> Unit) {
    val layout = _TextSwitcher(android.widget.TextSwitcher(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.imageSwitcher(init: _ImageSwitcher.() -> Unit) {
    val layout = _ImageSwitcher(android.widget.ImageSwitcher(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.expandableListView(init: _ExpandableListView.() -> Unit) {
    val layout = _ExpandableListView(android.widget.ExpandableListView(this), this)
    layout.init()
    setContentView(layout.viewGroup)
}

fun android.app.Activity.UI(init: android.app.Activity.() -> Unit) {
    init()
}

//fun UI(act: android.content.Context, init: android.content.Context.() -> Unit) {
//    act.init()
//}