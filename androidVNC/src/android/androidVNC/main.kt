package android.androidVNC;
import android.view.ViewGroup.LayoutParams.*
import android.widget.*
import android.view.Gravity.*
import android.widget.LinearLayout.VERTICAL
import android.widget.LinearLayout.HORIZONTAL
import com.example.adsl.*
import kotlin.properties.Delegates
import android.androidVNC.R

class Foo(val act: android.app.Activity) {

    var buttonGO: Button by Delegates.notNull()
    var spinnerConnection: Spinner by Delegates.notNull()
    var textNickname: EditText by Delegates.notNull()
    var textPASSWORD: EditText by Delegates.notNull()
    var checkboxKeepPassword: CheckBox by Delegates.notNull()
    var textIP: EditText by Delegates.notNull()
    var textPORT: EditText by Delegates.notNull()
    var textUsername: EditText by Delegates.notNull()
    var colorformat: Spinner by Delegates.notNull()
    var checkboxUseLocalCursor: CheckBox by Delegates.notNull()
    var groupForceFullScreen: RadioGroup by Delegates.notNull()
    var radioForceFullScreenAuto: RadioButton by Delegates.notNull()
    var radioForceFullScreenOn: RadioButton by Delegates.notNull()
    var radioForceFullScreenOff: RadioButton by Delegates.notNull()
    var buttonRepeater: Button by Delegates.notNull()
    var textRepeaterId: TextView by Delegates.notNull()
    var buttonImportExport: Button by Delegates.notNull()

    ;{
        act.UI {
            linearLayout {
                orientation = VERTICAL
                viewGroup.setPadding(10,10,10,10)
                viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                linearLayout {
                    orientation = HORIZONTAL
                    viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                    linearLayout {
                        orientation = VERTICAL
                        viewGroup.layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                        textView(text = "Connection") {
//                            textAppearance = ?android:attr/textAppearanceMedium
                            setPadding(0,0,10,0)
                            gravity = RIGHT or CENTER_VERTICAL
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                        }
                        buttonGO = button(text = "Connect") {
                            setId(R.id.buttonGO)
//                            textAppearance = ?android:attr/textAppearanceMedium
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                        }
                    }
                    spinnerConnection = spinner {
                        viewGroup.setId(R.id.spinnerConnection)
                        viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                    }.viewGroup
                }
//                imageView {
//                    src = @android:drawable/divider_horizontal_bright
//                    layoutParams(WRAP_CONTENT, FILL_PARENT)
//                }
                scrollView {
                    viewGroup.setVerticalScrollBarEnabled(true)
                    viewGroup.layoutParams(FILL_PARENT, FILL_PARENT)
                    linearLayout {
                        orientation = VERTICAL
                        viewGroup.setPadding(10,10,10,10)
                        viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                        tableLayout {
                            viewGroup.setPadding(10,10,10,10)
                            viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                            tableRow {
                                textView(text = "Nickname") {
//                                    textAppearance = ?android:attr/textAppearanceMedium
                                    gravity = RIGHT or CENTER_VERTICAL
                                    layoutParams(FILL_PARENT, WRAP_CONTENT){
                                    }
                                    setPadding(0,0,10,0)
                                }
                                textNickname = editText {
                                    setId(R.id.textNickname)
                                    setSingleLine()
                                    layoutParams(FILL_PARENT, WRAP_CONTENT) {
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Password") {
//                                    textAppearance = ?android:attr/textAppearanceMedium
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                linearLayout {
//                                    orientation = HORIZONTAL
                                    textPASSWORD = editText {
                                        setId(R.id.textPASSWORD)
                                        setSingleLine()
//                                        setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                                        layoutParams(FILL_PARENT, WRAP_CONTENT){
                                            weight = 3.0f
                                        }
//                                        layoutParams(FILL_PARENT, MATCH_PARENT)
                                    }
                                    checkboxKeepPassword = checkBox(text = "Keep") {
                                        setId(R.id.checkboxKeepPassword)
                                        layoutParams(FILL_PARENT, WRAP_CONTENT){
                                            weight = 1.0f
                                        }
                                    }
//                                    viewGroup.layoutParams(MATCH_PARENT, MATCH_PARENT){
                                        //                                            weight = 1.0f
//                                    }
                                    viewGroup.setOrientation(HORIZONTAL)
                                }
                            }
                            tableRow {
                                textView(text = "Address") {
                                    hint = "localhost"
//                                    textAppearance = ?android:attr/textAppearanceMedium
                                    gravity = RIGHT or CENTER_VERTICAL
                                    layoutParams(FILL_PARENT, WRAP_CONTENT) {
                                    }
                                    setPadding(0,0,10,0)
                                }
                                textIP = editText {
                                    setId(R.id.textIP)
                                    setSingleLine()
                                    layoutParams(FILL_PARENT, WRAP_CONTENT) {
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Port") {
//                                    textAppearance = ?android:attr/textAppearanceMedium
                                    gravity = RIGHT or CENTER_VERTICAL
                                    layoutParams(FILL_PARENT, WRAP_CONTENT) {
                                    }
                                    setPadding(0,0,10,0)
                                }
                                textPORT = editText {
                                    setId(R.id.textPORT)
                                    setText("5900")
                                    setSingleLine()
                                    layoutParams(FILL_PARENT, WRAP_CONTENT){
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Username") {
//                                    textAppearance = ?android:attr/textAppearanceMedium
                                    gravity = RIGHT or CENTER_VERTICAL
                                    layoutParams(FILL_PARENT, WRAP_CONTENT) {
                                    }
                                    setPadding(0,0,10,0)
                                }
                                textUsername = editText {
                                    setId(R.id.textUsername)
                                    hint = "For windows auth"
                                    setSingleLine()
                                    layoutParams(FILL_PARENT, WRAP_CONTENT){
                                        weight = 1.0f
                                    }
                                }
                            }
                        }
                        textView(text = "Color fmt") {
//                            textAppearance = ?android:attr/textAppearanceMedium
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT){
                                gravity = LEFT or CENTER_VERTICAL
                            }
                        }
                        colorformat = spinner {
                            viewGroup.setId(R.id.colorformat)
                            viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                        }.viewGroup
                        checkboxUseLocalCursor = checkBox(text = "Local mouse pointer") {
                            setId(R.id.checkboxUseLocalCursor)
                            gravity = LEFT or CENTER_VERTICAL
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT) { }
                        }
                        linearLayout {
                            orientation = HORIZONTAL
                            viewGroup.setPadding(10,10,10,10)
                            viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                            textView(text = "Forece full screen") {
                                layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                            }
                            groupForceFullScreen = radioGroup {
                                viewGroup.setId(R.id.groupForceFullScreen)
                                viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT) {
//                                    orientation = HORIZONTAL
                                }
                                viewGroup.setOrientation(HORIZONTAL)
                                radioForceFullScreenAuto = radioButton {
                                    setId(R.id.radioForceFullScreenAuto)
                                    text = "Auto"
                                    layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                                }
                                radioForceFullScreenOn = radioButton {
                                    setId(R.id.radioForceFullScreenOn)
                                    text = "On"
                                    layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                                }
                                radioForceFullScreenOff = radioButton {
                                    setId(R.id.radioForceFullScreenOff)
                                    text = "Off"
                                    layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                                }
                            }.viewGroup
                        }
                        linearLayout {
                            orientation = HORIZONTAL
                            viewGroup.layoutParams(FILL_PARENT, WRAP_CONTENT)
                            buttonRepeater = button(text = "Repeater") {
                                setId(R.id.buttonRepeater)
                                layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                            }
                            textRepeaterId = textView(text = "No repeater") {
                                setId(R.id.textRepeaterId)
                                gravity = LEFT or CENTER_VERTICAL
                                layoutParams(FILL_PARENT, WRAP_CONTENT) {
                                }
                            }
                        }
                        buttonImportExport = button(text = "Import/Export Settings") {
                            setId(R.id.buttonImportExport)
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                        }
                    }
                }
            }
        }
    }
}
