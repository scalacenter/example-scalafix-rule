addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.16")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.10.0"
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.2")
