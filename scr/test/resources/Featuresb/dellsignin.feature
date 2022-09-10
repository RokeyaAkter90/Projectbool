Feature: This is dell signin functionality

@ra
Scenario: Verify user dell signin
Given Launch bool "<URL>"
Then Click on dell sigininlink
Then Fill out dell signin credentials and click signin button
Then Verify user dell signin


@ras
Scenario: Verify user dell signout
Given Launch bool "<URL>"
Then Click on dell sigininlink
Then Fill out dell signin credentials and click signin button
Then user click singout button
Then Verify user dell signout