import sbt.Keys._
import sbt._

object ModuleB extends Build {
  val moduleB = Project("ModuleB", file("."))
    .settings(
      name := "ModuleB",
      organization := "example.sbtmultimodule",
      version := "0.0.1",
      libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5"
    )
}
