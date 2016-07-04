// Generated from Commands.g by ANTLR 4.5.3
package grammarfiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandsParser}.
 */
public interface CommandsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandsParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CommandsParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CommandsParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CommandsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CommandsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#commandvaluerule}.
	 * @param ctx the parse tree
	 */
	void enterCommandvaluerule(CommandsParser.CommandvalueruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#commandvaluerule}.
	 * @param ctx the parse tree
	 */
	void exitCommandvaluerule(CommandsParser.CommandvalueruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#methodrule}.
	 * @param ctx the parse tree
	 */
	void enterMethodrule(CommandsParser.MethodruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#methodrule}.
	 * @param ctx the parse tree
	 */
	void exitMethodrule(CommandsParser.MethodruleContext ctx);
}