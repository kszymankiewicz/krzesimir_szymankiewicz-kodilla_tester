Feature: Fizz or Buzz ?


  Scenario Outline:  Should return proper FixxBuzz indicator depending on number divisibility
    Given the number is <nr>
    When I ask whether it's divisible by <divisor>
    Then I should be told <answer>

    Examples:
      | nr | divisor | answer     |
      | 27 | 3       | "Nope"     |
      | 13 | 5       | "Nope"     |
      | -7 | 3       | "Nope"     |
      | 3  | 3       | "Fizz"     |
      | 6  | 3       | "Fizz"     |
      | -6 | 3       | "Fizz"     |
      | 15 | 3       | "FizzBuzz" |
      | 15 | 5       | "FizzBuzz" |
