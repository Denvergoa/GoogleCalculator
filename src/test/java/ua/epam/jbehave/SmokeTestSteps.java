package ua.epam.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import ua.epam.steps.UserSteps;

public class SmokeTestSteps {
    @Steps
    UserSteps userSteps;

    @Given("Open browser. Go to Google home page")
    public void anEmptyWindow (){
        userSteps.userOpensHomePage();
    }

    @Given("Go to Calculator page")
    public void calculatorPage () {
        userSteps.userOpensCalculatorPage();
    }

    @When("I add $firstNumber and $secondNumber")
    public void addTwoNumbers (@Named("$firstNumber") String firstNumber, @Named("$secondNumber") String secondNumber) {
        userSteps.clickAc();
        userSteps.inputNumber(firstNumber);
        userSteps.addOperation();
        userSteps.inputNumber(secondNumber);
        userSteps.equalOperation();
    }

    @When("I substract $firstNumber and $secondNumber")
    public void substractTwoNumbers (@Named("$firstNumber") String firstNumber, @Named("$secondNumber") String secondNumber) {
        userSteps.clickAc();
        userSteps.inputNumber(firstNumber);
        userSteps.substractOperation();
        userSteps.inputNumber(secondNumber);
        userSteps.equalOperation();
    }

    @When("I multiply $firstNumber and $secondNumber")
    public void multiplyTwoNumbers (@Named("$firstNumber") String firstNumber, @Named("$secondNumber") String secondNumber) {
        userSteps.clickAc();
        userSteps.inputNumber(firstNumber);
        userSteps.multiplyOperation();
        userSteps.inputNumber(secondNumber);
        userSteps.equalOperation();
    }

    @When("I divide $firstNumber and $secondNumber")
    public void divideTwoNumbers (@Named("$firstNumber") String firstNumber, @Named("$secondNumber") String secondNumber) {
        userSteps.clickAc();
        userSteps.inputNumber(firstNumber);
        userSteps.divideOperation();
        userSteps.inputNumber(secondNumber);
        userSteps.equalOperation();
    }

    @When("I click on calculator buttons")
    public void clickOnCalculatorButtons() {
        userSteps.checkCalculatorButtons();
    }

    @Then("I recieve correct $addResult from adding two numbers")
    public void correctAnswerFromAddingTwoNum (@Named("$addResult") String addResult){
        userSteps.checkCorrectAnswer(addResult);
    }

    @Then("I recieve correct $substractResult from substracting two numbers")
    public void correctAnswerFromSubstractingTwoNum (@Named("$substractResult") String substractResult){
        userSteps.checkCorrectAnswer(substractResult);
    }

    @Then("I recieve correct $multiplyResult from multiplying two numbers")
    public void correctAnswerFromMultiplyingTwoNum (@Named("$multiplyResult") String multiplyResult){
        userSteps.checkCorrectAnswer(multiplyResult);
    }

    @Then("I recieve correct $divideResult from dividing two numbers")
    public void correctAnswerFromDividingTwoNum (@Named("$divideResult") String divideResult){
        userSteps.checkCorrectAnswer(divideResult);
    }

    @Then("I recieve correct $result")
    public void correctAnswerFromButtonClicking (@Named("$result") String result){
        userSteps.checkCorrectAnswer(result);
    }


}
