fun main() {

    class CustomIterator(mazeList: MutableList<Int>, val incrementFunction: (MutableList<Int>, Int) -> Unit) :
        Iterator<Int> {
        val state = mazeList
        var i = 0

        override fun next(): Int {
            i += state[i]
            return i
        }

        override fun hasNext(): Boolean {
            return i >= 0 && i < state.size
        }

        fun updateState(temp: Int): Unit {
            incrementFunction(state, temp)
        }
    }


    fun part1(input: List<String>): Int {
        fun incrementMaze(state: MutableList<Int>, i: Int): Unit {
            state[i]++
        }

        var steps = 0
        val maze = input.map { it.toInt() }.toMutableList()
        val iterator = CustomIterator(maze, incrementFunction = ::incrementMaze)

        while (iterator.hasNext()) {
            val temp = iterator.i
            iterator.next()
            iterator.updateState(temp)
            steps++
        }
        return steps
    }

    fun part2(input: List<String>): Int {
        fun incrementMaze(state: MutableList<Int>, i: Int): Unit {
            if (state[i] > 2) {
                state[i]--
            } else {
                state[i]++
            }
        }

        var steps = 0
        val maze = input.map { it.toInt() }.toMutableList()
        val iterator = CustomIterator(maze, incrementFunction = ::incrementMaze)

        while (iterator.hasNext()) {
            val temp = iterator.i
            iterator.next()
            iterator.updateState(temp)
            steps++
        }

        return steps
    }

    val input = readInput("Day05_test")
    part1(input).println()
    part2(input).println()


}
