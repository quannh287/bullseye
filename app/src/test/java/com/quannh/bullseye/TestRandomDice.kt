package com.quannh.bullseye

import org.junit.Test

import org.junit.Assert.*

class TestRandomDice {
    @Test
    fun generate_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()

        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}
