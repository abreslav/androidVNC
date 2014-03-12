package com.example.adsl

import android.view.ContextMenu
import android.view.ViewGroup
import android.content.Context
import android.widget.*
import android.app.AlertDialog
import android.widget.LinearLayout.LayoutParams
import android.view.View 
import android.view.ViewGroup.LayoutParams.*


class _FragmentBreadCrumbs(viewGroup: android.app.FragmentBreadCrumbs, ctx: android.app.Activity): _Container<android.app.FragmentBreadCrumbs>(viewGroup, ctx) {

}

class _RelativeLayout(viewGroup: android.widget.RelativeLayout, ctx: android.app.Activity): _Container<android.widget.RelativeLayout>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.RelativeLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RelativeLayout.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, init: android.widget.RelativeLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RelativeLayout.LayoutParams(w, h)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.widget.RelativeLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RelativeLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.RelativeLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RelativeLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _AbsoluteLayout(viewGroup: android.widget.AbsoluteLayout, ctx: android.app.Activity): _Container<android.widget.AbsoluteLayout>(viewGroup, ctx) {

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, x: Int, y: Int, init: android.widget.AbsoluteLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.AbsoluteLayout.LayoutParams(width, height, x, y)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.AbsoluteLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.AbsoluteLayout.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.widget.AbsoluteLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.AbsoluteLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _SlidingDrawer(viewGroup: android.widget.SlidingDrawer, ctx: android.app.Activity): _Container<android.widget.SlidingDrawer>(viewGroup, ctx) {

}

class _FrameLayout(viewGroup: android.widget.FrameLayout, ctx: android.app.Activity): _Container<android.widget.FrameLayout>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, gravity: Int, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(width, height, gravity)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _LinearLayout(viewGroup: android.widget.LinearLayout, ctx: android.app.Activity): _Container<android.widget.LinearLayout>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.LinearLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.LinearLayout.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.widget.LinearLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.LinearLayout.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, weight: Float, init: android.widget.LinearLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.LinearLayout.LayoutParams(width, height, weight)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(p: android.view.ViewGroup.LayoutParams?, init: android.widget.LinearLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.LinearLayout.LayoutParams(p!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.LinearLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.LinearLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _GridLayout(viewGroup: android.widget.GridLayout, ctx: android.app.Activity): _Container<android.widget.GridLayout>(viewGroup, ctx) {

    fun android.view.View.layoutParams(rowSpec: android.widget.GridLayout.Spec?, columnSpec: android.widget.GridLayout.Spec?, init: android.widget.GridLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.GridLayout.LayoutParams(rowSpec!!, columnSpec!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams( init: android.widget.GridLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.GridLayout.LayoutParams()
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(params: android.view.ViewGroup.LayoutParams?, init: android.widget.GridLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.GridLayout.LayoutParams(params!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(params: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.GridLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.GridLayout.LayoutParams(params!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(that: android.widget.GridLayout.LayoutParams?, init: android.widget.GridLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.GridLayout.LayoutParams(that!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(context: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.GridLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.GridLayout.LayoutParams(context!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _TwoLineListItem(viewGroup: android.widget.TwoLineListItem, ctx: android.app.Activity): _Container<android.widget.TwoLineListItem>(viewGroup, ctx) {

}

class _DialerFilter(viewGroup: android.widget.DialerFilter, ctx: android.app.Activity): _Container<android.widget.DialerFilter>(viewGroup, ctx) {

}

class _WebView(viewGroup: android.webkit.WebView, ctx: android.app.Activity): _Container<android.webkit.WebView>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _AppWidgetHostView(viewGroup: android.appwidget.AppWidgetHostView, ctx: android.app.Activity): _Container<android.appwidget.AppWidgetHostView>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, gravity: Int, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(width, height, gravity)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.FrameLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.FrameLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _GestureOverlayView(viewGroup: android.gesture.GestureOverlayView, ctx: android.app.Activity): _Container<android.gesture.GestureOverlayView>(viewGroup, ctx) {

}

class _CalendarView(viewGroup: android.widget.CalendarView, ctx: android.app.Activity): _Container<android.widget.CalendarView>(viewGroup, ctx) {

}

class _HorizontalScrollView(viewGroup: android.widget.HorizontalScrollView, ctx: android.app.Activity): _Container<android.widget.HorizontalScrollView>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _ScrollView(viewGroup: android.widget.ScrollView, ctx: android.app.Activity): _Container<android.widget.ScrollView>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _DatePicker(viewGroup: android.widget.DatePicker, ctx: android.app.Activity): _Container<android.widget.DatePicker>(viewGroup, ctx) {

}

class _TimePicker(viewGroup: android.widget.TimePicker, ctx: android.app.Activity): _Container<android.widget.TimePicker>(viewGroup, ctx) {

}

class _TabHost(viewGroup: android.widget.TabHost, ctx: android.app.Activity): _Container<android.widget.TabHost>(viewGroup, ctx) {

}

class _ViewAnimator(viewGroup: android.widget.ViewAnimator, ctx: android.app.Activity): _Container<android.widget.ViewAnimator>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _MediaController(viewGroup: android.widget.MediaController, ctx: android.app.Activity): _Container<android.widget.MediaController>(viewGroup, ctx) {

}

class _TableLayout(viewGroup: android.widget.TableLayout, ctx: android.app.Activity): _Container<android.widget.TableLayout>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.TableLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableLayout.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, init: android.widget.TableLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableLayout.LayoutParams(w, h)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, initWeight: Float, init: android.widget.TableLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableLayout.LayoutParams(w, h, initWeight)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams( init: android.widget.TableLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableLayout.LayoutParams()
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(p: android.view.ViewGroup.LayoutParams?, init: android.widget.TableLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableLayout.LayoutParams(p!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.TableLayout.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableLayout.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _TableRow(viewGroup: android.widget.TableRow, ctx: android.app.Activity): _Container<android.widget.TableRow>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableRow.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableRow.LayoutParams(w, h)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, initWeight: Float, init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableRow.LayoutParams(w, h, initWeight)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

//    fun android.view.View.layoutParams( init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
//        val lp = android.widget.TableRow.LayoutParams()
//        lp.init()
//        this@layoutParams.setLayoutParams(lp)
//    }

    fun android.view.View.layoutParams(column: Int, init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableRow.LayoutParams(column)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(p: android.view.ViewGroup.LayoutParams?, init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableRow.LayoutParams(p!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.TableRow.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.TableRow.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _NumberPicker(viewGroup: android.widget.NumberPicker, ctx: android.app.Activity): _Container<android.widget.NumberPicker>(viewGroup, ctx) {

}

class _TabWidget(viewGroup: android.widget.TabWidget, ctx: android.app.Activity): _Container<android.widget.TabWidget>(viewGroup, ctx) {

}

class _RadioGroup(viewGroup: android.widget.RadioGroup, ctx: android.app.Activity): _Container<android.widget.RadioGroup>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.RadioGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RadioGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, init: android.widget.RadioGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RadioGroup.LayoutParams(w, h)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, initWeight: Float, init: android.widget.RadioGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RadioGroup.LayoutParams(w, h, initWeight)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(p: android.view.ViewGroup.LayoutParams?, init: android.widget.RadioGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RadioGroup.LayoutParams(p!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.MarginLayoutParams?, init: android.widget.RadioGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.RadioGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _ZoomControls(viewGroup: android.widget.ZoomControls, ctx: android.app.Activity): _Container<android.widget.ZoomControls>(viewGroup, ctx) {

}

class _SearchView(viewGroup: android.widget.SearchView, ctx: android.app.Activity): _Container<android.widget.SearchView>(viewGroup, ctx) {

}

class _ViewSwitcher(viewGroup: android.widget.ViewSwitcher, ctx: android.app.Activity): _Container<android.widget.ViewSwitcher>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _ViewFlipper(viewGroup: android.widget.ViewFlipper, ctx: android.app.Activity): _Container<android.widget.ViewFlipper>(viewGroup, ctx) {

}

class _ListView(viewGroup: android.widget.ListView, ctx: android.app.Activity): _Container<android.widget.ListView>(viewGroup, ctx) {

}

class _GridView(viewGroup: android.widget.GridView, ctx: android.app.Activity): _Container<android.widget.GridView>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _Spinner(viewGroup: android.widget.Spinner, ctx: android.app.Activity): _Container<android.widget.Spinner>(viewGroup, ctx) {

}

class _Gallery(viewGroup: android.widget.Gallery, ctx: android.app.Activity): _Container<android.widget.Gallery>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.widget.Gallery.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.Gallery.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(w: Int = FILL_PARENT, h: Int = WRAP_CONTENT, init: android.widget.Gallery.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.Gallery.LayoutParams(w, h)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.widget.Gallery.LayoutParams.() -> Unit = { }) {
        val lp = android.widget.Gallery.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _AdapterViewFlipper(viewGroup: android.widget.AdapterViewFlipper, ctx: android.app.Activity): _Container<android.widget.AdapterViewFlipper>(viewGroup, ctx) {

}

class _StackView(viewGroup: android.widget.StackView, ctx: android.app.Activity): _Container<android.widget.StackView>(viewGroup, ctx) {

}

class _TextSwitcher(viewGroup: android.widget.TextSwitcher, ctx: android.app.Activity): _Container<android.widget.TextSwitcher>(viewGroup, ctx) {

    fun android.view.View.layoutParams(c: android.content.Context?, attrs: android.util.AttributeSet?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(c!!, attrs!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(width: Int = FILL_PARENT, height: Int = WRAP_CONTENT, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(width, height)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

    fun android.view.View.layoutParams(source: android.view.ViewGroup.LayoutParams?, init: android.view.ViewGroup.LayoutParams.() -> Unit = { }) {
        val lp = android.view.ViewGroup.LayoutParams(source!!)
        lp.init()
        this@layoutParams.setLayoutParams(lp)
    }

}

class _ImageSwitcher(viewGroup: android.widget.ImageSwitcher, ctx: android.app.Activity): _Container<android.widget.ImageSwitcher>(viewGroup, ctx) {

}

class _ExpandableListView(viewGroup: android.widget.ExpandableListView, ctx: android.app.Activity): _Container<android.widget.ExpandableListView>(viewGroup, ctx) {

}

