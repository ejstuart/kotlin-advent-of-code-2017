fun main() {
    fun part1(input: List<String>): Int {
        var checksum: Int = 0

        for (row: String in input) {
            val splitRow: List<String> = row.split("\t")
            val intRow: List<Int> = splitRow.map { it.toInt() }
            val difference: Int = intRow.max() - intRow.min()
            checksum += difference
        }

        return checksum
    }

    fun divide(a: Int, b: Int): Int {
        if (a > b) {
            return a / b
        }else {
            return b / a
        }
    }

    fun part2(input: List<String>): Int {
        var checksum = 0

        for (row: String in input) {
            val splitRow: List<String> = row.split("\t")
            var intRow: List<Int> = splitRow.map { it.toInt() }

            while (intRow.isNotEmpty()) {
                val num = intRow[0]
                intRow = intRow.drop(1)
                val firstElement = intRow.firstOrNull() {
                    ((num % it == 0 || it % num == 0 ))
                }
                firstElement?.let { checksum += divide(num, it) }
            }
        }

        return checksum
    }




//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day02_test")
    part1(input).println()
    part2(input).println()


}
