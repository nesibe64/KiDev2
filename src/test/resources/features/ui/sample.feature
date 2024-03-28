@sample
  Feature: login

    Scenario Outline: login attemps
      Given user try to login with "<data>"
      Then user checks each attemp result and reposrts
      Then app close
      Examples: test data
        | data |
        | ...  |
        | ...  |
        | ...  |
        | ...  |
