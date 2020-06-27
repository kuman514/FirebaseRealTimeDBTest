package com.example.firebaserealtimedbtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val detailName = findViewById<TextView>(R.id.detailName)
        DialogflowManager.initAssistant(this)
        
        // 불러온 상위 인텐트에서 스트링을 받아와 텍스트 설정하기
        detailName.text = intent.extras!!["itemName"].toString()
    }
}