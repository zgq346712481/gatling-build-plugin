homepage := Some(new URL("https://gatling.io"))
organization := "io.gatling"
organizationHomepage := Some(new URL("https://gatling.io"))
startYear := Some(2011)
licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))
scalafmtOnCompile := true

sbtPlugin := true

scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-target:jvm-1.8",
  "-deprecation",
  "-feature",
  "-unchecked"
) ++ (if (scala.util.Properties.javaVersion.startsWith("1.8")) Nil else Seq("-release", "8"))

// ------------------ //
// -- DEPENDENCIES -- //
// ------------------ //

addSbtPlugin("ch.epfl.scala"     % "sbt-scalafix" % "0.9.15")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt" % "2.3.2")
addSbtPlugin("com.github.gseitz" % "sbt-release"  % "1.0.11")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"      % "2.0.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "5.4.0")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype" % "2.0")
