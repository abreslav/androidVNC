package android.androidVNC;
import android.view.ViewGroup.LayoutParams.*
import android.widget.*
import android.view.Gravity.*
import android.widget.LinearLayout.HORIZONTAL
import com.example.adsl.*
import kotlin.properties.Delegates
import android.text.method.PasswordTransformationMethod
import android.view.View

class SettingsUI(val act: android.app.Activity) {

    var go: Button by Delegates.notNull()
    var connection: Spinner by Delegates.notNull()
    var nickname: EditText by Delegates.notNull()
    var password: EditText by Delegates.notNull()
    var keepPassword: CheckBox by Delegates.notNull()
    var ip: EditText by Delegates.notNull()
    var port: EditText by Delegates.notNull()
    var username: EditText by Delegates.notNull()
    var colorFormat: Spinner by Delegates.notNull()
    var useLocalCursor: CheckBox by Delegates.notNull()
    var forceFullScreenGroup: RadioGroup by Delegates.notNull()
    var forceFullScreenAuto: RadioButton by Delegates.notNull()
    var forceFullScreenOn: RadioButton by Delegates.notNull()
    var forceFullScreenOff: RadioButton by Delegates.notNull()
    var repeater: Button by Delegates.notNull()
    var repeaterId: TextView by Delegates.notNull()
    var importExport: Button by Delegates.notNull();

    {
        act.UI {
            vertical {
                viewGroup.setPadding(10,10,10,10)
                vertical {

                    fun foo(): View {
                        return textView(text = "Connection") {
                            setPadding(0, 0, 10, 0)
                            gravity = RIGHT or CENTER_VERTICAL
                            layoutParams(WRAP_CONTENT)
                        }
                    }
                    horizontal {
                        go = button(text = "Connect") {
                            layoutParams {
                                weight = 3.0f
                            }
                            onClick {
                                // do that stuff
                            }
                        }

                        connection = spinner {
                            viewGroup.layoutParams {
                                weight = 1.0f
                            }
                        }.viewGroup
                    }
                }
                scrollView {
                    viewGroup.setVerticalScrollBarEnabled(true)
                    viewGroup.layoutParams(height = FILL_PARENT)
                    vertical {
                        viewGroup.setPadding(10,10,10,10)
                        tableLayout {
                            viewGroup.setPadding(10,10,10,10)
                            tableRow {
                                textView(text = "Nickname") {
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                nickname = editText {
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
                                password = editText {
                                    setSingleLine()
                                    setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    layoutParams {
                                        weight = 3.0f
                                    }
                                }
                            }
                            tableRow {
                                keepPassword = checkBox(text = "Keep") {
                                    layoutParams(width = WRAP_CONTENT)
                                }
                            }
                            tableRow {
                                textView(text = "Address") {
                                    hint = "localhost"
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                ip = editText {
                                    setSingleLine()
                                    layoutParams {
                                        weight = 1.0f
                                    }
                                }
                            }
                            tableRow {
                                textView(text = "Port") {
                                    gravity = RIGHT or CENTER_VERTICAL
                                    setPadding(0,0,10,0)
                                }
                                port = editText {
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
                                username = editText {
                                    hint = "For windows auth"
                                    setSingleLine()
                                    layoutParams{
                                        weight = 1.0f
                                    }
                                }
                            }
                        }
                        textView(text = "Color fmt") {
                            layoutParams(WRAP_CONTENT) {
                                gravity = LEFT or CENTER_VERTICAL
                            }
                        }
                        colorFormat = spinner {}.viewGroup
                        useLocalCursor = checkBox(text = "Local mouse pointer") {
                            gravity = LEFT or CENTER_VERTICAL
                            layoutParams(WRAP_CONTENT)
                        }
                        vertical {
                            viewGroup.setPadding(10,10,10,10)
                            textView(text = "Force full screen") {
                                layoutParams(WRAP_CONTENT)
                            }
                            forceFullScreenGroup = radioGroup {
                                viewGroup.setOrientation(HORIZONTAL)

                                val labels = listOf("Auto", "On", "Off")
                                for (label in labels) {
                                    radioButton {
                                        text = label
                                        layoutParams(WRAP_CONTENT)
                                    }
                                }
                            }.viewGroup
                        }
                        horizontal {
                            repeater = button(text = "Repeater") {
                                layoutParams(WRAP_CONTENT)
                            }
                            repeaterId = textView(text = "No repeater") {
                                gravity = LEFT or CENTER_VERTICAL
                            }
                        }
                        importExport = button(text = "Import/Export Settings") {
                            layoutParams(WRAP_CONTENT)
                        }
                    }
                }
            }
        }
    }
}
