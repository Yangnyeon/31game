package com.example.a31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn1
import java.util.*

class First : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var random = Random()
        var result = 0

        btn1.setOnClickListener {
            var you = edt1.text.toString()
            var random1 = random.nextInt(3) + 1
            result += random1 + you.toString().toInt()
            if(result <= 30) {
                metxt1.setText("당신이 입력한 숫자 : " + you + "\n\n")
                comtxt1.setText("컴퓨터가 입력한 숫자 : " + random1 + "\n\n")
                txt1.setText(result.toString().toInt().toString() + "\n\n")
            } else if(result >= 31) {
                metxt1.setText("당신이 입력한 숫자 : " + you + "\n\n")
                comtxt1.setText("컴퓨터가 입력한 숫자 : " + random1 + "\n\n")
                txt1.setText("31" + "\n" + "게임종료")
            }

        }

    }
}
