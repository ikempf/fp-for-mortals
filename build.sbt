scalaVersion := "2.12.6"

scalacOptions ++= Seq(
  "-language:_",
  "-Ypartial-unification",
  "-Xfatal-warnings"
)

name := "fp-for-mortals"
organization := "com.ikempf"
version := "1.0"

libraryDependencies ++= Seq(
  "com.github.mpilquist" %% "simulacrum"  % "0.12.0",
  "org.scalaz"           %% "scalaz-core" % "7.2.25",
  "org.typelevel"        %% "cats-core"   % "1.1.0",
  "eu.timepit"           %% "refined"     % "0.9.2",

)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)