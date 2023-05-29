# PatientListingApp

A simple web app that displays a patient list. A user can also add new patients and filter the list by name or age.

Features
1. Add new patients: A patient must have the a first name, last name, birth date, phone number, email address and optionally a comment input.
2. Filter by name : There exist a match if for each word w of the search query, one of the words of the first name begins with w or one of the words of the last name begins with w.
3. Filter by age: There exist a match if the age of the patient at the time of the search matches the number of years given as input.
4. Clear filters: Displays the whole list again.

# Instructions

This app uses Scala, SBT, Play Framework, Akka HTTP server and HTML.

The infrastucture of the app is taken from play-scala-hello-world-tutorial which can be found [here](https://github.com/playframework/play-samples/tree/2.8.x/play-scala-hello-world-tutorial)

Requirements
- Java Software Developer's Kit (SE) 1.8 or higher (Java SE 11 is used in this app. Note that Play Framework 2.8.x: Requires Java 8, 11, or 15.) Download Java SE 11 [here](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- sbt 0.13.18 or higher (1.7.2 is used in this app). This app includes an sbt distribution for your convenience. sbt can also be downloaded [here](https://www.scala-sbt.org/download.html)


After the requirements are downloaded, to build and run the project,
1. Change the directory to the projectc directory via the command window.
2. Enter `sbt run`, it may take some while for this to finish due to library and dependency downloads.
3. Enter the following URL in a browser: http://localhost:9000, once the `Server started, ...`  message is seen.
