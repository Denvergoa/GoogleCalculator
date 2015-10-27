Meta:

Narrative:
As a user
I want to click on calculator buttons
So that I recieve correct result

Scenario: Calculator buttons check
Given Open browser. Go to Google home page
And Go to Calculator page
When I click on calculator buttons
Then I recieve correct $result

Examples:
|result
|98765432.01
