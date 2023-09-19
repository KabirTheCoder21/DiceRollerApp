package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.image)
        val diceRoll = findViewById<TextView>(R.id.diceRoll)

        diceRoll.setOnClickListener {
           var random  = Random.nextInt(6)+1
            when(random)
            {
                1-> image.setImageResource(R.drawable.dice_1)
                2->image.setImageResource(R.drawable.dice_2)
                3->image.setImageResource(R.drawable.dice_3)
                4->image.setImageResource(R.drawable.dice_4)
                5->image.setImageResource(R.drawable.dice_5)
                6->image.setImageResource(R.drawable.dice_6)
                else -> Toast.makeText(this, "select under range", Toast.LENGTH_SHORT).show()
            }
        }
    }
}