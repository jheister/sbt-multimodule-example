import sbt.Keys._
import sbt._

object ModuleC extends Build {
  val moduleC = Project("ModuleC", file("."))
    .dependsOn(RootProject(file("../moduleB")))
    .settings(
      name := "ModuleC",
      organization := "example.sbtmultimodule",
      version := "0.0.1",
      libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5"
    )
}
