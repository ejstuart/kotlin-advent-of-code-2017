import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileInputStream
import gen.*

class CustomVisitor: Day08BaseVisitor<Int>() {
    var memory: HashMap<String, Int> = HashMap<String, Int>()
    var max: Int = 0

    override fun visitAssign(ctx: Day08Parser.AssignContext?): Int {
        val id = ctx!!.ID().text
        memory.putIfAbsent(id, 0)
        val op = visit(ctx.op())
        val value = visit(ctx.num())
        val condition = visit(ctx.cond())

        if (condition == 1){
            memory[id] = memory[id]!! + (value * op)
        }

        val maxEntry = memory.maxBy { it.value }
        if (maxEntry.value > max) {
            max = maxEntry.value
        }

        if (ctx.stat() != null) {
            return visit(ctx.stat())
        }

        return maxEntry.value
    }


    override fun visitOp(ctx: Day08Parser.OpContext?): Int {
        val op = ctx!!.children[0].toString()
        return if (op == "inc") {
            1
        } else {
            -1
        }
    }

    override fun visitNumber(ctx: Day08Parser.NumberContext?): Int {
        return if (ctx!!.children.size == 2) {
            val number = ctx.children[0].toString() + ctx.children[1].toString()
            number.toInt()
        } else {
            val number = ctx.children[0].toString()
            number.toInt()
        }
    }

    override fun visitIf(ctx: Day08Parser.IfContext?): Int {
        val id = ctx!!.ID().text
        memory.putIfAbsent(id, 0)
        val compar = ctx.compar().text
        val value = visit(ctx.num())

        when (compar) {
            ">" -> if (memory[id]!! > value) return 1
            "<" -> if (memory[id]!! < value) return 1
            ">=" -> if (memory[id]!! >= value) return 1
            "<=" -> if (memory[id]!! <= value) return 1
            "==" -> if (memory[id]!! == value) return 1
            "!=" -> if (memory[id]!! != value) return 1
        }

        return 0
    }

}

fun main() {

    fun part1(input: List<String>): Pair<String, String> {

        val inputStream = FileInputStream("data/Day08_test.txt")
        val visitorInput = CharStreams.fromStream(inputStream)
        val lexer = Day08Lexer(visitorInput)
        val tokens = CommonTokenStream(lexer)
        val parser = Day08Parser(tokens)
        val tree = parser.prog()

        val eval = CustomVisitor()
        val maxEnd = eval.visit(tree).toString()
        return Pair(maxEnd, eval.max.toString())
    }

    val input = readInput("Day08_test")
    part1(input).println()
}

