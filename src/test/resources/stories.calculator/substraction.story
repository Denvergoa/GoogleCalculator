Meta:

Narrative:
As a tester
I want to substract two numbers
So that I can recieve correct answer

Scenario: Substracting two numbers
Given Open browser. Go to Google home page
And Go to Calculator page
When I substract $firstNumber and $secondNumber
Then I recieve correct $substractResult from substracting two numbers

Examples:
|$firstNumber|$secondNumber|$substractResult
|10|5|5
|0|2147483648|-2147483648
|-2147483648|0|-2147483648
|-2147483648|2147483648|-4294967296
|10|10.11|-0.11
|10.1||Error
|1||Error

