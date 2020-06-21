package com.example.firebaserealtimedbtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class DetailIconActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_icons)

        // 관광지 이름
        val placeName = findViewById<TextView>(R.id.visitingPlaceName)
        
        // 관광명소 버튼
        val lmb = findViewById<ImageButton>(R.id.buttonLandmark)
        lmb.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            // 버튼에 해당하는 아이템명을 하위 인텐트로 보내기
            intent.putExtra("itemName", "Landmarks")

            startActivity(intent)
        }

        // 맛집 버튼
        val rst = findViewById<ImageButton>(R.id.buttonRestaurant)
        rst.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            // 버튼에 해당하는 아이템명을 하위 인텐트로 보내기
            intent.putExtra("itemName", "Restaurants")

            startActivity(intent)
        }

        // 숙소 버튼
        val inn = findViewById<ImageButton>(R.id.buttonInn)
        inn.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            // 버튼에 해당하는 아이템명을 하위 인텐트로 보내기
            intent.putExtra("itemName", "Inns")

            startActivity(intent)
        }

        // 역사 버튼
        val htr = findViewById<ImageButton>(R.id.buttonHistory)
        htr.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            // 버튼에 해당하는 아이템명을 하위 인텐트로 보내기
            intent.putExtra("itemName", "History")

            startActivity(intent)
        }

        // 쇼핑 버튼
        val shp = findViewById<ImageButton>(R.id.buttonShopping)
        shp.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            // 버튼에 해당하는 아이템명을 하위 인텐트로 보내기
            intent.putExtra("itemName", "Shopping")

            startActivity(intent)
        }
        
        // 기타 버튼
        val etc = findViewById<ImageButton>(R.id.buttonOthers)
        etc.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            // 버튼에 해당하는 아이템명을 하위 인텐트로 보내기
            intent.putExtra("itemName", "Others")

            startActivity(intent)
        }
    }
}