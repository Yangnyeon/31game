package com.example.a31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            var intent = Intent(this, First::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            var intent2 = Intent(this, second::class.java)
            startActivity(intent2)
        }

        btn3.setOnClickListener {
            Toast.makeText(this, "준비중...", Toast.LENGTH_SHORT).show()
        }

    }
}