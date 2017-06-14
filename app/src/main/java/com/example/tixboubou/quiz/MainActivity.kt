package com.example.tixboubou.quiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
           // Toast.makeText(this, "Start button tapped", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this, QuestionsActivity::class.java))


        }
    }
}
