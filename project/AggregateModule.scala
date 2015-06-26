import sbt.Keys._
import sbt._

object AggregateModule extends Build {
  lazy val aggregateModule = Project("AggregateModule", file("."))
    .aggregate(
      RootProject(file("moduleA")),
      RootProject(file("moduleB")),
      RootProject(file("moduleC"))
    )
}
