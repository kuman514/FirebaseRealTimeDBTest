package com.example.firebaserealtimedbtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 좋아요 화면으로 들어가기
        val fv = findViewById<Button>(R.id.gotoFavScreen)
        fv.setOnClickListener { 
            // 여기에 좋아요 화면으로 들어가는 코드
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }

        // 상세 아이콘 화면으로 들어가기
        val dt = findViewById<Button>(R.id.gotoDetailScreen)
        dt.setOnClickListener {
            // 여기에 상세 아이콘 화면으로 들어가는 코드
            val intent = Intent(this, DetailIconActivity::class.java)
            startActivity(intent)
        }
    }
}
