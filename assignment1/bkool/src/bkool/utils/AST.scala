package bkool.utils

/**
 * @author nhphung
 */

trait Context
trait AST

case class Program(val decl: List[ClassDecl]) extends AST {
  override def toString = "Program(" + decl.mkString("[", ",", "]") + ")"
}

trait Decl extends AST
case class VarDecl(val variable: Id, val varType: Type) extends Decl {
  override def toString = "VarDecl(" + variable + "," + varType + ")"
}
case class ConstDecl(val id: Id, val constType: Type, val const: Expr) extends Decl {
  override def toString = "ConstDecl(" + id + "," + constType + "," + const + ")"
}
case class ParamDecl(val id: Id, val paramType: Type) extends Decl {
  override def toString = "param(" + id + "," + paramType + ")"
}
case class ClassDecl(val name: Id, val parent: Id, val decl: List[MemDecl]) extends AST {
  override def toString = "ClassDecl(" + name + "," + (if (parent != null) parent + "," else "") + decl.mkString("[", ",", "]") + ")"
}

trait MemDecl extends AST
trait SIKind extends AST
object Instance extends SIKind {
  override def toString = "Instance"
}
object Static extends SIKind {
  override def toString = "Static"
}

case class MethodDecl(val kind: SIKind, val name: Id, val param: List[ParamDecl], val returnType: Type, val body: Stmt) extends MemDecl {
  override def toString = "MethodDecl(" + name + "," + kind + "," + param.mkString("[", ",", "]") + "," + (if (returnType != null) returnType + "," else "") + body + ")"
}

//method implement
case class AttributeDecl(val kind: SIKind, val decl: Decl) extends MemDecl {
  override def toString = "AttributeDecl(" + kind + "," + decl + ")"
}

/*        TYPE        */
trait Type extends AST
object IntType extends Type {
  override def toString = "IntType"
}
object FloatType extends Type {
  override def toString = "FloatType"
}
object BoolType extends Type {
  override def toString = "BoolType"
}
object StringType extends Type {
  override def toString = "StringType"
}
object VoidType extends Type {
  override def toString = "VoidType"
}
case class ArrayType(val dimen: IntLiteral, val eleType: Type) extends Type {
  override def toString = "ArrayType(" + eleType.toString() + "," + dimen + ")"
}
case class ClassType(val classType: String) extends Type {
  override def toString = "ClassType(" + classType + ")"
}

/*        expr        */
trait Expr extends AST
case class BinaryOp(op: String, left: Expr, right: Expr) extends Expr {
  override def toString = "BinaryOp(" + op + "," + left + "," + right + ")"
}
case class UnaryOp(op: String, body: Expr) extends Expr {
  override def toString = "UnaryOp(" + op + "," + body + ")"
}
case class NewExpr(val name: Id, val exprs: List[Expr]) extends Expr {
  override def toString = "NewExp(" + name + "," + exprs.mkString("[", ",", "]") + ")"
}
case class CallExpr(val cName: Expr, val method: Id, val params: List[Expr]) extends LHS {
  override def toString = "CallExp(" + (if (cName == null) "self" else cName) + "," + method + "," + params.mkString("[", ",", "]") + ")"
}

//LHS ------------------------
trait LHS extends Expr
case class Id(val name: String) extends LHS {
  override def toString = name
}
// element access
case class ArrayCell(arr: Expr, idx: Expr) extends LHS {
  override def toString = "ArrayCell(" + arr + "," + idx + ")"
}

case class FieldAccess(name: Expr, field: Id) extends LHS {
  override def toString = "FieldAccess(" + name + "," + field + ")"
}
/*        STMT        */
trait Stmt extends AST
case class Block(val decl: List[Decl], val stmt: List[Stmt]) extends Stmt {
  override def toString = "Block(" + decl.mkString("[", ",", "]") + "," + stmt.mkString("[", ",", "]") + ")"
}
case class Assign(val leftHandSide: LHS, val expr: Expr) extends Stmt {
  override def toString = "Assign(" + leftHandSide + "," + expr + ")"
}
case class If(val expr: Expr, val thenStmt: Stmt, val elseStmt: Option[Stmt]) extends Stmt {
  override def toString = "If(" + expr + "," + thenStmt + "," + (if (elseStmt == None) "" else elseStmt.get) + ")"
}
case class Call(val parent: Expr, val method: Id, val params: List[Expr]) extends Stmt {
  override def toString = "Call(" + parent + "," + method + "," + params.mkString("[", ",", "]") + ")"
}
case class For(val idx: String, val expr1: Expr, val up: Boolean, val expr2: Expr, val loop: Stmt) extends Stmt {
  override def toString = "For(" + idx + ":=" + expr1 + ";" + (if (up) idx + "<" + expr2 + ";" + idx + "++" else idx + ">" + expr2 + ";" + idx + "--") + loop + ")"
}

object Break extends Stmt {
  override def toString = "Break()"
}
object Continue extends Stmt {
  override def toString = "Continue()"
}
case class Return(val expr: Expr) extends Stmt {
  override def toString = "Return(" + expr + ")"
}

/*        LITERAL        */
trait Literal extends Expr
case class IntLiteral(val value: Int) extends Literal {
  override def toString = "IntLit(" + value.toString + ")"
}
case class FloatLiteral(val value: Float) extends Literal {
  override def toString = "FloatLit(" + value.toString + ")"
}
case class StringLiteral(val value: String) extends Literal {
  override def toString = "StringLit(" + value + ")"
}
case class BooleanLiteral(val value: Boolean) extends Literal {
  override def toString = "BoolLit(" + value.toString() + ")"
}
object NullLiteral extends Literal {
  override def toString = "Null()"
}
object SelfLiteral extends Literal {
  override def toString = "Self()"
}

