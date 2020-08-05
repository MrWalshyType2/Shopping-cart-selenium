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

# This file is written in human-readable language (Gherkin)

@tag
Feature: Shopping Website Order Item
  In order to purchase items,
  As a user,
  I want to be able to add items to my basket and order items.
  I want to order an item

  @tag1
  Scenario Outline: As a user I want to order an Item
    Given I can access the fashion website
    And I have login credentials of email: "<email>", password: "<password>"
    When I search for item "<item>"
    And I add item "<item>" to my basket
    And I can go to checkout
    Then I should see the item "<item>" in my basket
    And I can order the item "<item>" in my basket
    Then I should see a successful order result of "<result>"
		# Tags pull from Examples below and sends as a param
		# Test number = number of rows of data (3 rows of data = 3 tests)
    Examples: 
      | item   | result 	 										 									| email 						| password |
      | blouse | ???																						| bobbyo@mailme.com | password |