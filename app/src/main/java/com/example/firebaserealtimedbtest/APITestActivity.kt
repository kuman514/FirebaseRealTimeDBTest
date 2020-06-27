package com.example.firebaserealtimedbtest

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_api_test.*
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.net.URL

class APITestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_test)

        sendButton.setOnClickListener {
            // 메시지를 보내고
            DialogflowManager.initAssistant(this, testText.text.toString())

            // 인텐트를 받아오기
            val result = DialogflowManager.detectIntentText(123, testText.text.toString())
            val ft: String = result.fulfillmentText
            val dn: String = result.intent.displayName
            testResult.text = "Message: $ft\nDisplayName: $dn"
        }
    }
}