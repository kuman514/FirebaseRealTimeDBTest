package com.example.firebaserealtimedbtest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_api_test.*
import java.io.BufferedReader
import java.io.InputStreamReader
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
            testResult.text = result.toString()

            // 받아온 인텐트를 파싱
        }
    }
}