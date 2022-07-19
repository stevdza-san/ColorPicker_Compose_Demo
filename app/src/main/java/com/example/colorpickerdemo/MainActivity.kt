package com.example.colorpickerdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.colorpickerdemo.ui.theme.ColorPickerDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorPickerDemoTheme {
//                ColorPicker()
                ImageColorPicker()
            }
        }
    }
}