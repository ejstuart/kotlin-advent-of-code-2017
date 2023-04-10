
fun main() {

    fun part1(input: List<String>): String {
        val programList = input.map {it.split(" \\(\\d+\\) -> | \\(\\d+\\)".toRegex())}.toMutableList()
        val carrierProgramSet = emptySet<String>().toMutableSet()
        val carriedProgramSet = emptySet<String>().toMutableSet()

        programList.forEach { stringList ->
            if (stringList.size != 1) {
                carrierProgramSet.add(stringList[0])
                carriedProgramSet.addAll(stringList[1].split(", "))
            }
        }

        return (carrierProgramSet subtract carriedProgramSet).toString().removeSurrounding("[", "]")
    }

    data class Program(val name: String, val weight: Int) {
        val carrying: MutableList<Program> = emptyList<Program>().toMutableList()

        fun getTotalWeight(): Int {
            var totalWeight = 0

            carrying.forEach {childProgram ->
                totalWeight += if (childProgram.carrying.isEmpty()) {
                    childProgram.weight
                } else {
                    childProgram.getTotalWeight()
                }
            }
            return totalWeight + this.weight
        }
    }

    fun findUnbalancedCorrectedWeight(baseProgram: Program, previousMode: Int): Int {
        val childProgramList = baseProgram.carrying
        val childProgramTotalWeights = baseProgram.carrying.map { it.getTotalWeight() }
        val childMap = childProgramList.associateWith { it.getTotalWeight() }
        val (mode, _) = childProgramTotalWeights.groupingBy { it }.eachCount().maxByOrNull { it.value }!!
        var newWeight = 0

        childMap.map {
            if (it.value != mode) {
                newWeight = findUnbalancedCorrectedWeight(it.key, mode)
                return newWeight
            }
        }

        return previousMode - (baseProgram.getTotalWeight() - baseProgram.weight)
    }

    fun part2(input: List<String>): Int {
        val programStringList = input.map { it.split(" ", ", ") }.toMutableList()

        val programList = programStringList.map() {
            Program(it[0], it[1].removeSurrounding("(", ")").toInt())
        }.toMutableList()

        programStringList.forEachIndexed() { index, stringList ->
            if (stringList.size > 2) {
                for (i in 3 until stringList.size) {
                    programList[index].carrying.add(programList.find { it.name == stringList[i] }!!)
                }
            }
        }

        val baseProgramName = part1(input)
        val baseProgram = programList.find { it.name == baseProgramName }

        return findUnbalancedCorrectedWeight(baseProgram!!, baseProgram.weight)
    }

    val input = readInput("Day07_test")
    part1(input).println()
    part2(input).println()
}

