// Generated from Commands.g by ANTLR 4.5.3
package grammarfiles;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommandsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommandsParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CommandsParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CommandsParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#commandvaluerule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandvaluerule(CommandsParser.CommandvalueruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#methodrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodrule(CommandsParser.MethodruleContext ctx);
}