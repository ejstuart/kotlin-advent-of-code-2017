fun main() {
    fun part1(input: List<String>): Int {
        val captcha: String = input[0]
        var sum: Int = 0
        val next: Int = 1

        for ((counter, c) in captcha.withIndex()) {

            if ((counter + next) >= captcha.length) {
                if (c == captcha[(counter + next) - captcha.length]) sum += c.digitToInt()
            }else {
                if (c == captcha[counter + next]) sum += c.digitToInt()
            }
        }

        return sum
    }

    fun part2(input: List<String>): Int {

        val captcha: String = input[0]
        var sum: Int = 0
        val next: Int = captcha.length/2

        for ((counter, c) in captcha.withIndex()) {

            if ((counter + next) < captcha.length) {
                if (c == captcha[counter + next]) sum += (c.digitToInt() * 2)
            }else {
                break
            }
        }
        return sum
    }

//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01_test")
    part1(input).println()
    part2(input).println()


}
