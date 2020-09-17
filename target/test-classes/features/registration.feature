Feature: Registration

  Scenario: Valid With Parameter
    Given I navigate to angularjs site
    And I click on sign up
    When I enter username "Dada5xu"
    And I enter email "Bzpmaamee243@gmail.com"
    And I enter password "Thankyou099"
    And I click on sign up 2
    Then am logged in with account name displayed
    Then I close my window