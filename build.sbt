name := "bitches"

version := "0.1"

scalaVersion := "2.13.8"

lazy val root = project
  .in(file("."))
  .settings(
    assembly / assemblyJarName := "Bitches.jar",
    assembly / mainClass := Some("gq.noxiaum.bitches.Main"),
    assembly / assemblyMergeStrategy := (_ => MergeStrategy.last),

    run / fork := true,

    name := "bitches",
    resolvers ++= Seq(
MavenRepo("jitpack", "https://jitpack.io/"),
      Resolver.mavenLocal
    ),

    libraryDependencies ++= Seq(
      "org.apache.commons" % "commons-lang3" % "3.12.0"
    ))



