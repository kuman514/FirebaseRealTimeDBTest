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

        val result = findViewById<TextView>(R.id.testResult)

        val Urlstr = "http://api.visitkorea.or.kr/openapi/service/rest/EngService/searchStay?serviceKey="
        val key = ""
        val parm = "&numOfRows=10&pageSize=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&listYN=Y&arrange=A&hanOk=1&_type=json"

        val stream = URL(Urlstr + key + parm).openStream()
        val read = BufferedReader(InputStreamReader(stream, "UTF-8"))

        result.text = read.read().toString()
    }
}