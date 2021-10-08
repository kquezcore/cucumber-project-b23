Feature: Eating too many cucumbers may not be good for you
  Eating too much of anything may not be good for you

  Example: Eating a few is no problem
    Given karina  is hungry
    When she eats 3 cucumbers
    Then she will be full

  Example: Eating too many is problem
    Given Ivana is hungry
    When she eats 10 cucumbers
    Then she faints