import sbt.Keys._
import sbt._

object ModuleA extends Build {
  lazy val moduleA = Project("ModuleA", file("."))
    .dependsOn(RootProject(file("../moduleB")))
    .settings(
      name := "ModuleA",
      organization := "example.sbtmultimodule",
      version := "0.0.1",
      libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5"
    )

}