fun main() {

    /**
     * Brute force solution
     */
    fun part1(input: List<String>): Int {
        val maze = input.map { it.toInt() }.toMutableList()
        var index = 0
        var steps = 0

        while (index >= 0 && index < maze.size) {
            val next = maze[index]
            maze[index]++
            index += next
            steps++
        }

        return steps
    }

    /**
     * Also a brute force solution
     */
    fun part2(input: List<String>): Int {
        val maze = input.map { it.toInt() }.toMutableList()
        var index = 0
        var steps = 0

        while (index >= 0 && index < maze.size) {
            val next = maze[index]

            if (next > 2) {
                maze[index]--
            } else {
                maze[index]++
            }

            index += next
            steps++
        }

        return steps
    }




//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day05_test")
    part1(input).println()
    part2(input).println()


}
