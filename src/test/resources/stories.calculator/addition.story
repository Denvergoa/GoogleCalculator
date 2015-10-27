Meta:

Narrative:
As a user
I want to add two numbers
So that I can recieve correct answer

Scenario: Adding two numbers
Given Open browser. Go to Google home page
And Go to Calculator page
When I add $firstNumber and $secondNumber
Then I recieve correct $addResult from adding two numbers

Examples:
|$firstNumber|$secondNumber|$addResult
|10|5|15
|0|2147483648|2147483648
|-2147483648|0|-2147483648
|-2147483648|2147483648|0
|10|10.11|20.11
|10.1||Error
|1||Error

