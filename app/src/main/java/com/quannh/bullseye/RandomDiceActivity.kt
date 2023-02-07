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
            val rollResult = firstDice.roll()
            randomDiceValue.text = rollResult.toString()
            when(rollResult) {
                1 -> binding.diceImg.setImageResource(R.drawable.dice_1)
                2 -> binding.diceImg.setImageResource(R.drawable.dice_2)
                3 -> binding.diceImg.setImageResource(R.drawable.dice_3)
                4 -> binding.diceImg.setImageResource(R.drawable.dice_4)
                5 -> binding.diceImg.setImageResource(R.drawable.dice_5)
                6 -> binding.diceImg.setImageResource(R.drawable.dice_6)
            }
        }
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
