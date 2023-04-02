fun main() {
    fun part1(input: List<String>): Int {
        val captcha: String = input[0]
        var sum: Int = 0

        for ((counter, c) in captcha.withIndex()) {

            if ((counter + 1) >= captcha.length) {
                if (c == captcha[0]) sum += c.digitToInt()
            }else {
                if (c == captcha[counter + 1]) sum += c.digitToInt()
            }
        }

        return sum
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)
//
//    val input = readInput("Day01")
//    part1(input).println()
//    part2(input).println()

    val input = listOf("123456789")
    part1(input).println()

}
