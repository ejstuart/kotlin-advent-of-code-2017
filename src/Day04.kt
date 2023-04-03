fun main() {
    fun part1(input: List<String>): Int {
        var invalidPassphrases = 0

        for (passphrase: String in input) {
            var phraseList: List<String> = passphrase.split(" ")

            while (phraseList.isNotEmpty()) {
                val phrase = phraseList[0]
                phraseList = phraseList.drop(1)
                val firstElement = phraseList.firstOrNull() {
                    phrase == it
                }

                if (!firstElement.isNullOrBlank()) {
                    invalidPassphrases++
                    break
                }
            }
        }

        return input.size - invalidPassphrases
    }

    fun areAnagrams(a: String, b:String): Boolean {
        val sortedA = a.toCharArray().sorted().toString()
        val sortedB = b.toCharArray().sorted().toString()

        return sortedA == sortedB
    }

    fun part2(input: List<String>): Int {
        var invalidPassphrases = 0

        for (passphrase: String in input) {
            var phraseList: List<String> = passphrase.split(" ")

            while (phraseList.isNotEmpty()) {
                val phrase = phraseList[0]
                phraseList = phraseList.drop(1)
                val firstElement = phraseList.firstOrNull() {
                    phrase == it || areAnagrams(phrase, it)
                }

                if (!firstElement.isNullOrBlank()) {
                    invalidPassphrases++
                    break
                }

            }
        }

        return input.size - invalidPassphrases
    }




//     test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day04_test")
    part1(input).println()
    part2(input).println()


}
