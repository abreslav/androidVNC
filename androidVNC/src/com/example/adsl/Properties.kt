package com.example.adsl

import android.view.ContextMenu
import android.view.ViewGroup
import android.content.Context
import android.widget.*
import android.app.AlertDialog
import android.widget.LinearLayout.LayoutParams
import android.view.View 


var android.app.MediaRouteButton.routeTypes: Int
    get() = getRouteTypes()
    set(value) = setRouteTypes(value)

val _AppWidgetHostView.appWidgetId: Int
    get() = viewGroup.getAppWidgetId()

val _AppWidgetHostView.appWidgetInfo: android.appwidget.AppWidgetProviderInfo?
    get() = viewGroup.getAppWidgetInfo()

val _GestureOverlayView.currentStroke: java.util.ArrayList<android.gesture.GesturePoint>
    get() = viewGroup.getCurrentStroke()

var _GestureOverlayView.eventsInterceptionEnabled: Boolean
    get() = viewGroup.isEventsInterceptionEnabled()
    set(value) = viewGroup.setEventsInterceptionEnabled(value)

var _GestureOverlayView.fadeEnabled: Boolean
    get() = viewGroup.isFadeEnabled()
    set(value) = viewGroup.setFadeEnabled(value)

var _GestureOverlayView.fadeOffset: Long
    get() = viewGroup.getFadeOffset()
    set(value) = viewGroup.setFadeOffset(value)

var _GestureOverlayView.gesture: android.gesture.Gesture?
    get() = viewGroup.getGesture()
    set(value) = viewGroup.setGesture(value!!)

var _GestureOverlayView.gestureColor: Int
    get() = viewGroup.getGestureColor()
    set(value) = viewGroup.setGestureColor(value)

val _GestureOverlayView.gesturePath: android.graphics.Path?
    get() = viewGroup.getGesturePath()

var _GestureOverlayView.gestureStrokeAngleThreshold: Float
    get() = viewGroup.getGestureStrokeAngleThreshold()
    set(value) = viewGroup.setGestureStrokeAngleThreshold(value)

var _GestureOverlayView.gestureStrokeLengthThreshold: Float
    get() = viewGroup.getGestureStrokeLengthThreshold()
    set(value) = viewGroup.setGestureStrokeLengthThreshold(value)

var _GestureOverlayView.gestureStrokeSquarenessTreshold: Float
    get() = viewGroup.getGestureStrokeSquarenessTreshold()
    set(value) = viewGroup.setGestureStrokeSquarenessTreshold(value)

var _GestureOverlayView.gestureStrokeType: Int
    get() = viewGroup.getGestureStrokeType()
    set(value) = viewGroup.setGestureStrokeType(value)

var _GestureOverlayView.gestureStrokeWidth: Float
    get() = viewGroup.getGestureStrokeWidth()
    set(value) = viewGroup.setGestureStrokeWidth(value)

var _GestureOverlayView.gestureVisible: Boolean
    get() = viewGroup.isGestureVisible()
    set(value) = viewGroup.setGestureVisible(value)

val _GestureOverlayView.gesturing: Boolean
    get() = viewGroup.isGesturing()

var _GestureOverlayView.orientation: Int
    get() = viewGroup.getOrientation()
    set(value) = viewGroup.setOrientation(value)

var _GestureOverlayView.uncertainGestureColor: Int
    get() = viewGroup.getUncertainGestureColor()
    set(value) = viewGroup.setUncertainGestureColor(value)

val android.inputmethodservice.ExtractEditText.focused: Boolean
    get() = isFocused()

val android.inputmethodservice.ExtractEditText.inputMethodTarget: Boolean
    get() = isInputMethodTarget()

var android.inputmethodservice.KeyboardView.keyboard: android.inputmethodservice.Keyboard?
    get() = getKeyboard()
    set(value) = setKeyboard(value!!)

var android.inputmethodservice.KeyboardView.previewEnabled: Boolean
    get() = isPreviewEnabled()
    set(value) = setPreviewEnabled(value)

var android.inputmethodservice.KeyboardView.proximityCorrectionEnabled: Boolean
    get() = isProximityCorrectionEnabled()
    set(value) = setProximityCorrectionEnabled(value)

var android.opengl.GLSurfaceView.debugFlags: Int
    get() = getDebugFlags()
    set(value) = setDebugFlags(value)

var android.opengl.GLSurfaceView.preserveEGLContextOnPause: Boolean
    get() = getPreserveEGLContextOnPause()
    set(value) = setPreserveEGLContextOnPause(value)

var android.opengl.GLSurfaceView.renderMode: Int
    get() = getRenderMode()
    set(value) = setRenderMode(value)

var android.renderscript.RSSurfaceView.renderScriptGL: android.renderscript.RenderScriptGL?
    get() = getRenderScriptGL()
    set(value) = setRenderScriptGL(value!!)

var android.renderscript.RSTextureView.renderScriptGL: android.renderscript.RenderScriptGL?
    get() = getRenderScriptGL()
    set(value) = setRenderScriptGL(value!!)

val android.view.SurfaceView.holder: android.view.SurfaceHolder?
    get() = getHolder()

val android.view.TextureView.available: Boolean
    get() = isAvailable()

val android.view.TextureView.bitmap: android.graphics.Bitmap?
    get() = getBitmap()

val android.view.TextureView.layerType: Int
    get() = getLayerType()

var android.view.TextureView.opaque: Boolean
    get() = isOpaque()
    set(value) = setOpaque(value)

var android.view.TextureView.surfaceTexture: android.graphics.SurfaceTexture?
    get() = getSurfaceTexture()
    set(value) = setSurfaceTexture(value!!)

var android.view.TextureView.surfaceTextureListener: android.view.TextureView.SurfaceTextureListener?
    get() = getSurfaceTextureListener()
    set(value) = setSurfaceTextureListener(value!!)

var android.view.ViewGroup.alwaysDrawnWithCacheEnabled: Boolean
    get() = isAlwaysDrawnWithCacheEnabled()
    set(value) = setAlwaysDrawnWithCacheEnabled(value)

var android.view.ViewGroup.animationCacheEnabled: Boolean
    get() = isAnimationCacheEnabled()
    set(value) = setAnimationCacheEnabled(value)

val android.view.ViewGroup.childCount: Int
    get() = getChildCount()

var android.view.ViewGroup.descendantFocusability: Int
    get() = getDescendantFocusability()
    set(value) = setDescendantFocusability(value)

val android.view.ViewGroup.focusedChild: android.view.View?
    get() = getFocusedChild()

var android.view.ViewGroup.layoutAnimation: android.view.animation.LayoutAnimationController?
    get() = getLayoutAnimation()
    set(value) = setLayoutAnimation(value!!)

var android.view.ViewGroup.layoutAnimationListener: android.view.animation.Animation.AnimationListener?
    get() = getLayoutAnimationListener()
    set(value) = setLayoutAnimationListener(value!!)

var android.view.ViewGroup.layoutTransition: android.animation.LayoutTransition?
    get() = getLayoutTransition()
    set(value) = setLayoutTransition(value!!)

var android.view.ViewGroup.motionEventSplittingEnabled: Boolean
    get() = isMotionEventSplittingEnabled()
    set(value) = setMotionEventSplittingEnabled(value)

var android.view.ViewGroup.persistentDrawingCache: Int
    get() = getPersistentDrawingCache()
    set(value) = setPersistentDrawingCache(value)

var android.view.ViewStub.inflatedId: Int
    get() = getInflatedId()
    set(value) = setInflatedId(value)

var android.view.ViewStub.layoutInflater: android.view.LayoutInflater?
    get() = getLayoutInflater()
    set(value) = setLayoutInflater(value!!)

var android.view.ViewStub.layoutResource: Int
    get() = getLayoutResource()
    set(value) = setLayoutResource(value)

var _WebView.certificate: android.net.http.SslCertificate?
    get() = viewGroup.getCertificate()
    set(value) = viewGroup.setCertificate(value!!)

val _WebView.contentHeight: Int
    get() = viewGroup.getContentHeight()

val _WebView.favicon: android.graphics.Bitmap?
    get() = viewGroup.getFavicon()

val _WebView.hitTestResult: android.webkit.WebView.HitTestResult?
    get() = viewGroup.getHitTestResult()

val _WebView.originalUrl: String?
    get() = viewGroup.getOriginalUrl()

val _WebView.privateBrowsingEnabled: Boolean
    get() = viewGroup.isPrivateBrowsingEnabled()

val _WebView.progress: Int
    get() = viewGroup.getProgress()

val _WebView.scale: Float
    get() = viewGroup.getScale()

val _WebView.settings: android.webkit.WebSettings?
    get() = viewGroup.getSettings()

val _WebView.title: String?
    get() = viewGroup.getTitle()

val _WebView.url: String?
    get() = viewGroup.getUrl()

var android.widget.AbsSeekBar.keyProgressIncrement: Int
    get() = getKeyProgressIncrement()
    set(value) = setKeyProgressIncrement(value)

var android.widget.AbsSeekBar.thumb: android.graphics.drawable.Drawable?
    get() = getThumb()
    set(value) = setThumb(value!!)

var android.widget.AbsSeekBar.thumbOffset: Int
    get() = getThumbOffset()
    set(value) = setThumbOffset(value)

var _AdapterViewFlipper.autoStart: Boolean
    get() = viewGroup.isAutoStart()
    set(value) = viewGroup.setAutoStart(value)

var _AdapterViewFlipper.flipInterval: Int
    get() = viewGroup.getFlipInterval()
    set(value) = viewGroup.setFlipInterval(value)

val _AdapterViewFlipper.flipping: Boolean
    get() = viewGroup.isFlipping()

var android.widget.AutoCompleteTextView.completionHint: CharSequence?
    get() = getCompletionHint()
    set(value) = setCompletionHint(value!!)

var android.widget.AutoCompleteTextView.dropDownAnchor: Int
    get() = getDropDownAnchor()
    set(value) = setDropDownAnchor(value)

val android.widget.AutoCompleteTextView.dropDownBackground: android.graphics.drawable.Drawable?
    get() = getDropDownBackground()

var android.widget.AutoCompleteTextView.dropDownHeight: Int
    get() = getDropDownHeight()
    set(value) = setDropDownHeight(value)

var android.widget.AutoCompleteTextView.dropDownHorizontalOffset: Int
    get() = getDropDownHorizontalOffset()
    set(value) = setDropDownHorizontalOffset(value)

var android.widget.AutoCompleteTextView.dropDownVerticalOffset: Int
    get() = getDropDownVerticalOffset()
    set(value) = setDropDownVerticalOffset(value)

var android.widget.AutoCompleteTextView.dropDownWidth: Int
    get() = getDropDownWidth()
    set(value) = setDropDownWidth(value)

val android.widget.AutoCompleteTextView.itemClickListener: android.widget.AdapterView.OnItemClickListener?
    get() = getItemClickListener()

val android.widget.AutoCompleteTextView.itemSelectedListener: android.widget.AdapterView.OnItemSelectedListener?
    get() = getItemSelectedListener()

var android.widget.AutoCompleteTextView.listSelection: Int
    get() = getListSelection()
    set(value) = setListSelection(value)

var android.widget.AutoCompleteTextView.onItemClickListener: android.widget.AdapterView.OnItemClickListener?
    get() = getOnItemClickListener()
    set(value) = setOnItemClickListener(value!!)

var android.widget.AutoCompleteTextView.onItemSelectedListener: android.widget.AdapterView.OnItemSelectedListener?
    get() = getOnItemSelectedListener()
    set(value) = setOnItemSelectedListener(value!!)

val android.widget.AutoCompleteTextView.performingCompletion: Boolean
    get() = isPerformingCompletion()

val android.widget.AutoCompleteTextView.popupShowing: Boolean
    get() = isPopupShowing()

var android.widget.AutoCompleteTextView.threshold: Int
    get() = getThreshold()
    set(value) = setThreshold(value)

var android.widget.AutoCompleteTextView.validator: android.widget.AutoCompleteTextView.Validator?
    get() = getValidator()
    set(value) = setValidator(value!!)

var _CalendarView.date: Long
    get() = viewGroup.getDate()
    set(value) = viewGroup.setDate(value)

var _CalendarView.dateTextAppearance: Int
    get() = viewGroup.getDateTextAppearance()
    set(value) = viewGroup.setDateTextAppearance(value)

var _CalendarView.enabled: Boolean
    get() = viewGroup.isEnabled()
    set(value) = viewGroup.setEnabled(value)

var _CalendarView.firstDayOfWeek: Int
    get() = viewGroup.getFirstDayOfWeek()
    set(value) = viewGroup.setFirstDayOfWeek(value)

var _CalendarView.focusedMonthDateColor: Int
    get() = viewGroup.getFocusedMonthDateColor()
    set(value) = viewGroup.setFocusedMonthDateColor(value)

var _CalendarView.maxDate: Long
    get() = viewGroup.getMaxDate()
    set(value) = viewGroup.setMaxDate(value)

var _CalendarView.minDate: Long
    get() = viewGroup.getMinDate()
    set(value) = viewGroup.setMinDate(value)

var _CalendarView.selectedDateVerticalBar: android.graphics.drawable.Drawable?
    get() = viewGroup.getSelectedDateVerticalBar()
    set(value) = viewGroup.setSelectedDateVerticalBar(value!!)

var _CalendarView.selectedWeekBackgroundColor: Int
    get() = viewGroup.getSelectedWeekBackgroundColor()
    set(value) = viewGroup.setSelectedWeekBackgroundColor(value)

var _CalendarView.showWeekNumber: Boolean
    get() = viewGroup.getShowWeekNumber()
    set(value) = viewGroup.setShowWeekNumber(value)

var _CalendarView.shownWeekCount: Int
    get() = viewGroup.getShownWeekCount()
    set(value) = viewGroup.setShownWeekCount(value)

var _CalendarView.unfocusedMonthDateColor: Int
    get() = viewGroup.getUnfocusedMonthDateColor()
    set(value) = viewGroup.setUnfocusedMonthDateColor(value)

var _CalendarView.weekDayTextAppearance: Int
    get() = viewGroup.getWeekDayTextAppearance()
    set(value) = viewGroup.setWeekDayTextAppearance(value)

var _CalendarView.weekNumberColor: Int
    get() = viewGroup.getWeekNumberColor()
    set(value) = viewGroup.setWeekNumberColor(value)

var _CalendarView.weekSeparatorLineColor: Int
    get() = viewGroup.getWeekSeparatorLineColor()
    set(value) = viewGroup.setWeekSeparatorLineColor(value)

var android.widget.CheckedTextView.checkMarkDrawable: android.graphics.drawable.Drawable?
    get() = getCheckMarkDrawable()
    set(value) = setCheckMarkDrawable(value!!)

var android.widget.CheckedTextView.checked: Boolean
    get() = isChecked()
    set(value) = setChecked(value)

var android.widget.Chronometer.base: Long
    get() = getBase()
    set(value) = setBase(value)

var android.widget.Chronometer.format: String?
    get() = getFormat()
    set(value) = setFormat(value!!)

var android.widget.Chronometer.onChronometerTickListener: android.widget.Chronometer.OnChronometerTickListener?
    get() = getOnChronometerTickListener()
    set(value) = setOnChronometerTickListener(value!!)

var android.widget.CompoundButton.checked: Boolean
    get() = isChecked()
    set(value) = setChecked(value)

val _DatePicker.calendarView: android.widget.CalendarView?
    get() = viewGroup.getCalendarView()

var _DatePicker.calendarViewShown: Boolean
    get() = viewGroup.getCalendarViewShown()
    set(value) = viewGroup.setCalendarViewShown(value)

val _DatePicker.dayOfMonth: Int
    get() = viewGroup.getDayOfMonth()

var _DatePicker.enabled: Boolean
    get() = viewGroup.isEnabled()
    set(value) = viewGroup.setEnabled(value)

var _DatePicker.maxDate: Long
    get() = viewGroup.getMaxDate()
    set(value) = viewGroup.setMaxDate(value)

var _DatePicker.minDate: Long
    get() = viewGroup.getMinDate()
    set(value) = viewGroup.setMinDate(value)

val _DatePicker.month: Int
    get() = viewGroup.getMonth()

var _DatePicker.spinnersShown: Boolean
    get() = viewGroup.getSpinnersShown()
    set(value) = viewGroup.setSpinnersShown(value)

val _DatePicker.year: Int
    get() = viewGroup.getYear()

val _DialerFilter.digits: CharSequence?
    get() = viewGroup.getDigits()

val _DialerFilter.filterText: CharSequence?
    get() = viewGroup.getFilterText()

val _DialerFilter.letters: CharSequence?
    get() = viewGroup.getLetters()

var _DialerFilter.mode: Int
    get() = viewGroup.getMode()
    set(value) = viewGroup.setMode(value)

val _DialerFilter.qwertyKeyboard: Boolean
    get() = viewGroup.isQwertyKeyboard()

val android.widget.EditText.text: android.text.Editable?
    get() = getText()


var _ExpandableListView.adapter: android.widget.ListAdapter?
    get() = viewGroup.getAdapter()
    set(value) = viewGroup.setAdapter(value!!)

val _ExpandableListView.expandableListAdapter: android.widget.ExpandableListAdapter?
    get() = viewGroup.getExpandableListAdapter()

val _ExpandableListView.selectedId: Long
    get() = viewGroup.getSelectedId()

val _ExpandableListView.selectedPosition: Long
    get() = viewGroup.getSelectedPosition()

val _FrameLayout.considerGoneChildrenWhenMeasuring: Boolean
    get() = viewGroup.getConsiderGoneChildrenWhenMeasuring()

var _FrameLayout.foreground: android.graphics.drawable.Drawable?
    get() = viewGroup.getForeground()
    set(value) = viewGroup.setForeground(value!!)

var _FrameLayout.foregroundGravity: Int
    get() = viewGroup.getForegroundGravity()
    set(value) = viewGroup.setForegroundGravity(value)

var _FrameLayout.measureAllChildren: Boolean
    get() = viewGroup.getMeasureAllChildren()
    set(value) = viewGroup.setMeasureAllChildren(value)

var _GridLayout.alignmentMode: Int
    get() = viewGroup.getAlignmentMode()
    set(value) = viewGroup.setAlignmentMode(value)

var _GridLayout.columnCount: Int
    get() = viewGroup.getColumnCount()
    set(value) = viewGroup.setColumnCount(value)

var _GridLayout.columnOrderPreserved: Boolean
    get() = viewGroup.isColumnOrderPreserved()
    set(value) = viewGroup.setColumnOrderPreserved(value)

var _GridLayout.orientation: Int
    get() = viewGroup.getOrientation()
    set(value) = viewGroup.setOrientation(value)

var _GridLayout.rowCount: Int
    get() = viewGroup.getRowCount()
    set(value) = viewGroup.setRowCount(value)

var _GridLayout.rowOrderPreserved: Boolean
    get() = viewGroup.isRowOrderPreserved()
    set(value) = viewGroup.setRowOrderPreserved(value)

var _GridLayout.useDefaultMargins: Boolean
    get() = viewGroup.getUseDefaultMargins()
    set(value) = viewGroup.setUseDefaultMargins(value)

var _GridView.adapter: android.widget.ListAdapter?
    get() = viewGroup.getAdapter()
    set(value) = viewGroup.setAdapter(value!!)

var _GridView.columnWidth: Int
    get() = viewGroup.getColumnWidth()
    set(value) = viewGroup.setColumnWidth(value)

var _GridView.gravity: Int
    get() = viewGroup.getGravity()
    set(value) = viewGroup.setGravity(value)

var _GridView.horizontalSpacing: Int
    get() = viewGroup.getHorizontalSpacing()
    set(value) = viewGroup.setHorizontalSpacing(value)

var _GridView.numColumns: Int
    get() = viewGroup.getNumColumns()
    set(value) = viewGroup.setNumColumns(value)

val _GridView.requestedColumnWidth: Int
    get() = viewGroup.getRequestedColumnWidth()

val _GridView.requestedHorizontalSpacing: Int
    get() = viewGroup.getRequestedHorizontalSpacing()

var _GridView.stretchMode: Int
    get() = viewGroup.getStretchMode()
    set(value) = viewGroup.setStretchMode(value)

var _GridView.verticalSpacing: Int
    get() = viewGroup.getVerticalSpacing()
    set(value) = viewGroup.setVerticalSpacing(value)

var _HorizontalScrollView.fillViewport: Boolean
    get() = viewGroup.isFillViewport()
    set(value) = viewGroup.setFillViewport(value)

val _HorizontalScrollView.maxScrollAmount: Int
    get() = viewGroup.getMaxScrollAmount()

var _HorizontalScrollView.smoothScrollingEnabled: Boolean
    get() = viewGroup.isSmoothScrollingEnabled()
    set(value) = viewGroup.setSmoothScrollingEnabled(value)

var android.widget.ImageView.adjustViewBounds: Boolean
    get() = getAdjustViewBounds()
    set(value) = setAdjustViewBounds(value)

var android.widget.ImageView.baseline: Int
    get() = getBaseline()
    set(value) = setBaseline(value)

var android.widget.ImageView.baselineAlignBottom: Boolean
    get() = getBaselineAlignBottom()
    set(value) = setBaselineAlignBottom(value)

var android.widget.ImageView.colorFilter: android.graphics.ColorFilter?
    get() = getColorFilter()
    set(value) = setColorFilter(value!!)

var android.widget.ImageView.cropToPadding: Boolean
    get() = getCropToPadding()
    set(value) = setCropToPadding(value)

val android.widget.ImageView.drawable: android.graphics.drawable.Drawable?
    get() = getDrawable()

var android.widget.ImageView.imageAlpha: Int
    get() = getImageAlpha()
    set(value) = setImageAlpha(value)

var android.widget.ImageView.imageMatrix: android.graphics.Matrix?
    get() = getImageMatrix()
    set(value) = setImageMatrix(value!!)

var android.widget.ImageView.maxHeight: Int
    get() = getMaxHeight()
    set(value) = setMaxHeight(value)

var android.widget.ImageView.maxWidth: Int
    get() = getMaxWidth()
    set(value) = setMaxWidth(value)

var android.widget.ImageView.scaleType: android.widget.ImageView.ScaleType?
    get() = getScaleType()
    set(value) = setScaleType(value!!)

val _LinearLayout.baseline: Int
    get() = viewGroup.getBaseline()

var _LinearLayout.baselineAligned: Boolean
    get() = viewGroup.isBaselineAligned()
    set(value) = viewGroup.setBaselineAligned(value)

var _LinearLayout.baselineAlignedChildIndex: Int
    get() = viewGroup.getBaselineAlignedChildIndex()
    set(value) = viewGroup.setBaselineAlignedChildIndex(value)

var _LinearLayout.dividerDrawable: android.graphics.drawable.Drawable?
    get() = viewGroup.getDividerDrawable()
    set(value) = viewGroup.setDividerDrawable(value!!)

var _LinearLayout.dividerPadding: Int
    get() = viewGroup.getDividerPadding()
    set(value) = viewGroup.setDividerPadding(value)

var _LinearLayout.measureWithLargestChildEnabled: Boolean
    get() = viewGroup.isMeasureWithLargestChildEnabled()
    set(value) = viewGroup.setMeasureWithLargestChildEnabled(value)

var _LinearLayout.orientation: Int
    get() = viewGroup.getOrientation()
    set(value) = viewGroup.setOrientation(value)

var _LinearLayout.showDividers: Int
    get() = viewGroup.getShowDividers()
    set(value) = viewGroup.setShowDividers(value)

var _LinearLayout.weightSum: Float
    get() = viewGroup.getWeightSum()
    set(value) = viewGroup.setWeightSum(value)

var _ListView.adapter: android.widget.ListAdapter?
    get() = viewGroup.getAdapter()
    set(value) = viewGroup.setAdapter(value!!)

val _ListView.checkItemIds: LongArray?
    get() = viewGroup.getCheckItemIds()

var _ListView.divider: android.graphics.drawable.Drawable?
    get() = viewGroup.getDivider()
    set(value) = viewGroup.setDivider(value!!)

var _ListView.dividerHeight: Int
    get() = viewGroup.getDividerHeight()
    set(value) = viewGroup.setDividerHeight(value)

val _ListView.footerViewsCount: Int
    get() = viewGroup.getFooterViewsCount()

val _ListView.headerViewsCount: Int
    get() = viewGroup.getHeaderViewsCount()

var _ListView.itemsCanFocus: Boolean
    get() = viewGroup.getItemsCanFocus()
    set(value) = viewGroup.setItemsCanFocus(value)

val _ListView.maxScrollAmount: Int
    get() = viewGroup.getMaxScrollAmount()

val _ListView.opaque: Boolean
    get() = viewGroup.isOpaque()

var _ListView.overscrollFooter: android.graphics.drawable.Drawable?
    get() = viewGroup.getOverscrollFooter()
    set(value) = viewGroup.setOverscrollFooter(value!!)

var _ListView.overscrollHeader: android.graphics.drawable.Drawable?
    get() = viewGroup.getOverscrollHeader()
    set(value) = viewGroup.setOverscrollHeader(value!!)

val _MediaController.showing: Boolean
    get() = viewGroup.isShowing()

val _NumberPicker.accessibilityNodeProvider: android.view.accessibility.AccessibilityNodeProvider?
    get() = viewGroup.getAccessibilityNodeProvider()

var _NumberPicker.displayedValues: Array<String>?
    get() = viewGroup.getDisplayedValues()
    set(value) = viewGroup.setDisplayedValues(value!!)

var _NumberPicker.maxValue: Int
    get() = viewGroup.getMaxValue()
    set(value) = viewGroup.setMaxValue(value)

var _NumberPicker.minValue: Int
    get() = viewGroup.getMinValue()
    set(value) = viewGroup.setMinValue(value)

val _NumberPicker.solidColor: Int
    get() = viewGroup.getSolidColor()

var _NumberPicker.value: Int
    get() = viewGroup.getValue()
    set(value) = viewGroup.setValue(value)

var _NumberPicker.wrapSelectorWheel: Boolean
    get() = viewGroup.getWrapSelectorWheel()
    set(value) = viewGroup.setWrapSelectorWheel(value)

var android.widget.ProgressBar.indeterminate: Boolean
    get() = isIndeterminate()
    set(value) = setIndeterminate(value)

var android.widget.ProgressBar.indeterminateDrawable: android.graphics.drawable.Drawable?
    get() = getIndeterminateDrawable()
    set(value) = setIndeterminateDrawable(value!!)

var android.widget.ProgressBar.interpolator: android.view.animation.Interpolator?
    get() = getInterpolator()
    set(value) = setInterpolator(value!!)

var android.widget.ProgressBar.max: Int
    get() = getMax()
    set(value) = setMax(value)

var android.widget.ProgressBar.progress: Int
    get() = getProgress()
    set(value) = setProgress(value)

var android.widget.ProgressBar.progressDrawable: android.graphics.drawable.Drawable?
    get() = getProgressDrawable()
    set(value) = setProgressDrawable(value!!)

var android.widget.ProgressBar.secondaryProgress: Int
    get() = getSecondaryProgress()
    set(value) = setSecondaryProgress(value)

val _RadioGroup.checkedRadioButtonId: Int
    get() = viewGroup.getCheckedRadioButtonId()

val android.widget.RatingBar.indicator: Boolean
    get() = isIndicator()

var android.widget.RatingBar.numStars: Int
    get() = getNumStars()
    set(value) = setNumStars(value)

var android.widget.RatingBar.onRatingBarChangeListener: android.widget.RatingBar.OnRatingBarChangeListener?
    get() = getOnRatingBarChangeListener()
    set(value) = setOnRatingBarChangeListener(value!!)

var android.widget.RatingBar.rating: Float
    get() = getRating()
    set(value) = setRating(value)

var android.widget.RatingBar.stepSize: Float
    get() = getStepSize()
    set(value) = setStepSize(value)

val _RelativeLayout.baseline: Int
    get() = viewGroup.getBaseline()

var _RelativeLayout.gravity: Int
    get() = viewGroup.getGravity()
    set(value) = viewGroup.setGravity(value)

var _ScrollView.fillViewport: Boolean
    get() = viewGroup.isFillViewport()
    set(value) = viewGroup.setFillViewport(value)

val _ScrollView.maxScrollAmount: Int
    get() = viewGroup.getMaxScrollAmount()

var _ScrollView.smoothScrollingEnabled: Boolean
    get() = viewGroup.isSmoothScrollingEnabled()
    set(value) = viewGroup.setSmoothScrollingEnabled(value)

val _SearchView.iconfiedByDefault: Boolean
    get() = viewGroup.isIconfiedByDefault()

var _SearchView.iconified: Boolean
    get() = viewGroup.isIconified()
    set(value) = viewGroup.setIconified(value)

var _SearchView.imeOptions: Int
    get() = viewGroup.getImeOptions()
    set(value) = viewGroup.setImeOptions(value)

var _SearchView.inputType: Int
    get() = viewGroup.getInputType()
    set(value) = viewGroup.setInputType(value)

var _SearchView.maxWidth: Int
    get() = viewGroup.getMaxWidth()
    set(value) = viewGroup.setMaxWidth(value)

val _SearchView.query: CharSequence?
    get() = viewGroup.getQuery()

var _SearchView.queryHint: CharSequence?
    get() = viewGroup.getQueryHint()
    set(value) = viewGroup.setQueryHint(value!!)

var _SearchView.queryRefinementEnabled: Boolean
    get() = viewGroup.isQueryRefinementEnabled()
    set(value) = viewGroup.setQueryRefinementEnabled(value)

var _SearchView.submitButtonEnabled: Boolean
    get() = viewGroup.isSubmitButtonEnabled()
    set(value) = viewGroup.setSubmitButtonEnabled(value)

var _SearchView.suggestionsAdapter: android.widget.CursorAdapter?
    get() = viewGroup.getSuggestionsAdapter()
    set(value) = viewGroup.setSuggestionsAdapter(value!!)

val _SlidingDrawer.content: android.view.View?
    get() = viewGroup.getContent()

val _SlidingDrawer.handle: android.view.View?
    get() = viewGroup.getHandle()

val _SlidingDrawer.moving: Boolean
    get() = viewGroup.isMoving()

val _SlidingDrawer.opened: Boolean
    get() = viewGroup.isOpened()

val _Spinner.baseline: Int
    get() = viewGroup.getBaseline()

var _Spinner.dropDownHorizontalOffset: Int
    get() = viewGroup.getDropDownHorizontalOffset()
    set(value) = viewGroup.setDropDownHorizontalOffset(value)

var _Spinner.dropDownVerticalOffset: Int
    get() = viewGroup.getDropDownVerticalOffset()
    set(value) = viewGroup.setDropDownVerticalOffset(value)

var _Spinner.dropDownWidth: Int
    get() = viewGroup.getDropDownWidth()
    set(value) = viewGroup.setDropDownWidth(value)

var _Spinner.gravity: Int
    get() = viewGroup.getGravity()
    set(value) = viewGroup.setGravity(value)

val _Spinner.popupBackground: android.graphics.drawable.Drawable?
    get() = viewGroup.getPopupBackground()

var _Spinner.prompt: CharSequence?
    get() = viewGroup.getPrompt()
    set(value) = viewGroup.setPrompt(value!!)

val android.widget.Switch.compoundPaddingRight: Int
    get() = getCompoundPaddingRight()

var android.widget.Switch.switchMinWidth: Int
    get() = getSwitchMinWidth()
    set(value) = setSwitchMinWidth(value)

var android.widget.Switch.switchPadding: Int
    get() = getSwitchPadding()
    set(value) = setSwitchPadding(value)

var android.widget.Switch.textOff: CharSequence?
    get() = getTextOff()
    set(value) = setTextOff(value!!)

var android.widget.Switch.textOn: CharSequence?
    get() = getTextOn()
    set(value) = setTextOn(value!!)

var android.widget.Switch.thumbDrawable: android.graphics.drawable.Drawable?
    get() = getThumbDrawable()
    set(value) = setThumbDrawable(value!!)

var android.widget.Switch.thumbTextPadding: Int
    get() = getThumbTextPadding()
    set(value) = setThumbTextPadding(value)

var android.widget.Switch.trackDrawable: android.graphics.drawable.Drawable?
    get() = getTrackDrawable()
    set(value) = setTrackDrawable(value!!)

var _TabHost.currentTab: Int
    get() = viewGroup.getCurrentTab()
    set(value) = viewGroup.setCurrentTab(value)

val _TabHost.currentTabTag: String?
    get() = viewGroup.getCurrentTabTag()

val _TabHost.currentTabView: android.view.View?
    get() = viewGroup.getCurrentTabView()

val _TabHost.currentView: android.view.View?
    get() = viewGroup.getCurrentView()

val _TabHost.tabContentView: android.widget.FrameLayout?
    get() = viewGroup.getTabContentView()

val _TabHost.tabWidget: android.widget.TabWidget?
    get() = viewGroup.getTabWidget()

var _TabWidget.stripEnabled: Boolean
    get() = viewGroup.isStripEnabled()
    set(value) = viewGroup.setStripEnabled(value)

val _TabWidget.tabCount: Int
    get() = viewGroup.getTabCount()

var _TableLayout.shrinkAllColumns: Boolean
    get() = viewGroup.isShrinkAllColumns()
    set(value) = viewGroup.setShrinkAllColumns(value)

var _TableLayout.stretchAllColumns: Boolean
    get() = viewGroup.isStretchAllColumns()
    set(value) = viewGroup.setStretchAllColumns(value)

val _TableRow.virtualChildCount: Int
    get() = viewGroup.getVirtualChildCount()

var android.widget.TextView.autoLinkMask: Int
    get() = getAutoLinkMask()
    set(value) = setAutoLinkMask(value)

val android.widget.TextView.baseline: Int
    get() = getBaseline()

var android.widget.TextView.compoundDrawablePadding: Int
    get() = getCompoundDrawablePadding()
    set(value) = setCompoundDrawablePadding(value)

val android.widget.TextView.compoundDrawables: Array<android.graphics.drawable.Drawable>?
    get() = getCompoundDrawables()

val android.widget.TextView.compoundPaddingBottom: Int
    get() = getCompoundPaddingBottom()

val android.widget.TextView.compoundPaddingLeft: Int
    get() = getCompoundPaddingLeft()

val android.widget.TextView.compoundPaddingRight: Int
    get() = getCompoundPaddingRight()

val android.widget.TextView.compoundPaddingTop: Int
    get() = getCompoundPaddingTop()

val android.widget.TextView.currentHintTextColor: Int
    get() = getCurrentHintTextColor()

val android.widget.TextView.currentTextColor: Int
    get() = getCurrentTextColor()

var android.widget.TextView.cursorVisible: Boolean
    get() = isCursorVisible()
    set(value) = setCursorVisible(value)

var android.widget.TextView.customSelectionActionModeCallback: android.view.ActionMode.Callback?
    get() = getCustomSelectionActionModeCallback()
    set(value) = setCustomSelectionActionModeCallback(value!!)

val android.widget.TextView.editableText: android.text.Editable?
    get() = getEditableText()

var android.widget.TextView.ellipsize: android.text.TextUtils.TruncateAt?
    get() = getEllipsize()
    set(value) = setEllipsize(value!!)

var android.widget.TextView.error: CharSequence?
    get() = getError()
    set(value) = setError(value!!)

val android.widget.TextView.extendedPaddingBottom: Int
    get() = getExtendedPaddingBottom()

val android.widget.TextView.extendedPaddingTop: Int
    get() = getExtendedPaddingTop()

var android.widget.TextView.filters: Array<android.text.InputFilter>?
    get() = getFilters()
    set(value) = setFilters(value!!)

var android.widget.TextView.freezesText: Boolean
    get() = getFreezesText()
    set(value) = setFreezesText(value)

var android.widget.TextView.gravity: Int
    get() = getGravity()
    set(value) = setGravity(value)

var android.widget.TextView.highlightColor: Int
    get() = getHighlightColor()
    set(value) = setHighlightColor(value)

var android.widget.TextView.hint: CharSequence?
    get() = getHint()
    set(value) = setHint(value!!)

val android.widget.TextView.hintTextColors: android.content.res.ColorStateList?
    get() = getHintTextColors()

val android.widget.TextView.imeActionId: Int
    get() = getImeActionId()

val android.widget.TextView.imeActionLabel: CharSequence?
    get() = getImeActionLabel()

var android.widget.TextView.imeOptions: Int
    get() = getImeOptions()
    set(value) = setImeOptions(value)

var android.widget.TextView.includeFontPadding: Boolean
    get() = getIncludeFontPadding()
    set(value) = setIncludeFontPadding(value)

val android.widget.TextView.inputMethodTarget: Boolean
    get() = isInputMethodTarget()

var android.widget.TextView.inputType: Int
    get() = getInputType()
    set(value) = setInputType(value)

var android.widget.TextView.keyListener: android.text.method.KeyListener?
    get() = getKeyListener()
    set(value) = setKeyListener(value!!)

val android.widget.TextView.layout: android.text.Layout?
    get() = getLayout()

val android.widget.TextView.lineCount: Int
    get() = getLineCount()

val android.widget.TextView.lineHeight: Int
    get() = getLineHeight()

val android.widget.TextView.lineSpacingExtra: Float
    get() = getLineSpacingExtra()

val android.widget.TextView.lineSpacingMultiplier: Float
    get() = getLineSpacingMultiplier()

val android.widget.TextView.linkTextColors: android.content.res.ColorStateList?
    get() = getLinkTextColors()

var android.widget.TextView.linksClickable: Boolean
    get() = getLinksClickable()
    set(value) = setLinksClickable(value)

var android.widget.TextView.marqueeRepeatLimit: Int
    get() = getMarqueeRepeatLimit()
    set(value) = setMarqueeRepeatLimit(value)

var android.widget.TextView.maxEms: Int
    get() = getMaxEms()
    set(value) = setMaxEms(value)

var android.widget.TextView.maxHeight: Int
    get() = getMaxHeight()
    set(value) = setMaxHeight(value)

var android.widget.TextView.maxLines: Int
    get() = getMaxLines()
    set(value) = setMaxLines(value)

var android.widget.TextView.maxWidth: Int
    get() = getMaxWidth()
    set(value) = setMaxWidth(value)

var android.widget.TextView.minEms: Int
    get() = getMinEms()
    set(value) = setMinEms(value)

var android.widget.TextView.minHeight: Int
    get() = getMinHeight()
    set(value) = setMinHeight(value)

var android.widget.TextView.minLines: Int
    get() = getMinLines()
    set(value) = setMinLines(value)

var android.widget.TextView.minWidth: Int
    get() = getMinWidth()
    set(value) = setMinWidth(value)

var android.widget.TextView.movementMethod: android.text.method.MovementMethod?
    get() = getMovementMethod()
    set(value) = setMovementMethod(value!!)

val android.widget.TextView.paint: android.text.TextPaint?
    get() = getPaint()

var android.widget.TextView.paintFlags: Int
    get() = getPaintFlags()
    set(value) = setPaintFlags(value)

var android.widget.TextView.privateImeOptions: String?
    get() = getPrivateImeOptions()
    set(value) = setPrivateImeOptions(value!!)

val android.widget.TextView.selectionEnd: Int
    get() = getSelectionEnd()

val android.widget.TextView.selectionStart: Int
    get() = getSelectionStart()

val android.widget.TextView.shadowColor: Int
    get() = getShadowColor()

val android.widget.TextView.shadowDx: Float
    get() = getShadowDx()

val android.widget.TextView.shadowDy: Float
    get() = getShadowDy()

val android.widget.TextView.shadowRadius: Float
    get() = getShadowRadius()

val android.widget.TextView.suggestionsEnabled: Boolean
    get() = isSuggestionsEnabled()

var android.widget.TextView.text: CharSequence?
    get() = getText()
    set(value) = setText(value!!)

val android.widget.TextView.textColors: android.content.res.ColorStateList?
    get() = getTextColors()

var android.widget.TextView.textScaleX: Float
    get() = getTextScaleX()
    set(value) = setTextScaleX(value)

val android.widget.TextView.textSelectable: Boolean
    get() = isTextSelectable()

var android.widget.TextView.textSize: Float
    get() = getTextSize()
    set(value) = setTextSize(value)

val android.widget.TextView.totalPaddingBottom: Int
    get() = getTotalPaddingBottom()

val android.widget.TextView.totalPaddingLeft: Int
    get() = getTotalPaddingLeft()

val android.widget.TextView.totalPaddingRight: Int
    get() = getTotalPaddingRight()

val android.widget.TextView.totalPaddingTop: Int
    get() = getTotalPaddingTop()

var android.widget.TextView.transformationMethod: android.text.method.TransformationMethod?
    get() = getTransformationMethod()
    set(value) = setTransformationMethod(value!!)

var android.widget.TextView.typeface: android.graphics.Typeface?
    get() = getTypeface()
    set(value) = setTypeface(value!!)

val android.widget.TextView.urls: Array<android.text.style.URLSpan>?
    get() = getUrls()

val _TimePicker._24HourView: Boolean
    get() = viewGroup.is24HourView()

val _TimePicker.baseline: Int
    get() = viewGroup.getBaseline()

var _TimePicker.currentHour: Int?
    get() = viewGroup.getCurrentHour()
    set(value) = viewGroup.setCurrentHour(value!!)

var _TimePicker.currentMinute: Int?
    get() = viewGroup.getCurrentMinute()
    set(value) = viewGroup.setCurrentMinute(value!!)

var _TimePicker.enabled: Boolean
    get() = viewGroup.isEnabled()
    set(value) = viewGroup.setEnabled(value)

var android.widget.ToggleButton.textOff: CharSequence?
    get() = getTextOff()
    set(value) = setTextOff(value!!)

var android.widget.ToggleButton.textOn: CharSequence?
    get() = getTextOn()
    set(value) = setTextOn(value!!)

val _TwoLineListItem.text1: android.widget.TextView?
    get() = viewGroup.getText1()

val _TwoLineListItem.text2: android.widget.TextView?
    get() = viewGroup.getText2()

val android.widget.VideoView.bufferPercentage: Int
    get() = getBufferPercentage()

val android.widget.VideoView.currentPosition: Int
    get() = getCurrentPosition()

val android.widget.VideoView.duration: Int
    get() = getDuration()

val android.widget.VideoView.playing: Boolean
    get() = isPlaying()

val _ViewAnimator.baseline: Int
    get() = viewGroup.getBaseline()

val _ViewAnimator.currentView: android.view.View?
    get() = viewGroup.getCurrentView()

var _ViewAnimator.displayedChild: Int
    get() = viewGroup.getDisplayedChild()
    set(value) = viewGroup.setDisplayedChild(value)

var _ViewAnimator.inAnimation: android.view.animation.Animation?
    get() = viewGroup.getInAnimation()
    set(value) = viewGroup.setInAnimation(value!!)

var _ViewAnimator.outAnimation: android.view.animation.Animation?
    get() = viewGroup.getOutAnimation()
    set(value) = viewGroup.setOutAnimation(value!!)

var _ViewFlipper.autoStart: Boolean
    get() = viewGroup.isAutoStart()
    set(value) = viewGroup.setAutoStart(value)

val _ViewFlipper.flipping: Boolean
    get() = viewGroup.isFlipping()

val _ViewSwitcher.nextView: android.view.View?
    get() = viewGroup.getNextView()

