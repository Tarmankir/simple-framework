Feature: Test open chrome and check logo

  @smoke-selenide-mobile @TC-5-selenide-mobile
  Scenario: Open chrome and check logo
    Given I am open main page in chrome
      When I am check logo is displayed
      Then I am check logo size