@wip
Feature:Changing any information
  Background:
    Given the user verifies to be homepage
    And the user clicks login icon
    And the user clicks Username and Password button
    And the user fills personal credentials
    And the user clicks Loggain button
    And the user clicks Mina Uppgifter button
  @test1
  Scenario: Verify that user change personal information
    And the user clicks Redigera Uppgifter button
    And the user changes telephone number
    When the user clicks Save button
    Then the user monitors new information

