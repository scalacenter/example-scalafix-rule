addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.11.1")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.12.0"
