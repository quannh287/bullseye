package com.quannh.bullseye

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quannh.bullseye.databinding.ActivityRandomDiceBinding

class RandomDiceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRandomDiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRandomDiceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val randomDiceValue = binding.randomDiceValue
        val firstDice = Dice(6)
        binding.btnRoll.setOnClickListener{
            randomDiceValue.text = firstDice.roll().toString()
        }
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
