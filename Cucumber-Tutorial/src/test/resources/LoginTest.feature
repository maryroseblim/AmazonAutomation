
Feature: User Login
  User should be able to Login using valid credential

#Gherkin script - cucumber.io for documentation
#https://cucumber.io/docs/guides/10-minute-tutorial/

  Scenario: Testing login with valid credential
    Given I am on login page
    When I enter username as "jsmith" and password as "demo1234"
    And I submit login page
    Then I redirect to user home page
    
    Scenario: Testing login with invalid credential
    Given I am on login page
    When I enter username as "invalid" and password as "demo1234"
    And I submit login page
    Then I am on login page

