import java.security.KeyStore.Entry

fun main() {

    fun modify(line: List<String>, referenceMap: MutableMap<String, Int>) {
        if (line[1] == "inc") {
            referenceMap[line[0]] = referenceMap[line[0]]!! + line[2].toInt()
        } else {
            referenceMap[line[0]] = referenceMap[line[0]]!! - line[2].toInt()
        }
    }

    fun part1(input: List<String>): String {
        val referenceMap = emptyMap<String, Int>().toMutableMap()
        val instructions = input.map {
            it.split(" ")
        }

        var maxOverall = 0

        instructions.forEach {line ->
            if (!referenceMap.containsKey(line[0])) {
                referenceMap[line[0]] = 0
            }
            if (!referenceMap.containsKey(line[4])) {
                referenceMap[line[4]] = 0
            }

            when(line[5]) {
                ">" -> {
                    if (referenceMap[line[4]]!! > line[6].toInt()) {
                        modify(line, referenceMap)
                    }
                }
                ">=" -> {
                    if (referenceMap[line[4]]!! >= line[6].toInt()) {
                        modify(line, referenceMap)
                    }
                }
                "<" -> {
                    if (referenceMap[line[4]]!! < line[6].toInt()) {
                        modify(line, referenceMap)
                    }
                }
                "<=" -> {
                    if (referenceMap[line[4]]!! <= line[6].toInt()) {
                        modify(line, referenceMap)
                    }
                }
                "==" -> {
                    if (referenceMap[line[4]]!! == line[6].toInt()) {
                        modify(line, referenceMap)
                    }
                }
                "!=" -> {
                    if (referenceMap[line[4]]!! != line[6].toInt()) {
                        modify(line, referenceMap)
                    }
                }
            }

            val potentialEntry = referenceMap.maxBy { it.value }
            val potentialValue = potentialEntry.value
            if (potentialValue > maxOverall) {
                maxOverall = potentialValue
            }
        }

        val maxEntry = referenceMap.maxBy { it.value }
        return "Maximum End Value: ${maxEntry.value} \nMaximum Value Seen: $maxOverall"
    }

    val input = readInput("Day08_test")
    part1(input).println()
}

