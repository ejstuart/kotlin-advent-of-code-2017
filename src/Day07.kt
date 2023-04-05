
fun main() {

    fun redistribute(banks: MutableList<Int>) {
        var maxElement = banks.max()
        var index = banks.indexOf(maxElement)
        banks[index] = 0

        while (maxElement > 0) {
            if (index >= banks.size - 1) {
                index = 0
            } else {
                index++
            }
            banks[index]++
            maxElement--
        }

    }

    fun part1(input: List<String>): Int {
        val banks = (input[0].split("\t")).map {it.toInt()}.toMutableList()
        val bankMemory = emptySet<List<Int>>().toMutableSet()
        var cycles = 0

        bankMemory.add(banks.map {it})
        while (cycles == bankMemory.size - 1) {
            redistribute(banks)
            bankMemory.add(banks.map {it})

            cycles++
        }

        return cycles
    }


    fun part2(input: List<String>): Int {
        val banks = (input[0].split("\t")).map {it.toInt()}.toMutableList()
        val bankMemory = emptySet<List<Int>>().toMutableSet()
        var cycles = 0

        bankMemory.add(banks.map {it})
        while (cycles == bankMemory.size - 1) {
            redistribute(banks)
            bankMemory.add(banks.map {it})

            cycles++
        }

        val identicalBankIndex = bankMemory.indexOf(banks.map {it})

        return cycles - identicalBankIndex
    }





    val input = readInput("Day06_test")
    part1(input).println()
    part2(input).println()
}
