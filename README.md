# Assignment 3: Software Quality Engineering
This is a repository for assignment 3 of the Software Quality Engineering course at the [Ben-Gurion University](https://in.bgu.ac.il/), Israel.

## Assignment Description
In this assignment, we tested an open-source software called [Moodle](https://moodle.org/?lang=he).

This software provides the user with a platform for creating online courses and learning management systems.
The software is written in PHP and uses a MySQL database.
Users can create courses, add activities and resources, and grade students' work.
User types include students, teachers, and administrators.
We tested the software using the [Selenium](https://www.selenium.dev/) framework.

## Installation
In order to run the tests, you need to install the following:
* [Moodle](https://download.moodle.org/releases/latest/) - The software we tested.
* [Selenium](https://www.selenium.dev/downloads/) - The framework we used to test the software.
* [ChromeDriver](https://chromedriver.chromium.org/downloads) - The driver we used to run the tests on Chrome.
* [MySQL](https://dev.mysql.com/downloads/mysql/) - The database we used to store the data.
* [XAMPP](https://www.apachefriends.org/download.html) - The software we used to run the database.
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows) - The IDE we used to write the tests.
* [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) - The language we used to write the tests.
* [Maven](https://maven.apache.org/download.cgi) - The software we used to build the tests.
* [Git](https://git-scm.com/downloads) - The software we used to manage the repository.

## What we tested
We tested the following feature:
A student login to the system and register to a course.
A student attempts to a quiz.
The quiz contains a question with a multiple choice answer.
The student answers the question and submits the quiz (the answer is correct and contains two answers).
The student submits the quiz and the system displays the grade.
A teacher login to the system and edit the quiz.
The teacher change the question to a question with a single choice answer.
The teacher saves the changes.

The tests are located in the ```src/test/java```

*User story:* As a student, I want to register to a course, attempt a quiz, and submit the quiz.

*Preconditions:* The student submits the quiz and the system displays the grade.

*Expected outcome:* The student submits the quiz and the system displays the grade.

*User story:* A teacher login to the system and edit the quiz.

*Preconditions:* The teacher change the question to a question with a single choice answer.

*Expected outcome:* The answer cannot be changed to a single choice answer since the quiz is already submitted.

## How we tested
We used two different testing methods:
1. [Cucumber](https://cucumber.io/), a BDD testing framework.
2. [Provengo](https://provengo.tech/), a story-based testing framework.

Each of the testing methods is elaborated in its own directory.
