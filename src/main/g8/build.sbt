name := "$name$"

scalaVersion := "$scala_version$"

version := "$version$"

libraryDependencies ++= Seq(
    "log4j" % "log4j" % "1.2.14",
    "org.scalatest"    %% "scalatest"  % "3.0.1" % "test"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)
