Feature: A set of scenarios for testing the "example" module

  Scenario: Testing how a case where a user adds a product to the cart
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes

  Scenario: Student fills out a question with multiple choices, chooses two answers.
    Given user is on homepage
    When user is logging in
    And user navigate to the quiz page
    And user select the quiz
    And user answer the question
    And user submit the answer
    Then the scenario passes

  Scenario: Teacher changes question type to single answer.
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes
