import java.util.ArrayDeque

fun main() {
    fun part1(input: List<String>): Pair<Int, Int> {
        val stream = input[0]
        val stack = ArrayDeque<Char>()
        var score = 0
        var garbage = 0
        var i = 0

        while (i < stream.length) {
            if (stream[i] == '!') {
                i += 2
                continue
            } else if ((!stack.isEmpty()) && (stack.peek() == '<') && stream[i] != '>') {
                garbage += 1
                i += 1
                continue
            } else if ((!stack.isEmpty()) && (stack.peek() == '<') && stream[i] == '>') {
                stack.pop()
            } else if (stream[i] == '{' || stream[i] == '<') {
                stack.push(stream[i])
            } else if (stream[i] == '}' && stack.peek() == '{') {
                score += stack.size
                stack.pop()
            }

            i += 1
        }

        return Pair(score, garbage)
    }

    fun part2(input: List<String>): Int {

        return 1
    }

    val input = readInput("Day09_test")
    part1(input).println()
    part2(input).println()


}
