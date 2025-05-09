addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.3")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.3")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.14.3"
