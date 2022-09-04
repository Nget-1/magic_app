package com.example.magictestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardList = findViewById<TextView>(R.id.card_list)
        val cardEntry = findViewById<EditText>(R.id.card_entry)
        val addCardButton = findViewById<Button>(R.id.card_entry_button)

        addCardButton.setOnClickListener{
            val newCard = cardEntry.text.toString()
            if(!newCard.isNullOrEmpty()){
                cardList.text = newCard
                cardEntry.setText("")
            }
        }
    }
}