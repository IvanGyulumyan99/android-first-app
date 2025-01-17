package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button);
        rollButton.setOnClickListener {
            rollDice();
        }
    }

    private fun rollDice() {
        val imgView: ImageView = findViewById(R.id.image);
        val res = when (Random.nextInt(6)+1) {
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> {
                R.drawable.empty_dice;
            }
        }
        imgView.setImageResource(res);
    }

    //TODO git
}
