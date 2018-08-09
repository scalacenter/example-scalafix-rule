package fix

import scalafix.v1
import scalafix.v0

final case class Examplescalafixrule_v1(index: v0.SemanticdbIndex)
    extends v0.SemanticRule(index, "ExampleScalafixRule_v1") {

  override def fix(ctx: v0.RuleCtx): v0.Patch = {
    if (ctx.input.text.contains("// Hello world!")) v0.Patch.empty
    else ctx.addRight(ctx.tree, "// Hello world!\n")
  }

}

object ExampleSyntaxRule extends v0.Rule("v0Rule") {
  override def fix(ctx: v0.RuleCtx): v0.Patch = {
    if (ctx.input.text.contains("// v0 Syntactic!")) v0.Patch.empty
    else ctx.addRight(ctx.tree, "// v0 Syntactic!\n")
  }
}

class Syntactic extends v1.SyntacticRule("SyntacticRule") {
  override def fix(implicit doc: v1.Doc): v1.Patch = {
    if (doc.input.text.contains(s"// v1 $name!")) v0.Patch.empty
    else v0.Patch.addRight(doc.tree, s"// v1 $name!\n")
  }
}

class Semantic extends v1.SemanticRule("SemanticRule") {
  override def fix(implicit doc: v1.SemanticDoc): v1.Patch = {
    if (doc.input.text.contains(s"// v1 $name!")) v1.Patch.empty
    else v1.Patch.addRight(doc.tree, s"// v1 $name!\n")
  }
}
