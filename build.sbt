name := "bitches"

version := "0.1"

scalaVersion := "2.13.8"


lazy val root = project
  .in(file("."))
  .settings(
    assembly / assemblyJarName := "bitches.jar",
    assembly / mainClass := Some("gq.noxiaum.bitches.Main")
  )

