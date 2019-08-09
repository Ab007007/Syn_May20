@tag
Feature: Google Search
  @tag1
  Scenario: Search A text and print the Search result
    Given I launch google Page
    When Search for a text UBS
    Then I should be able to print all links starts with UBS
    And Close the browser

  
   Scenario: Search A text and print the Search result
    Given I launch google Page
    When Search for a text "PUNE"
    Then I should be able to print all links starts with UBS
    And Close the browser

  
  