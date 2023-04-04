fun main() {


    class CustomIterator(mazeList: MutableList<Int>): Iterator<Int> {
        val state = mazeList
        var i = 0
        var steps = 0

        override fun next(): Int {
            steps++
            val temp = state[i]
            state[i] += 1
            i += temp
            return i
        }

        override fun hasNext(): Boolean {
            return i>=0 && i<state.size
        }
    }


    fun part1(input: List<String>): Int {
        val maze = input.map { it.toInt() }.toMutableList()
        val iterator: CustomIterator = CustomIterator(maze)


        iterator.forEach { _ -> }

        return iterator.steps
    }


    class SecondCustomIterator(mazeList: MutableList<Int>): Iterator<Int> {
        val state = mazeList
        var i = 0
        var steps = 0

        override fun next(): Int {
            steps++
            val temp = state[i]

            if (temp > 2) {
                state[i] -= 1
            } else {
                state[i] += 1
            }
            i += temp
            return i
        }

        override fun hasNext(): Boolean {
            return i>=0 && i<state.size
        }
    }

    /**
     * Also a brute force solution
     */
    fun part2(input: List<String>): Int {
        val maze = input.map { it.toInt() }.toMutableList()
        val iterator = SecondCustomIterator(maze)


        iterator.forEach { _ -> }

        return iterator.steps
    }




//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day05_test")
    part1(input).println()
    part2(input).println()


}
