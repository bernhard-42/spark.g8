name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest"    %% "scalatest"  % "3.0.5" % "test",
  "log4j"            % "log4j"       % "1.2.17",
  "org.apache.spark" %% "spark-sql"  % "$spark_version$",
  "org.apache.spark" %% "spark-hive" % "$spark_version$",
  "org.apache.spark" %% "spark-yarn" % "$spark_version$"
  // "org.apache.spark" % "spark-hive_2.11" % "2.0.0.2.5.3.0-37"  excludeAll(ExclusionRule(organization = "org.spark-project.hive"))
)

assemblyMergeStrategy in assembly := {
    case PathList("org",   "aopalliance",       xs @ _*) => MergeStrategy.last
    case PathList("javax", "servlet",           xs @ _*) => MergeStrategy.last
    case PathList("javax", "inject",            xs @ _*) => MergeStrategy.last
    case PathList("javax", "xml",               xs @ _*) => MergeStrategy.last
    case PathList("javax", "activation",        xs @ _*) => MergeStrategy.last
    case PathList("org",   "apache",            xs @ _*) => MergeStrategy.last
    case PathList("com",   "google",            xs @ _*) => MergeStrategy.last
    case PathList("com",   "esotericsoftware",  xs @ _*) => MergeStrategy.last
    case PathList("com",   "codahale",          xs @ _*) => MergeStrategy.last
    case PathList("com",   "yammer",            xs @ _*) => MergeStrategy.last
    case PathList("org",   "objenesis",         xs @ _*) => MergeStrategy.last

    case "about.html"                                    => MergeStrategy.rename
    case "META-INF/ECLIPSEF.RSA"                         => MergeStrategy.last
    case "META-INF/mailcap"                              => MergeStrategy.last
    case "META-INF/mimetypes.default"                    => MergeStrategy.last
    case "plugin.properties"                             => MergeStrategy.last
    case "log4j.properties"                              => MergeStrategy.last
    case "git.properties"                                => MergeStrategy.last
    case "codegen/config.fmpp"                           => MergeStrategy.rename
    case "plugin.xml"                                    => MergeStrategy.rename
    case "parquet.thrift"                                => MergeStrategy.rename

    case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
}

