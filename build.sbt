import AssemblyKeys._

assemblySettings

jarName in assembly := "Scraper.jar"

name := "Scraper"

version := "0.1"

scalaVersion := "2.10.1"

mainClass := Some("scraper")

libraryDependencies += "org.jsoup" % "jsoup" % "1.7.3"
