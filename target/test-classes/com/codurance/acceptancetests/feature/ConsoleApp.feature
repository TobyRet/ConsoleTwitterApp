Feature: Post a message

  Scenario: Post message to console

    Given I have a message "Does anyone like beer?"
    When I post my message
    And view my timeline
    Then I should see "Does anyone like beer?"

  Scenario: View timeline

    Given I post a message "Does anyone like beer?"
    When I view my timeline
    Then I should see "Does anyone like beer?"

