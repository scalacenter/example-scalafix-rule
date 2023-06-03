addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.0")
resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.10.4+48-a158b916-SNAPSHOT")
dependencyOverrides += "ch.epfl.scala" % "scalafix-interfaces" % "0.11.0"
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.2")
