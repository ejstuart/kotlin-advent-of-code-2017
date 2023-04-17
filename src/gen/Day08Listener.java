// Generated from /home/eric/Projects/kotlin-advent-of-code-2017/src/Day08.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Day08Parser}.
 */
public interface Day08Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Day08Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Day08Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Day08Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Day08Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Day08Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Day08Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Day08Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Day08Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link Day08Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIf(Day08Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Day08Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIf(Day08Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link Day08Parser#num}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Day08Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link Day08Parser#num}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Day08Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Day08Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(Day08Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Day08Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(Day08Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Day08Parser#compar}.
	 * @param ctx the parse tree
	 */
	void enterCompar(Day08Parser.ComparContext ctx);
	/**
	 * Exit a parse tree produced by {@link Day08Parser#compar}.
	 * @param ctx the parse tree
	 */
	void exitCompar(Day08Parser.ComparContext ctx);
}