Feature: Buy All Inclusive Pass

  Scenario: User can select a 2 day pass in container and remove it from checkout
    Given I am on the All-Inclusive page
    And I select the "2 day" pass from the Choose Your Pass container
    And I select 2 adult and 1 child passes
    When I go to the checkout
    Then I will see my inclusive pass details