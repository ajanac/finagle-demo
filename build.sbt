name := "finagle-demo"
version := "0.1"
scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "finagle-demo",
    libraryDependencies ++= Seq(
      "com.twitter" %% "finagle-core" % "22.7.0",
      "com.twitter" %% "finagle-http" % "22.7.0"
    )
  )
