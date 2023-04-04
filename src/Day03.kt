import kotlin.math.floor
import kotlin.math.pow

fun main() {

    fun findSidelength(num: Double): Int {
        var sideLength = floor(num.pow(0.5)).toInt()
        if (sideLength % 2 == 0) {
            sideLength += 1
        }else {
            sideLength += 2
        }

        return sideLength
    }

    /**
     *
     */
    fun part1(input: List<String>): Int {
        val number = input[0].toInt()
        val sidelength = findSidelength(number.toDouble())
        val botRightCorner = sidelength * sidelength
        val botLeftCorner = botRightCorner - (sidelength - 1)
        val topLeftCorner = botLeftCorner - (sidelength - 1)
        val topRightCorner = topLeftCorner - (sidelength - 1)
        val lowestPossibleNumber = topRightCorner - (sidelength - 2)

        //Number is on bottom or top row
        if (number > botLeftCorner || ((number < topLeftCorner) && (number > topRightCorner))) {
            val difference = botRightCorner - number
            val horizontalTranslation = (sidelength / 2) - ((sidelength - 1) - difference)
            val verticalTranslation = (sidelength - 1) / 2

            return horizontalTranslation + verticalTranslation
        }

        //Number is on left column
        if (number > topLeftCorner) {
            val difference = botLeftCorner - number
            val verticalTranslation = (sidelength / 2) - ((sidelength - 1) - difference)
            val horizontalTranslation = (sidelength - 1) / 2

            return horizontalTranslation + verticalTranslation
        }



        return 1
    }

    fun part2(input: List<String>): Int {

        return 1
    }

//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day03_test")
    part1(input).println()
//    part2(input).println()


}
