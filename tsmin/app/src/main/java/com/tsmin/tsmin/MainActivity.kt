package com.tsmin.tsmin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tsmin.tsmin.databinding.ActivityMainBinding


/**
 * 이 프로젝트는 액티비티 연습을 위한 프로젝트 입니다.
 * 액티비티는 클래스 + xml로 구성 되어있습니다.
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // moveButton01 버튼을 누르면
        binding.moveButton01.setOnClickListener{
            //Toast.makeText(this, "드디어 성공했다.", Toast.LENGTH_SHORT).show()
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"))
            startActivity(intent)
        }
    }
}