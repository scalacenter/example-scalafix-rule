addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.2")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.13.0")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.13.0"
