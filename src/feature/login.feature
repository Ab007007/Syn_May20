#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login 
  description: I want to use this template for my feature file

  @tag1
  Scenario: Successful login with valid credentials
    Given User is on a Login Page
    And Title is matched
    When I enter a valid "admin" and "manager"
    Then I can see the Home page
  
  Scenario: Successful login with valid credentials
    Given User is on a Login Page
    And Title is matched
    When I enter a invalid username and password
    Then I can see the Login page
     