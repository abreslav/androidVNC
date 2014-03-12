package android.androidVNC;
import android.view.ViewGroup.LayoutParams.*
import android.widget.*
import android.view.Gravity.*
import android.widget.LinearLayout.VERTICAL
import android.widget.LinearLayout.HORIZONTAL
import com.example.adsl.*
import kotlin.properties.Delegates
import android.androidVNC.R

class SettingsUI(val act: android.app.Activity) {

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
            vertical {
                viewGroup.setPadding(10,10,10,10)
                vertical {
                    textView(text = "Connection") {
                        setPadding(0,0,10,0)
                        gravity = RIGHT or CENTER_VERTICAL
                        layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }
                    horizontal {
                        buttonGO = button(text = "Connect") {
                            layoutParams {
                                weight = 3.0f
                            }
                        }
                        spinnerConnection = spinner {
                            viewGroup.layoutParams {
                                weight = 1.0f
                            }
                        }.viewGroup
                    }
                }
                scrollView {
                    viewGroup.setVerticalScrollBarEnabled(true)
                    viewGroup.layoutParams(FILL_PARENT, FILL_PARENT)
                    vertical {
                        viewGroup.setPadding(10,10,10,10)
                        tableLayout {
                            viewGroup.setPadding(10,10,10,10)
                            tableRow {
                                textView(text = "Nickname") {
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                textNickname = editText {
                                    setSingleLine()
                                    layoutParams {
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Password") {
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                textPASSWORD = editText {
                                    setSingleLine()
                                    setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                                    layoutParams{
                                        weight = 3.0f
                                    }
                                }
                            }
                            tableRow {
                                checkboxKeepPassword = checkBox(text = "Keep") {
                                    layoutParams(WRAP_CONTENT, WRAP_CONTENT) {
                                        gravity = RIGHT
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Address") {
                                    hint = "localhost"
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                textIP = editText {
                                    setSingleLine()
                                    layoutParams {
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Port") {
                                    gravity = RIGHT or CENTER_VERTICAL
                                    layoutParams
                                    setPadding(0,0,10,0)
                                }
                                textPORT = editText {
                                    setText("5900")
                                    setSingleLine()
                                    layoutParams {
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Username") {
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                textUsername = editText {
                                    hint = "For windows auth"
                                    setSingleLine()
                                    layoutParams{
                                        weight = 1.0f
                                    }
                                }
                            }
                        }
                        textView(text = "Color fmt") {
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT){
                                gravity = LEFT or CENTER_VERTICAL
                            }
                        }
                        colorformat = spinner {}.viewGroup
                        checkboxUseLocalCursor = checkBox(text = "Local mouse pointer") {
                            gravity = LEFT or CENTER_VERTICAL
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                        }
                        vertical {
                            viewGroup.setPadding(10,10,10,10)
                            textView(text = "Force full screen") {
                                layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                            }
                            groupForceFullScreen = radioGroup {
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
                        horizontal {
                            buttonRepeater = button(text = "Repeater") {
                                layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                            }
                            textRepeaterId = textView(text = "No repeater") {
                                gravity = LEFT or CENTER_VERTICAL
                            }
                        }
                        buttonImportExport = button(text = "Import/Export Settings") {
                            layoutParams(WRAP_CONTENT, WRAP_CONTENT)
                        }
                    }
                }
            }
        }
    }
}
