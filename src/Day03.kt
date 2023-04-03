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
     * Literally only works if your number is on the bottom row
     * To be completely honest I just did the math on a whiteboard and wrote this after so I'd have some kind
     * of code to show
     */
    fun part1(input: List<String>): Int {
        val number = input[0].toInt()
        val sidelength = findSidelength(number.toDouble())
        val botRightCorner = sidelength * sidelength
        val difference = botRightCorner - number
        val horizontalTranslation = (sidelength/2)-((sidelength-1)-difference)
        val verticalTranslation = (sidelength-1)/2

        return horizontalTranslation + verticalTranslation
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
