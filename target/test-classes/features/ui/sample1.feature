@sample1
  Feature: login

    @wip1
    Scenario: user can login the system
      Given user goes the page
      When user enters username
      And user enters password
      Then user is on dashboard

    @wip
    Scenario: user can not login the system
      Given user goes the page
      When user enters wrong username
      And user enters wrong password
      Then user see alert message
