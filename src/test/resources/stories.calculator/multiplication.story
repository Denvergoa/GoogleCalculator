Meta:

Narrative:
As a user
I want to multiply two numbers
So that I can recieve correct answer

Scenario: Multiplying two numbers
Given Open browser. Go to Google home page
And Go to Calculator page
When I multiply $firstNumber and $secondNumber
Then I recieve correct $multiplyResult from multiplying two numbers

Examples:
|$firstNumber|$secondNumber|$multiplyResult
|10|5|50
|0|2147483648|0
|-2147483648|0|0
|-2147483648|-1|2147483648
|10|10.1|101
|10.1||Error
|1||Error


