addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.13.0")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.13.0"
