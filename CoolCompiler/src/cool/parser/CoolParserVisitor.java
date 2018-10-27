// Generated from CoolParser.g4 by ANTLR 4.7.1

    package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#classs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasss(CoolParser.ClasssContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(CoolParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CoolParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(CoolParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#inherit_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherit_class_name(CoolParser.Inherit_class_nameContext ctx);
}