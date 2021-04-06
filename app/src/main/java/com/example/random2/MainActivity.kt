package com.example.random2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            val random = Random.nextInt (10, 99)+1
            textView.text = random.toString()
            count++
            var textView2 = findViewById(R.id.textView2) as TextView
            textView2.text = "Кол-во нажатий: $count"

        }
    }
}