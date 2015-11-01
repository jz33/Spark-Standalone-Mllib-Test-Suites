name := "Spark-Mllib-Learn-"

version := "0.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "1.5.1",
	"org.apache.spark" %% "spark-sql" % "1.5.1",
	"org.apache.spark" %% "spark-mllib" % "1.5.1",
	"org.scalatest" %% "scalatest" % "2.2.4"
)
