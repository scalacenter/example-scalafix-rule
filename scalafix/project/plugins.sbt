addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.11.0")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.11.0"
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")
