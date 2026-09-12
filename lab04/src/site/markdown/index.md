# Lab 04: Maven Introduction

## Overview
This SE411 lab demonstrates how Maven manages dependencies,
runs a JavaFX application, and generates project documentation.

## Requirements
- JDK 23
- Eclipse IDE with Maven support
- Internet access to download dependencies

## Run the Application
1. In Eclipse, right-click pom.xml.
2. Select Run As > Maven build.
3. Enter clean javafx:run in the Goals field.
4. Select JDK 23 in the JRE tab and click Run.

An empty window titled "Lab 04" should appear.

## Generate the Documentation
Run Maven with the goals: clean site.

Then open target/site/index.html in your browser.

## Important Project Files
- pom.xml: dependencies, plugins, and project information.
- src/main/java/edu/psu/se411/lab04/Main.java: the JavaFX application.
- src/site/markdown/index.md: the source of this documentation page.