name := "cats-effect-exercise"

version := "0.1"

scalaVersion := "2.13.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-language:higherKinds"
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-effect" % "2.0.0"
)

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3")