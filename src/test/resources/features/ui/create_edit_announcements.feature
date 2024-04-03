@createEdit
Feature: Editing created announcements

  @run
  Scenario: user can edit an announcement
    Given user goes to the page with email and pass
    When user goes to the Announcements page
    And user clicks the three dot to edit an announcement
    Then user clicks edit announcement and able to see edit popup


