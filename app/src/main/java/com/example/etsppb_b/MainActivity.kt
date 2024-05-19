package com.example.etsppb_b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.etsppb_b.ui.theme.ETSPPBBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ETSPPBBTheme {
                var currentScreen by remember { mutableStateOf("login") }

                when (currentScreen) {
                    "login" -> LoginScreen { email, password ->
                        // Perform login logic
                        // If login is successful, show the OTP screen
                        currentScreen = "otp"
                    }
                    "otp" -> OTPScreen { otp ->
                        // Handle OTP verification
                        // If OTP is correct, show the transaction success screen
                        if (otp.length == 6) {
                            currentScreen = "success"
                        }
                    }
                    "success" -> TransactionSuccessScreen {
                        // Handle completion, e.g., navigate back to login or home screen
                        currentScreen = "login"
                    }
                }
            }
        }
    }
}