package com.example.firebaserealtimedbtest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var testFav: Boolean = false
    val PICK_FAV_INTENT = 1
    val PICK_DETAIL_INTENT = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 좋아요 화면으로 들어가기
        val fv = findViewById<Button>(R.id.gotoFavScreen)
        fv.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)

            // 좋아요 여부 인텐트로 넘기기
            intent.putExtra("like", testFav)

            startActivityForResult(intent, PICK_FAV_INTENT)
            //startActivity(intent)
        }

        // 상세 아이콘 화면으로 들어가기
        val dt = findViewById<Button>(R.id.gotoDetailScreen)
        dt.setOnClickListener {
            val intent = Intent(this, DetailIconActivity::class.java)
            //startActivityForResult(intent, PICK_DETAIL_INTENT)
            startActivity(intent)
        }

        // API 테스트하기
        val apiTest = findViewById<Button>(R.id.gotoAPITestScreen)
        apiTest.setOnClickListener {
            val intent = Intent(this, DetailIconActivity::class.java)
            //startActivityForResult(intent, PICK_DETAIL_INTENT)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.d("Debug", "Enter onActivityResult")

        if (requestCode == PICK_FAV_INTENT) {
            if (resultCode == Activity.RESULT_OK) {
                Log.d("Debug", "data = " + data.toString())
                testFav = when(data) {
                    null -> false
                    else -> data.extras!!["like"] as Boolean
                }
            }
        }
    }
}
