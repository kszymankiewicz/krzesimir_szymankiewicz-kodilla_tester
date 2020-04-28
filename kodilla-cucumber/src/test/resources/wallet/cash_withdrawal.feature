Feature: Cash Withdrawal
  Scenario:  Successful withdrawal from wallet in credit
    Given I have deposited $200 in my wallet
    When  I request $30
    Then $30 should be dispensed

  Scenario:  Successful withdrawal from wallet in credit
    Given I have deposited $200 in my wallet
    When  I request $210
    Then $210 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $10
    Then $10 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $0
    Then $0 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $-50
    Then $-50 should be dispensed