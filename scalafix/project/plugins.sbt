addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.6.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.12.1")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.13.0"
