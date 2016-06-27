// Generated from BKOOL.g4 by ANTLR 4.5.3

	package bkool.parser;
	import bkool.utils.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BKOOLParser}.
 */
public interface BKOOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BKOOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BKOOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(BKOOLParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(BKOOLParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#list_members}.
	 * @param ctx the parse tree
	 */
	void enterList_members(BKOOLParser.List_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#list_members}.
	 * @param ctx the parse tree
	 */
	void exitList_members(BKOOLParser.List_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(BKOOLParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(BKOOLParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(BKOOLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(BKOOLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterMutable(BKOOLParser.MutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitMutable(BKOOLParser.MutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#immutable}.
	 * @param ctx the parse tree
	 */
	void enterImmutable(BKOOLParser.ImmutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#immutable}.
	 * @param ctx the parse tree
	 */
	void exitImmutable(BKOOLParser.ImmutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(BKOOLParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(BKOOLParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#constant_type}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type(BKOOLParser.Constant_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#constant_type}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type(BKOOLParser.Constant_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#varible_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarible_declaration(BKOOLParser.Varible_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#varible_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarible_declaration(BKOOLParser.Varible_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#list_id}.
	 * @param ctx the parse tree
	 */
	void enterList_id(BKOOLParser.List_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#list_id}.
	 * @param ctx the parse tree
	 */
	void exitList_id(BKOOLParser.List_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#varible_type}.
	 * @param ctx the parse tree
	 */
	void enterVarible_type(BKOOLParser.Varible_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#varible_type}.
	 * @param ctx the parse tree
	 */
	void exitVarible_type(BKOOLParser.Varible_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#method_normal}.
	 * @param ctx the parse tree
	 */
	void enterMethod_normal(BKOOLParser.Method_normalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#method_normal}.
	 * @param ctx the parse tree
	 */
	void exitMethod_normal(BKOOLParser.Method_normalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#list_parameters}.
	 * @param ctx the parse tree
	 */
	void enterList_parameters(BKOOLParser.List_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#list_parameters}.
	 * @param ctx the parse tree
	 */
	void exitList_parameters(BKOOLParser.List_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BKOOLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BKOOLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#method_type}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type(BKOOLParser.Method_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#method_type}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type(BKOOLParser.Method_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#method_constructor}.
	 * @param ctx the parse tree
	 */
	void enterMethod_constructor(BKOOLParser.Method_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#method_constructor}.
	 * @param ctx the parse tree
	 */
	void exitMethod_constructor(BKOOLParser.Method_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(BKOOLParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(BKOOLParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#method_void}.
	 * @param ctx the parse tree
	 */
	void enterMethod_void(BKOOLParser.Method_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#method_void}.
	 * @param ctx the parse tree
	 */
	void exitMethod_void(BKOOLParser.Method_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(BKOOLParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(BKOOLParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(BKOOLParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(BKOOLParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#list_statement}.
	 * @param ctx the parse tree
	 */
	void enterList_statement(BKOOLParser.List_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#list_statement}.
	 * @param ctx the parse tree
	 */
	void exitList_statement(BKOOLParser.List_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BKOOLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BKOOLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BKOOLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BKOOLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(BKOOLParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(BKOOLParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#arithmetic_expression_op1}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression_op1(BKOOLParser.Arithmetic_expression_op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#arithmetic_expression_op1}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression_op1(BKOOLParser.Arithmetic_expression_op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#arithmetic_expression_op2}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression_op2(BKOOLParser.Arithmetic_expression_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#arithmetic_expression_op2}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression_op2(BKOOLParser.Arithmetic_expression_op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(BKOOLParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(BKOOLParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#boolean_expression_op1}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression_op1(BKOOLParser.Boolean_expression_op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#boolean_expression_op1}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression_op1(BKOOLParser.Boolean_expression_op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(BKOOLParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(BKOOLParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#last_expression}.
	 * @param ctx the parse tree
	 */
	void enterLast_expression(BKOOLParser.Last_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#last_expression}.
	 * @param ctx the parse tree
	 */
	void exitLast_expression(BKOOLParser.Last_expressionContext ctx);
}