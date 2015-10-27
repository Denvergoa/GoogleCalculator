Meta:

Narrative:
As a user
I want to divide two numbers
So that I can recieve correct answer

Scenario: Dividing two numbers
Given Open browser. Go to Google home page
And Go to Calculator page
When I divide $firstNumber and $secondNumber
Then I recieve correct $divideResult from dividing two numbers

Examples:
|$firstNumber|$secondNumber|$divideResult
|10|5|2
|0|2147483648|0
|-2147483648|2147483648|-1
|50|4|12.5
|10.1||Error
|0|0|Error
|1||Error
|10|0|Infinity
|-10|0|-Infinity



