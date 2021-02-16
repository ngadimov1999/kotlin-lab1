package main.Generators

import main.Objects.Water
import kotlin.random.Random

class WaterGroupGenerator constructor(minWaterCount: Int, maxWaterCount: Int){
    val minWaterCount = minWaterCount
    val maxWaterCount = maxWaterCount
    val waterCountRandom = (minWaterCount..maxWaterCount).random()

    private fun randomBool(): Boolean {
        return Random.nextBoolean()
    }

    private fun randomTemperature(): Double {
        return Random.nextDouble(-273.15, 500.0)
    }

    private fun randomCondition(): String = List(1) {
        val list:List<String> = listOf("Твердое", "Жидкое", "Газообразное")
        list.random()
    }.joinToString("")

    fun getWaterGroup(): MutableList<Water> {
        val water: MutableList<Water> = mutableListOf()
        for (i in 1..waterCountRandom){
            water.add(Water(randomBool(), randomCondition(), randomTemperature(), randomBool()))
        }
        return water
    }
}