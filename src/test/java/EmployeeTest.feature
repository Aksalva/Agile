Feature: Employee tests

    Scenario: Test employee creation
        Given I create a new employee with id 0, name "Saurav", salary 20000, job title "SDE" and department "CSE"
        Then the employee's id should be 0
        And the employee's name should be "Saurav"
        And the employee's salary should be 20000
        And the employee's job title should be "SDE"
        And the employee's department should be "CSE"

    Scenario: Test employee creation
        Given I create a new employee with id 1, name "Gorakh", salary 10000, job title "SDE" and department "CSE"
        Then the employee's id should be 1
        And the employee's name should be "Gorakh"
        And the employee's salary should be 10000
        And the employee's job title should be "SDE"
        And the employee's department should be "CSE"

    Scenario: Test employee creation
        Given I create a new employee with id 2, name "Tannu", salary 50000, job title "Designer" and department "Development"
        Then the employee's id should be 2
        And the employee's name should be "Tannu"
        And the employee's salary should be 50000
        And the employee's job title should be "Designer"
        And the employee's department should be "Development"

    Scenario: Test employee creation
        Given I create a new employee with id 3, name "Dheeraj", salary 20000, job title "Web Developer" and department "Development"
        Then the employee's id should be 3
        And the employee's name should be "Dheeraj"
        And the employee's salary should be 20000
        And the employee's job title should be "Web Developer"
        And the employee's department should be "Development"

    Scenario: Test employee creation
        Given I create a new employee with id 4, name "Saurav", salary 100000, job title "Backend Developer" and department "Development"
        Then the employee's id should be 4
        And the employee's name should be "Saurav"
        And the employee's salary should be 100000
        And the employee's job title should be "Backend Developer"
        And the employee's department should be "Development"