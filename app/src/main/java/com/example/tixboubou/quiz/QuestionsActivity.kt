package com.example.tixboubou.quiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import kotlinx.android.synthetic.main.activity_questions.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase



class QuestionsActivity : AppCompatActivity() {
    val names: Array<String> = arrayOf("redoine", "mehdi", "hassan", "mohamed")
   val imageUrls = arrayOf<String>()
    var indexName: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_questions)
        var currentName: String = names[indexName]
        tvDisplay.text = currentName

        btnShare.setOnClickListener {
            val sharingIntent = Intent(android.content.Intent.ACTION_SEND)

            sharingIntent.type = "text/plain"
            sharingIntent.putExtra(Intent.EXTRA_TEXT, currentName)

            val chosser = Intent.createChooser(sharingIntent, "shar")

            startActivity(chosser)
        }

        btnNext.setOnClickListener {
            btnBack.isEnabled = true
            if (indexName < names.count() - 1) {
                indexName += 1
                currentName = names[indexName]
                tvDisplay.text = currentName
            } else {
                btnNext.isEnabled = false
            }

        }

        btnBack.setOnClickListener {
            btnNext.isEnabled = true
            if ( indexName != 0 ){
                indexName -= 1
                currentName = names[indexName]
                tvDisplay.text = currentName
            } else {
                btnBack.isEnabled = false
            }

        }

    }



}
