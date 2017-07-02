name := "$name$"

scalaVersion := "$scala_version$"

version := "$version$"

libraryDependencies ++= Seq(
    "log4j" % "log4j" % "1.2.14",

    "org.scalatest"    %% "scalatest"  % "2.2.1" % "test" withSources() withJavadoc(),
    "org.scalacheck"   %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc()
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)
