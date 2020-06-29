sbtVersion := "0.13.17"

scalaVersion := "2.12.8"

organization := "ai.economicdatasciences"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.4.4",
    "org.apache.spark" %% "spark-sql" % "2.4.4"
)
