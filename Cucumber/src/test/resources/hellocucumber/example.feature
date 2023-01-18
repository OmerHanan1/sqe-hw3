Feature: A set of scenarios for testing the "example" module

  Scenario: Student fills out a question with multiple choices, chooses two answers.
    Given user is on homepage
    When user is logging in
    And user navigate to the quiz page
    And user select the quiz
    And user answer the question
    And user submit the answer
    Then message displayed submit successfully

  Scenario: Teacher changes question type to single answer.
    Given user is on homepage
    When user is logging in
    And user navigate to the quiz page
    And user edit the quiz question type
    And user save the quiz
    Then message displayed save successfully
