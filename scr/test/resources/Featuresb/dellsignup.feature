Feature: This is dell signup functionality

@ra
Scenario: Verify user dell signup
Given Launch bool "<URL>"
Then Click on siginin and createacc link
Then Fill out dell signup credentials
When click on createaccount button
Then Verify UseLog user dell signup