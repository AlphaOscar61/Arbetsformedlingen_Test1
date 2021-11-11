Feature:Changing any information
  @test1
  Scenario: Verify that user change personal information
    Given the user verifies to be homepage
    And the user clicks log in icon
    And the user clicks Username and Password button
    And the user fills personal credentials
    And the user clicks Log in button
    And the user click Mina Uppgifter button
    And the user click Redigera Uppgifter button
    And the user changes info
    When the user cliks Save button
    Then the user monitors new information