package com.example.firebaserealtimedbtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class FavoriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        // 좋아요 버튼
        val like = findViewById<ImageButton>(R.id.buttonLike)
        like.setOnClickListener {
            // 여기에 좋아요를 누르면 "I like this place!" 라는 문구와 함께 좋아요 화면을 나간다.
            Toast.makeText(this, "I like this place!", Toast.LENGTH_SHORT)
            finish()
        }

        // 관광지 이미지
        val placeImg = findViewById<ImageView>(R.id.placePreview)
            // 여기에 관광지 이미지 띄우기

        // 관광지 이름
        val placeName = findViewById<TextView>(R.id.placeName)
            // 관광지 이름 설정
        
        // 관광지 설명
        val placeDesc = findViewById<TextView>(R.id.placeDescription)
            // 관광지 설명 설정
    }
}