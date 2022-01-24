package com.example.a31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn1
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var random2 = Random()
        var result2 = 0

        result2 += random2.nextInt(3) + 1
        txt2.append((random2.nextInt(3) + 1).toString() + "\n\n")
        var btn2 = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener {
            var you = edt2.text.toString()
            var random2 = random2.nextInt(3) + 1
            result2 += random2 + you.toString().toInt()
            if(result2 <= 30) {
                metxt2.setText("당신이 입력한 숫자 : " + you + "\n\n")
                comtxt2.setText("컴퓨터가 입력한 숫자 : " + random2 + "\n\n")
                txt2.setText(result2.toString().toInt().toString() + "\n\n")
            } else if(result2 >= 31) {
                txt2.append("게임종료")
            }

        }

    }
}
