package com.example.jonathan.testruntimepermissions

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun OpenSettingsButton(context: Context) {
    Button(onClick = {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
            data = Uri.fromParts("package", "com.example.jonathan.testruntimepermissions", null)
        }
        context.startActivity(intent)
    }) {
        Text("Open App Settings")
    }
}
