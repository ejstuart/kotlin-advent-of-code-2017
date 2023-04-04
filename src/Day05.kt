fun main() {
    fun part1(input: List<String>): Int {

        val filteredInput = input.filter {
            val phrase = it.split(" ")
            val wordSet = phrase.toSet()

            phrase.size == wordSet.size
        }

        return filteredInput.size
    }

    fun areAnagrams(a: String, b:String): Boolean {
        val sortedA = a.toCharArray().sorted().toString()
        val sortedB = b.toCharArray().sorted().toString()

        return sortedA == sortedB
    }

    /**
     * Alphabetise each word before adding converting to set to check for anagram
     */
    fun part2(input: List<String>): Int {

        val filteredInput = input.filter {
            val phraseList = it.split(" ").map { word ->
                word.toCharArray().sorted().toString()
            }

            phraseList.size == phraseList.toSet().size
        }

        return filteredInput.size
    }




//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day04_test")
    part1(input).println()
    part2(input).println()


}
