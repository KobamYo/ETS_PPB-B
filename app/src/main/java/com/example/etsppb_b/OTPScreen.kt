package com.example.etsppb_b

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OTPScreen(onVerifyClick: (String) -> Unit) {
    var otp1 by remember { mutableStateOf("") }
    var otp2 by remember { mutableStateOf("") }
    var otp3 by remember { mutableStateOf("") }
    var otp4 by remember { mutableStateOf("") }
    var otp5 by remember { mutableStateOf("") }
    var otp6 by remember { mutableStateOf("") }

    val focusRequester1 = remember { FocusRequester() }
    val focusRequester2 = remember { FocusRequester() }
    val focusRequester3 = remember { FocusRequester() }
    val focusRequester4 = remember { FocusRequester() }
    val focusRequester5 = remember { FocusRequester() }
    val focusRequester6 = remember { FocusRequester() }
    val localFocusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Enter OTP", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = otp1,
                onValueChange = {
                    if (it.length <= 1) {
                        otp1 = it
                        if (it.isNotEmpty()) focusRequester2.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(50.dp)
                    .focusRequester(focusRequester1),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = otp2,
                onValueChange = {
                    if (it.length <= 1) {
                        otp2 = it
                        if (it.isNotEmpty()) focusRequester3.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(50.dp)
                    .focusRequester(focusRequester2),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = otp3,
                onValueChange = {
                    if (it.length <= 1) {
                        otp3 = it
                        if (it.isNotEmpty()) focusRequester4.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(50.dp)
                    .focusRequester(focusRequester3),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = otp4,
                onValueChange = {
                    if (it.length <= 1) {
                        otp4 = it
                        if (it.isNotEmpty()) focusRequester5.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(50.dp)
                    .focusRequester(focusRequester4),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = otp5,
                onValueChange = {
                    if (it.length <= 1) {
                        otp5 = it
                        if (it.isNotEmpty()) focusRequester6.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(50.dp)
                    .focusRequester(focusRequester5),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = otp6,
                onValueChange = {
                    if (it.length <= 1) {
                        otp6 = it
                        if (it.isNotEmpty()) localFocusManager.clearFocus()
                    }
                },
                modifier = Modifier
                    .size(50.dp)
                    .focusRequester(focusRequester6),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onVerifyClick(otp1 + otp2 + otp3 + otp4 + otp5 + otp6) }) {
            Text(text = "Verify OTP")
        }
    }
}
