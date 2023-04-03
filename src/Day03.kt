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

    fun part2(input: List<String>): Int {

        var checksum: Int = 0

        for (row: String in input) {
            val splitRow: List<String> = row.split("\t")
            val intRow: List<Int> = splitRow.map { it.toInt() }
            var modulus = 0
            var division = 0;

            loop@ for ((numeratorIndex, numerator) in intRow.withIndex()) {
                for ((denominatorIndex, denominator) in intRow.withIndex()) {
                    if (numeratorIndex == denominatorIndex) continue
                    modulus = numerator % denominator
                    if (modulus == 0) {
                        division = numerator / denominator
                        break@loop
                    }
                }
            }
            checksum += division
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
