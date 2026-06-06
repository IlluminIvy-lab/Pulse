package com.pulse.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.pulse.app.ui.PulseTheme
import com.pulse.app.ui.Dashboard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PulseTheme {
                Dashboard()
            }
        }
    }
}
