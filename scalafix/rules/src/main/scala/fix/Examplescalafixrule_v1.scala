package fix

import scalafix._
import scala.meta._

final case class Examplescalafixrule_v1(index: SemanticdbIndex)
    extends SemanticRule(index, "ExampleScalafixRule_v1") {

  override def fix(ctx: RuleCtx): Patch = {
    if (ctx.input.text.contains("// Hello world!")) Patch.empty
    else ctx.addRight(ctx.tree, "// Hello world!\n")
  }

}
