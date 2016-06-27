package bkool.astgen
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import java.io.{ PrintWriter, File }
import org.antlr.v4.runtime.ANTLRFileStream
import bkool.utils._
import scala.collection.JavaConverters._
import org.antlr.v4.runtime.tree._
import bkool.parser._

class ASTGeneration extends BKOOLBaseVisitor[Object] {

  override def visitProgram(ctx: BKOOLParser.ProgramContext) = Program(ctx.class_declaration().asScala.map(visit).toList.asInstanceOf[List[ClassDecl]])

  override def visitTerminal(node: TerminalNode) = node.getText

}