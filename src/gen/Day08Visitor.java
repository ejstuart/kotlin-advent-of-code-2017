// Generated from /home/eric/Projects/kotlin-advent-of-code-2017/src/Day08.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Day08Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Day08Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Day08Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Day08Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Day08Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Day08Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Day08Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Day08Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link Day08Parser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Day08Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Day08Parser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(Day08Parser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Day08Parser#compar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompar(Day08Parser.ComparContext ctx);
}