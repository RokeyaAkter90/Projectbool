Feature: This is bool signup functionality

@test
Scenario: Verify user dell signup
Given Launch bool "<URL>"
Then Click on menu and service and signup link
Then Fill out bool signup credentials
When click on Joinbutton
Then Verify UseLog user bool signup