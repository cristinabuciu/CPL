// Generated from CoolParser.g4 by ANTLR 4.7.1

    package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classs}.
	 * @param ctx the parse tree
	 */
	void enterClasss(CoolParser.ClasssContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classs}.
	 * @param ctx the parse tree
	 */
	void exitClasss(CoolParser.ClasssContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(CoolParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(CoolParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(CoolParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(CoolParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#inherit_class_name}.
	 * @param ctx the parse tree
	 */
	void enterInherit_class_name(CoolParser.Inherit_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#inherit_class_name}.
	 * @param ctx the parse tree
	 */
	void exitInherit_class_name(CoolParser.Inherit_class_nameContext ctx);
}