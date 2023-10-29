package com.example.gmailpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fromText = "\u2709\ufe0f From Zero Day Initiative"
        // Inside the loop
        val items = List(28) { index ->
            ItemModel(
                fromText,
                "Congratulations to Team Viettel @vcslab for winning Master of Pwn with $180K and 30 points. We'll see you at Pwn2Own Automotive in Tokyo next January.",
                "10:37 AM",
                resources.getIdentifier("thezdi", "drawable", packageName)
            )
        }
        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }


}