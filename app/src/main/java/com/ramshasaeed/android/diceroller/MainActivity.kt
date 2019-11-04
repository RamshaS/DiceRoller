package com.ramshasaeed.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var img_roll : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_roll: Button = findViewById(R.id.btn_roll)
        img_roll = findViewById(R.id.img_roll)
        btn_roll.setOnClickListener {


            rollDice()
        }
    }

    private fun rollDice() {
        val randomInteger = Random.nextInt(6) +1
        val drawableResource = when(randomInteger){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img_roll.setImageResource(drawableResource)

    }
}
