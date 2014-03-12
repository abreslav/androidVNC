package com.example.adsl

import android.view.ContextMenu
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.*
import android.content.Context
import android.widget.*
import android.app.AlertDialog
import android.widget.LinearLayout.LayoutParams
import android.view.View 


import java.util.HashMap
import java.util.ArrayList

open class _Container<out T: android.view.ViewGroup>(open val viewGroup: T,
                 open val ctx: android.app.Activity) {

    var _style: ((X: Any) -> Unit) = {}

    val listenerLambdasMap = HashMap<String, ArrayList<() -> Unit>>()
    val listenerMap = HashMap<String, Any?>()

    fun style(init: (X: Any) -> Unit) {
        this._style = init
    }

    fun alertDialog(title: String, func: AlertDialog.Builder.() -> Unit) {
        val builder = AlertDialog.Builder(ctx)
        builder.setTitle(title)
        builder.func()
        return builder.create()?.show()
    }

    fun android.inputmethodservice.KeyboardView.onPress(l: (Int) -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._onPress = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.onRelease(l: (Int) -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._onRelease = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.onKey(l: (Int, IntArray?) -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._onKey = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.onText(l: (CharSequence?) -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._onText = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.swipeLeft(l: () -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._swipeLeft = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.swipeRight(l: () -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._swipeRight = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.swipeDown(l: () -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._swipeDown = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun android.inputmethodservice.KeyboardView.swipeUp(l: () -> Unit) {
        var listenerClass = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
        if (listenerClass == null) {
            listenerClass = __KeyboardViewOnKeyboardActionListener()
        }
        listenerClass!!._swipeUp = l
        listenerMap.put("android.inputmethodservice.KeyboardViewOnKeyboardActionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.inputmethodservice.KeyboardView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.inputmethodservice.KeyboardViewOnKeyboardActionListener") as? __KeyboardViewOnKeyboardActionListener
            if (wrapper != null) {
                val listener = object: android.inputmethodservice.KeyboardView.OnKeyboardActionListener {
                    override fun onPress(p0: Int): Unit {
                        return wrapper._onPress(p0)
                    }
                    override fun onRelease(p0: Int): Unit {
                        return wrapper._onRelease(p0)
                    }
                    override fun onKey(p0: Int, p1: IntArray?): Unit {
                        return wrapper._onKey(p0, p1!!)
                    }
                    override fun onText(p0: CharSequence?): Unit {
                        return wrapper._onText(p0!!)
                    }
                    override fun swipeLeft(): Unit {
                        return wrapper._swipeLeft()
                    }
                    override fun swipeRight(): Unit {
                        return wrapper._swipeRight()
                    }
                    override fun swipeDown(): Unit {
                        return wrapper._swipeDown()
                    }
                    override fun swipeUp(): Unit {
                        return wrapper._swipeUp()
                    }
                }
                setOnKeyboardActionListener(listener)
                }
            })
        }

    fun keyboardView(attrs: android.util.AttributeSet?,  init: android.inputmethodservice.KeyboardView.() -> Unit): android.inputmethodservice.KeyboardView {
        val v = android.inputmethodservice.KeyboardView(ctx, attrs!!)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.inputmethodservice.KeyboardView")?.forEach { it() }
        return v
    }

    fun mediaRouteButton( init: android.app.MediaRouteButton.() -> Unit): android.app.MediaRouteButton {
        val v = android.app.MediaRouteButton(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.app.MediaRouteButton")?.forEach { it() }
        return v
    }

    fun viewStub( init: android.view.ViewStub.() -> Unit): android.view.ViewStub {
        val v = android.view.ViewStub(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.view.ViewStub")?.forEach { it() }
        return v
    }

    fun android.view.ViewGroup.onChildViewAdded(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.view.ViewGroupOnHierarchyChangeListener") as? __ViewGroupOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __ViewGroupOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewAdded = l
        listenerMap.put("android.view.ViewGroupOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.view.ViewGroup", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.view.ViewGroupOnHierarchyChangeListener") as? __ViewGroupOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    fun android.view.ViewGroup.onChildViewRemoved(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.view.ViewGroupOnHierarchyChangeListener") as? __ViewGroupOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __ViewGroupOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewRemoved = l
        listenerMap.put("android.view.ViewGroupOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.view.ViewGroup", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.view.ViewGroupOnHierarchyChangeListener") as? __ViewGroupOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    fun surfaceView( init: android.view.SurfaceView.() -> Unit): android.view.SurfaceView {
        val v = android.view.SurfaceView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.view.SurfaceView")?.forEach { it() }
        return v
    }

    fun textureView( init: android.view.TextureView.() -> Unit): android.view.TextureView {
        val v = android.view.TextureView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.view.TextureView")?.forEach { it() }
        return v
    }

    fun analogClock( init: android.widget.AnalogClock.() -> Unit): android.widget.AnalogClock {
        val v = android.widget.AnalogClock(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.AnalogClock")?.forEach { it() }
        return v
    }

    fun textView( init: android.widget.TextView.() -> Unit): android.widget.TextView {
        val v = android.widget.TextView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.TextView")?.forEach { it() }
        return v
    }

    fun textView(text: CharSequence?,  init: android.widget.TextView.() -> Unit): android.widget.TextView {
        val v = android.widget.TextView(ctx)
        v.text = text
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.TextView")?.forEach { it() }
        return v
    }

    fun imageView( init: android.widget.ImageView.() -> Unit): android.widget.ImageView {
        val v = android.widget.ImageView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.ImageView")?.forEach { it() }
        return v
    }

    fun progressBar( init: android.widget.ProgressBar.() -> Unit): android.widget.ProgressBar {
        val v = android.widget.ProgressBar(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.ProgressBar")?.forEach { it() }
        return v
    }

    fun space( init: android.widget.Space.() -> Unit): android.widget.Space {
        val v = android.widget.Space(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.Space")?.forEach { it() }
        return v
    }

    //container function
    fun fragmentBreadCrumbs( init: _FragmentBreadCrumbs.() -> Unit): _FragmentBreadCrumbs {
        val v = _FragmentBreadCrumbs(android.app.FragmentBreadCrumbs(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.app.FragmentBreadCrumbs")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun relativeLayout( init: _RelativeLayout.() -> Unit): _RelativeLayout {
        val v = _RelativeLayout(android.widget.RelativeLayout(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.RelativeLayout")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun absoluteLayout( init: _AbsoluteLayout.() -> Unit): _AbsoluteLayout {
        val v = _AbsoluteLayout(android.widget.AbsoluteLayout(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.AbsoluteLayout")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun android.widget.SlidingDrawer.onScrollStarted(l: () -> Unit) {
        var listenerClass = listenerMap.get("android.widget.SlidingDrawerOnDrawerScrollListener") as? __SlidingDrawerOnDrawerScrollListener
        if (listenerClass == null) {
            listenerClass = __SlidingDrawerOnDrawerScrollListener()
        }
        listenerClass!!._onScrollStarted = l
        listenerMap.put("android.widget.SlidingDrawerOnDrawerScrollListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SlidingDrawer", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SlidingDrawerOnDrawerScrollListener") as? __SlidingDrawerOnDrawerScrollListener
            if (wrapper != null) {
                val listener = object: android.widget.SlidingDrawer.OnDrawerScrollListener {
                    override fun onScrollStarted(): Unit {
                        return wrapper._onScrollStarted()
                    }
                    override fun onScrollEnded(): Unit {
                        return wrapper._onScrollEnded()
                    }
                }
                setOnDrawerScrollListener(listener)
                }
            })
        }

    fun android.widget.SlidingDrawer.onScrollEnded(l: () -> Unit) {
        var listenerClass = listenerMap.get("android.widget.SlidingDrawerOnDrawerScrollListener") as? __SlidingDrawerOnDrawerScrollListener
        if (listenerClass == null) {
            listenerClass = __SlidingDrawerOnDrawerScrollListener()
        }
        listenerClass!!._onScrollEnded = l
        listenerMap.put("android.widget.SlidingDrawerOnDrawerScrollListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SlidingDrawer", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SlidingDrawerOnDrawerScrollListener") as? __SlidingDrawerOnDrawerScrollListener
            if (wrapper != null) {
                val listener = object: android.widget.SlidingDrawer.OnDrawerScrollListener {
                    override fun onScrollStarted(): Unit {
                        return wrapper._onScrollStarted()
                    }
                    override fun onScrollEnded(): Unit {
                        return wrapper._onScrollEnded()
                    }
                }
                setOnDrawerScrollListener(listener)
                }
            })
        }

    //container function
    fun slidingDrawer(attrs: android.util.AttributeSet?,  init: _SlidingDrawer.() -> Unit): _SlidingDrawer {
        val v = _SlidingDrawer(android.widget.SlidingDrawer(ctx, attrs!!), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.SlidingDrawer")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun frameLayout( init: _FrameLayout.() -> Unit): _FrameLayout {
        val v = _FrameLayout(android.widget.FrameLayout(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.FrameLayout")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun android.widget.AdapterView<out android.widget.Adapter?>.onItemSelected(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.AdapterView<out android.widget.Adapter?>OnItemSelectedListener") as? __AdapterViewOnItemSelectedListener
        if (listenerClass == null) {
            listenerClass = __AdapterViewOnItemSelectedListener()
        }
        listenerClass!!._onItemSelected = l
        listenerMap.put("android.widget.AdapterView<out android.widget.Adapter?>OnItemSelectedListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.AdapterView<out android.widget.Adapter?>", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.AdapterView<out android.widget.Adapter?>OnItemSelectedListener") as? __AdapterViewOnItemSelectedListener
            if (wrapper != null) {
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
            })
        }

    fun android.widget.AdapterView<out android.widget.Adapter?>.onNothingSelected(l: (android.widget.AdapterView<*>?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.AdapterView<out android.widget.Adapter?>OnItemSelectedListener") as? __AdapterViewOnItemSelectedListener
        if (listenerClass == null) {
            listenerClass = __AdapterViewOnItemSelectedListener()
        }
        listenerClass!!._onNothingSelected = l
        listenerMap.put("android.widget.AdapterView<out android.widget.Adapter?>OnItemSelectedListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.AdapterView<out android.widget.Adapter?>", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.AdapterView<out android.widget.Adapter?>OnItemSelectedListener") as? __AdapterViewOnItemSelectedListener
            if (wrapper != null) {
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
            })
        }

    //container function
    fun linearLayout( init: _LinearLayout.() -> Unit): _LinearLayout {
        val v = _LinearLayout(android.widget.LinearLayout(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.LinearLayout")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun vertical(width: Int = MATCH_PARENT, height: Int = WRAP_CONTENT, init: _LinearLayout.() -> Unit): _LinearLayout {
        return linearLayout {
            init()
            viewGroup.layoutParams(width, height)
            orientation = LinearLayout.VERTICAL
        }
    }

    fun horizontal(width: Int = MATCH_PARENT, height: Int = WRAP_CONTENT, init: _LinearLayout.() -> Unit): _LinearLayout {
        return linearLayout {
            init()
            viewGroup.layoutParams(width, height)
            orientation = LinearLayout.HORIZONTAL
        }
    }

    //container function
    fun gridLayout( init: _GridLayout.() -> Unit): _GridLayout {
        val v = _GridLayout(android.widget.GridLayout(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.GridLayout")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun gLSurfaceView( init: android.opengl.GLSurfaceView.() -> Unit): android.opengl.GLSurfaceView {
        val v = android.opengl.GLSurfaceView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.opengl.GLSurfaceView")?.forEach { it() }
        return v
    }

    fun rSSurfaceView( init: android.renderscript.RSSurfaceView.() -> Unit): android.renderscript.RSSurfaceView {
        val v = android.renderscript.RSSurfaceView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.renderscript.RSSurfaceView")?.forEach { it() }
        return v
    }

    fun videoView( init: android.widget.VideoView.() -> Unit): android.widget.VideoView {
        val v = android.widget.VideoView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.VideoView")?.forEach { it() }
        return v
    }

    fun rSTextureView( init: android.renderscript.RSTextureView.() -> Unit): android.renderscript.RSTextureView {
        val v = android.renderscript.RSTextureView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.renderscript.RSTextureView")?.forEach { it() }
        return v
    }

    fun digitalClock( init: android.widget.DigitalClock.() -> Unit): android.widget.DigitalClock {
        val v = android.widget.DigitalClock(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.DigitalClock")?.forEach { it() }
        return v
    }

    fun checkedTextView( init: android.widget.CheckedTextView.() -> Unit): android.widget.CheckedTextView {
        val v = android.widget.CheckedTextView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.CheckedTextView")?.forEach { it() }
        return v
    }

    fun chronometer( init: android.widget.Chronometer.() -> Unit): android.widget.Chronometer {
        val v = android.widget.Chronometer(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.Chronometer")?.forEach { it() }
        return v
    }

    fun button( init: android.widget.Button.() -> Unit): android.widget.Button {
        val v = android.widget.Button(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.Button")?.forEach { it() }
        return v
    }

    fun button(text: CharSequence?,  init: android.widget.Button.() -> Unit): android.widget.Button {
        val v = android.widget.Button(ctx)
        v.text = text
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.Button")?.forEach { it() }
        return v
    }

    fun editText( init: android.widget.EditText.() -> Unit): android.widget.EditText {
        val v = android.widget.EditText(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.EditText")?.forEach { it() }
        return v
    }

    fun imageButton( init: android.widget.ImageButton.() -> Unit): android.widget.ImageButton {
        val v = android.widget.ImageButton(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.ImageButton")?.forEach { it() }
        return v
    }

    fun quickContactBadge( init: android.widget.QuickContactBadge.() -> Unit): android.widget.QuickContactBadge {
        val v = android.widget.QuickContactBadge(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.QuickContactBadge")?.forEach { it() }
        return v
    }

    //container function
    fun twoLineListItem( init: _TwoLineListItem.() -> Unit): _TwoLineListItem {
        val v = _TwoLineListItem(android.widget.TwoLineListItem(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TwoLineListItem")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun dialerFilter( init: _DialerFilter.() -> Unit): _DialerFilter {
        val v = _DialerFilter(android.widget.DialerFilter(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.DialerFilter")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun webView( init: _WebView.() -> Unit): _WebView {
        val v = _WebView(android.webkit.WebView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.webkit.WebView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun appWidgetHostView( init: _AppWidgetHostView.() -> Unit): _AppWidgetHostView {
        val v = _AppWidgetHostView(android.appwidget.AppWidgetHostView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.appwidget.AppWidgetHostView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun gestureOverlayView( init: _GestureOverlayView.() -> Unit): _GestureOverlayView {
        val v = _GestureOverlayView(android.gesture.GestureOverlayView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.gesture.GestureOverlayView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun calendarView( init: _CalendarView.() -> Unit): _CalendarView {
        val v = _CalendarView(android.widget.CalendarView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.CalendarView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun horizontalScrollView( init: _HorizontalScrollView.() -> Unit): _HorizontalScrollView {
        val v = _HorizontalScrollView(android.widget.HorizontalScrollView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.HorizontalScrollView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun scrollView( init: _ScrollView.() -> Unit): _ScrollView {
        val v = _ScrollView(android.widget.ScrollView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ScrollView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun datePicker( init: _DatePicker.() -> Unit): _DatePicker {
        val v = _DatePicker(android.widget.DatePicker(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.DatePicker")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun timePicker( init: _TimePicker.() -> Unit): _TimePicker {
        val v = _TimePicker(android.widget.TimePicker(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TimePicker")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun tabHost( init: _TabHost.() -> Unit): _TabHost {
        val v = _TabHost(android.widget.TabHost(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TabHost")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun viewAnimator( init: _ViewAnimator.() -> Unit): _ViewAnimator {
        val v = _ViewAnimator(android.widget.ViewAnimator(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ViewAnimator")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun mediaController( init: _MediaController.() -> Unit): _MediaController {
        val v = _MediaController(android.widget.MediaController(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.MediaController")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun android.widget.AbsListView.onScrollStateChanged(l: (android.widget.AbsListView?, Int) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.AbsListViewOnScrollListener") as? __AbsListViewOnScrollListener
        if (listenerClass == null) {
            listenerClass = __AbsListViewOnScrollListener()
        }
        listenerClass!!._onScrollStateChanged = l
        listenerMap.put("android.widget.AbsListViewOnScrollListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.AbsListView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.AbsListViewOnScrollListener") as? __AbsListViewOnScrollListener
            if (wrapper != null) {
                val listener = object: android.widget.AbsListView.OnScrollListener {
                    override fun onScrollStateChanged(p0: android.widget.AbsListView?, p1: Int): Unit {
                        return wrapper._onScrollStateChanged(p0!!, p1)
                    }
                    override fun onScroll(p0: android.widget.AbsListView, p1: Int, p2: Int, p3: Int): Unit {
                        return wrapper._onScroll(p0!!, p1, p2, p3)
                    }
                }
                setOnScrollListener(listener)
                }
            })
        }

    fun android.widget.AbsListView.onScroll(l: (android.widget.AbsListView?, Int, Int, Int) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.AbsListViewOnScrollListener") as? __AbsListViewOnScrollListener
        if (listenerClass == null) {
            listenerClass = __AbsListViewOnScrollListener()
        }
        listenerClass!!._onScroll = l
        listenerMap.put("android.widget.AbsListViewOnScrollListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.AbsListView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.AbsListViewOnScrollListener") as? __AbsListViewOnScrollListener
            if (wrapper != null) {
                val listener = object: android.widget.AbsListView.OnScrollListener {
                    override fun onScrollStateChanged(p0: android.widget.AbsListView?, p1: Int): Unit {
                        return wrapper._onScrollStateChanged(p0!!, p1)
                    }
                    override fun onScroll(p0: android.widget.AbsListView, p1: Int, p2: Int, p3: Int): Unit {
                        return wrapper._onScroll(p0!!, p1, p2, p3)
                    }
                }
                setOnScrollListener(listener)
                }
            })
        }

    fun android.widget.TableLayout.onChildViewAdded(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.TableLayoutOnHierarchyChangeListener") as? __TableLayoutOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __TableLayoutOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewAdded = l
        listenerMap.put("android.widget.TableLayoutOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.TableLayout", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.TableLayoutOnHierarchyChangeListener") as? __TableLayoutOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    fun android.widget.TableLayout.onChildViewRemoved(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.TableLayoutOnHierarchyChangeListener") as? __TableLayoutOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __TableLayoutOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewRemoved = l
        listenerMap.put("android.widget.TableLayoutOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.TableLayout", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.TableLayoutOnHierarchyChangeListener") as? __TableLayoutOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    //container function
    fun tableLayout( init: _TableLayout.() -> Unit): _TableLayout {
        val v = _TableLayout(android.widget.TableLayout(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TableLayout")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun android.widget.TableRow.onChildViewAdded(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.TableRowOnHierarchyChangeListener") as? __TableRowOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __TableRowOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewAdded = l
        listenerMap.put("android.widget.TableRowOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.TableRow", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.TableRowOnHierarchyChangeListener") as? __TableRowOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    fun android.widget.TableRow.onChildViewRemoved(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.TableRowOnHierarchyChangeListener") as? __TableRowOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __TableRowOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewRemoved = l
        listenerMap.put("android.widget.TableRowOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.TableRow", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.TableRowOnHierarchyChangeListener") as? __TableRowOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    //container function
    fun tableRow( init: _TableRow.() -> Unit): _TableRow {
        val v = _TableRow(android.widget.TableRow(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TableRow")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun numberPicker( init: _NumberPicker.() -> Unit): _NumberPicker {
        val v = _NumberPicker(android.widget.NumberPicker(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.NumberPicker")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun tabWidget( init: _TabWidget.() -> Unit): _TabWidget {
        val v = _TabWidget(android.widget.TabWidget(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TabWidget")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun android.widget.RadioGroup.onChildViewAdded(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.RadioGroupOnHierarchyChangeListener") as? __RadioGroupOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __RadioGroupOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewAdded = l
        listenerMap.put("android.widget.RadioGroupOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.RadioGroup", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.RadioGroupOnHierarchyChangeListener") as? __RadioGroupOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    fun android.widget.RadioGroup.onChildViewRemoved(l: (android.view.View?, android.view.View?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.RadioGroupOnHierarchyChangeListener") as? __RadioGroupOnHierarchyChangeListener
        if (listenerClass == null) {
            listenerClass = __RadioGroupOnHierarchyChangeListener()
        }
        listenerClass!!._onChildViewRemoved = l
        listenerMap.put("android.widget.RadioGroupOnHierarchyChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.RadioGroup", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.RadioGroupOnHierarchyChangeListener") as? __RadioGroupOnHierarchyChangeListener
            if (wrapper != null) {
                val listener = object: android.view.ViewGroup.OnHierarchyChangeListener {
                    override fun onChildViewAdded(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewAdded(p0!!, p1!!)
                    }
                    override fun onChildViewRemoved(p0: android.view.View?, p1: android.view.View?): Unit {
                        return wrapper._onChildViewRemoved(p0!!, p1!!)
                    }
                }
                setOnHierarchyChangeListener(listener)
                }
            })
        }

    //container function
    fun radioGroup( init: _RadioGroup.() -> Unit): _RadioGroup {
        val v = _RadioGroup(android.widget.RadioGroup(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.RadioGroup")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun zoomControls( init: _ZoomControls.() -> Unit): _ZoomControls {
        val v = _ZoomControls(android.widget.ZoomControls(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ZoomControls")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun android.widget.SearchView.onQueryTextSubmit(l: (String?) -> Boolean) {
        var listenerClass = listenerMap.get("android.widget.SearchViewOnQueryTextListener") as? __SearchViewOnQueryTextListener
        if (listenerClass == null) {
            listenerClass = __SearchViewOnQueryTextListener()
        }
        listenerClass!!._onQueryTextSubmit = l
        listenerMap.put("android.widget.SearchViewOnQueryTextListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SearchView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SearchViewOnQueryTextListener") as? __SearchViewOnQueryTextListener
            if (wrapper != null) {
                val listener = object: android.widget.SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(p0: String?): Boolean {
                        return wrapper._onQueryTextSubmit(p0!!)
                    }
                    override fun onQueryTextChange(p0: String?): Boolean {
                        return wrapper._onQueryTextChange(p0!!)
                    }
                }
                setOnQueryTextListener(listener)
                }
            })
        }

    fun android.widget.SearchView.onQueryTextChange(l: (String?) -> Boolean) {
        var listenerClass = listenerMap.get("android.widget.SearchViewOnQueryTextListener") as? __SearchViewOnQueryTextListener
        if (listenerClass == null) {
            listenerClass = __SearchViewOnQueryTextListener()
        }
        listenerClass!!._onQueryTextChange = l
        listenerMap.put("android.widget.SearchViewOnQueryTextListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SearchView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SearchViewOnQueryTextListener") as? __SearchViewOnQueryTextListener
            if (wrapper != null) {
                val listener = object: android.widget.SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(p0: String?): Boolean {
                        return wrapper._onQueryTextSubmit(p0!!)
                    }
                    override fun onQueryTextChange(p0: String?): Boolean {
                        return wrapper._onQueryTextChange(p0!!)
                    }
                }
                setOnQueryTextListener(listener)
                }
            })
        }

    fun android.widget.SearchView.onSuggestionSelect(l: (Int) -> Boolean) {
        var listenerClass = listenerMap.get("android.widget.SearchViewOnSuggestionListener") as? __SearchViewOnSuggestionListener
        if (listenerClass == null) {
            listenerClass = __SearchViewOnSuggestionListener()
        }
        listenerClass!!._onSuggestionSelect = l
        listenerMap.put("android.widget.SearchViewOnSuggestionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SearchView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SearchViewOnSuggestionListener") as? __SearchViewOnSuggestionListener
            if (wrapper != null) {
                val listener = object: android.widget.SearchView.OnSuggestionListener {
                    override fun onSuggestionSelect(p0: Int): Boolean {
                        return wrapper._onSuggestionSelect(p0)
                    }
                    override fun onSuggestionClick(p0: Int): Boolean {
                        return wrapper._onSuggestionClick(p0)
                    }
                }
                setOnSuggestionListener(listener)
                }
            })
        }

    fun android.widget.SearchView.onSuggestionClick(l: (Int) -> Boolean) {
        var listenerClass = listenerMap.get("android.widget.SearchViewOnSuggestionListener") as? __SearchViewOnSuggestionListener
        if (listenerClass == null) {
            listenerClass = __SearchViewOnSuggestionListener()
        }
        listenerClass!!._onSuggestionClick = l
        listenerMap.put("android.widget.SearchViewOnSuggestionListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SearchView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SearchViewOnSuggestionListener") as? __SearchViewOnSuggestionListener
            if (wrapper != null) {
                val listener = object: android.widget.SearchView.OnSuggestionListener {
                    override fun onSuggestionSelect(p0: Int): Boolean {
                        return wrapper._onSuggestionSelect(p0)
                    }
                    override fun onSuggestionClick(p0: Int): Boolean {
                        return wrapper._onSuggestionClick(p0)
                    }
                }
                setOnSuggestionListener(listener)
                }
            })
        }

    //container function
    fun searchView( init: _SearchView.() -> Unit): _SearchView {
        val v = _SearchView(android.widget.SearchView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.SearchView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun extractEditText( init: android.inputmethodservice.ExtractEditText.() -> Unit): android.inputmethodservice.ExtractEditText {
        val v = android.inputmethodservice.ExtractEditText(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.inputmethodservice.ExtractEditText")?.forEach { it() }
        return v
    }

    fun android.widget.AutoCompleteTextView.onItemSelected(l: (android.widget.AdapterView<*>?, android.view.View?, Int, Long) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.AutoCompleteTextViewOnItemSelectedListener") as? __AutoCompleteTextViewOnItemSelectedListener
        if (listenerClass == null) {
            listenerClass = __AutoCompleteTextViewOnItemSelectedListener()
        }
        listenerClass!!._onItemSelected = l
        listenerMap.put("android.widget.AutoCompleteTextViewOnItemSelectedListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.AutoCompleteTextView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.AutoCompleteTextViewOnItemSelectedListener") as? __AutoCompleteTextViewOnItemSelectedListener
            if (wrapper != null) {
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
            })
        }

    fun android.widget.AutoCompleteTextView.onNothingSelected(l: (android.widget.AdapterView<*>?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.AutoCompleteTextViewOnItemSelectedListener") as? __AutoCompleteTextViewOnItemSelectedListener
        if (listenerClass == null) {
            listenerClass = __AutoCompleteTextViewOnItemSelectedListener()
        }
        listenerClass!!._onNothingSelected = l
        listenerMap.put("android.widget.AutoCompleteTextViewOnItemSelectedListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.AutoCompleteTextView", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.AutoCompleteTextViewOnItemSelectedListener") as? __AutoCompleteTextViewOnItemSelectedListener
            if (wrapper != null) {
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
            })
        }

    fun autoCompleteTextView( init: android.widget.AutoCompleteTextView.() -> Unit): android.widget.AutoCompleteTextView {
        val v = android.widget.AutoCompleteTextView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.AutoCompleteTextView")?.forEach { it() }
        return v
    }

    fun zoomButton( init: android.widget.ZoomButton.() -> Unit): android.widget.ZoomButton {
        val v = android.widget.ZoomButton(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.ZoomButton")?.forEach { it() }
        return v
    }

    fun android.widget.SeekBar.onProgressChanged(l: (android.widget.SeekBar?, Int, Boolean) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.SeekBarOnSeekBarChangeListener") as? __SeekBarOnSeekBarChangeListener
        if (listenerClass == null) {
            listenerClass = __SeekBarOnSeekBarChangeListener()
        }
        listenerClass!!._onProgressChanged = l
        listenerMap.put("android.widget.SeekBarOnSeekBarChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SeekBar", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SeekBarOnSeekBarChangeListener") as? __SeekBarOnSeekBarChangeListener
            if (wrapper != null) {
                val listener = object: android.widget.SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(p0: android.widget.SeekBar, p1: Int, p2: Boolean): Unit {
                        return wrapper._onProgressChanged(p0!!, p1, p2)
                    }
                    override fun onStartTrackingTouch(p0: android.widget.SeekBar?): Unit {
                        return wrapper._onStartTrackingTouch(p0!!)
                    }
                    override fun onStopTrackingTouch(p0: android.widget.SeekBar): Unit {
                        return wrapper._onStopTrackingTouch(p0!!)
                    }
                }
                setOnSeekBarChangeListener(listener)
                }
            })
        }

    fun android.widget.SeekBar.onStartTrackingTouch(l: (android.widget.SeekBar?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.SeekBarOnSeekBarChangeListener") as? __SeekBarOnSeekBarChangeListener
        if (listenerClass == null) {
            listenerClass = __SeekBarOnSeekBarChangeListener()
        }
        listenerClass!!._onStartTrackingTouch = l
        listenerMap.put("android.widget.SeekBarOnSeekBarChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SeekBar", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SeekBarOnSeekBarChangeListener") as? __SeekBarOnSeekBarChangeListener
            if (wrapper != null) {
                val listener = object: android.widget.SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(p0: android.widget.SeekBar, p1: Int, p2: Boolean): Unit {
                        return wrapper._onProgressChanged(p0!!, p1, p2)
                    }
                    override fun onStartTrackingTouch(p0: android.widget.SeekBar?): Unit {
                        return wrapper._onStartTrackingTouch(p0!!)
                    }
                    override fun onStopTrackingTouch(p0: android.widget.SeekBar): Unit {
                        return wrapper._onStopTrackingTouch(p0!!)
                    }
                }
                setOnSeekBarChangeListener(listener)
                }
            })
        }

    fun android.widget.SeekBar.onStopTrackingTouch(l: (android.widget.SeekBar?) -> Unit) {
        var listenerClass = listenerMap.get("android.widget.SeekBarOnSeekBarChangeListener") as? __SeekBarOnSeekBarChangeListener
        if (listenerClass == null) {
            listenerClass = __SeekBarOnSeekBarChangeListener()
        }
        listenerClass!!._onStopTrackingTouch = l
        listenerMap.put("android.widget.SeekBarOnSeekBarChangeListener", listenerClass)
        val lambdas = listenerLambdasMap.getOrPut("android.widget.SeekBar", { ArrayList() })
        lambdas.add({
            val wrapper = listenerMap.get("android.widget.SeekBarOnSeekBarChangeListener") as? __SeekBarOnSeekBarChangeListener
            if (wrapper != null) {
                val listener = object: android.widget.SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(p0: android.widget.SeekBar, p1: Int, p2: Boolean): Unit {
                        return wrapper._onProgressChanged(p0!!, p1, p2)
                    }
                    override fun onStartTrackingTouch(p0: android.widget.SeekBar?): Unit {
                        return wrapper._onStartTrackingTouch(p0!!)
                    }
                    override fun onStopTrackingTouch(p0: android.widget.SeekBar): Unit {
                        return wrapper._onStopTrackingTouch(p0!!)
                    }
                }
                setOnSeekBarChangeListener(listener)
                }
            })
        }

    fun seekBar( init: android.widget.SeekBar.() -> Unit): android.widget.SeekBar {
        val v = android.widget.SeekBar(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.SeekBar")?.forEach { it() }
        return v
    }

    fun ratingBar( init: android.widget.RatingBar.() -> Unit): android.widget.RatingBar {
        val v = android.widget.RatingBar(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.RatingBar")?.forEach { it() }
        return v
    }

    //container function
    fun viewSwitcher( init: _ViewSwitcher.() -> Unit): _ViewSwitcher {
        val v = _ViewSwitcher(android.widget.ViewSwitcher(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ViewSwitcher")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun viewFlipper( init: _ViewFlipper.() -> Unit): _ViewFlipper {
        val v = _ViewFlipper(android.widget.ViewFlipper(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ViewFlipper")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun listView( init: _ListView.() -> Unit): _ListView {
        val v = _ListView(android.widget.ListView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ListView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun gridView( init: _GridView.() -> Unit): _GridView {
        val v = _GridView(android.widget.GridView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.GridView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun spinner( init: _Spinner.() -> Unit): _Spinner {
        val v = _Spinner(android.widget.Spinner(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.Spinner")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun gallery( init: _Gallery.() -> Unit): _Gallery {
        val v = _Gallery(android.widget.Gallery(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.Gallery")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun adapterViewFlipper( init: _AdapterViewFlipper.() -> Unit): _AdapterViewFlipper {
        val v = _AdapterViewFlipper(android.widget.AdapterViewFlipper(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.AdapterViewFlipper")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun stackView( init: _StackView.() -> Unit): _StackView {
        val v = _StackView(android.widget.StackView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.StackView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    fun checkBox( init: android.widget.CheckBox.() -> Unit): android.widget.CheckBox {
        val v = android.widget.CheckBox(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.CheckBox")?.forEach { it() }
        return v
    }

    fun checkBox(text: CharSequence?,  init: android.widget.CheckBox.() -> Unit): android.widget.CheckBox {
        val v = android.widget.CheckBox(ctx)
        v.text = text
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.CheckBox")?.forEach { it() }
        return v
    }

    fun checkBox(text: CharSequence?, checked: Boolean,  init: android.widget.CheckBox.() -> Unit): android.widget.CheckBox {
        val v = android.widget.CheckBox(ctx)
        v.text = text
        v.checked = checked
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.CheckBox")?.forEach { it() }
        return v
    }

    fun radioButton( init: android.widget.RadioButton.() -> Unit): android.widget.RadioButton {
        val v = android.widget.RadioButton(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.RadioButton")?.forEach { it() }
        return v
    }

    fun toggleButton( init: android.widget.ToggleButton.() -> Unit): android.widget.ToggleButton {
        val v = android.widget.ToggleButton(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.ToggleButton")?.forEach { it() }
        return v
    }

    fun switch( init: android.widget.Switch.() -> Unit): android.widget.Switch {
        val v = android.widget.Switch(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.Switch")?.forEach { it() }
        return v
    }

    fun multiAutoCompleteTextView( init: android.widget.MultiAutoCompleteTextView.() -> Unit): android.widget.MultiAutoCompleteTextView {
        val v = android.widget.MultiAutoCompleteTextView(ctx)
        v.init()
        viewGroup.addView(v)
        _style(v)
        listenerLambdasMap.get("android.widget.MultiAutoCompleteTextView")?.forEach { it() }
        return v
    }

    //container function
    fun textSwitcher( init: _TextSwitcher.() -> Unit): _TextSwitcher {
        val v = _TextSwitcher(android.widget.TextSwitcher(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.TextSwitcher")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun imageSwitcher( init: _ImageSwitcher.() -> Unit): _ImageSwitcher {
        val v = _ImageSwitcher(android.widget.ImageSwitcher(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ImageSwitcher")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

    //container function
    fun expandableListView( init: _ExpandableListView.() -> Unit): _ExpandableListView {
        val v = _ExpandableListView(android.widget.ExpandableListView(ctx), ctx)
        v.init()
        viewGroup.addView(v.viewGroup)
        _style(v)
        listenerLambdasMap.get("android.widget.ExpandableListView")?.forEach { it() }
        v.listenerMap.clear()
        v.listenerLambdasMap.clear()
        return v
    }

}

