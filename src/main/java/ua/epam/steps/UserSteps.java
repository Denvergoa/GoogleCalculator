package ua.epam.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ua.epam.pages.CalculatorPage;
import ua.epam.pages.HomePage;

public class UserSteps extends ScenarioSteps {
    HomePage homePage;
    CalculatorPage calculatorPage;

    @Step
    public void userOpensHomePage() {
        homePage.open();
    }

    @Step
    public void userOpensCalculatorPage() {
        homePage.openCalculator();
    }

    @Step
    public void inputNumber(String number) {
        calculatorPage.enterNumber(number);
    }

    @Step
    public void addOperation() {
        calculatorPage.clickAddButton();
    }

    @Step
    public void substractOperation() {
        calculatorPage.clickSubstractButton();
    }

    @Step
    public void multiplyOperation() {
        calculatorPage.clickMultiplyButton();
    }

    @Step
    public void divideOperation() {
        calculatorPage.clickDivideButton();
    }

    @Step
    public void equalOperation() {
        calculatorPage.clickEqualsButton();
    }


    @Step
    public void clickAc() {
        calculatorPage.clickAcButton();
    }

    @Step
    public void checkCalculatorButtons() {
        calculatorPage.checkButtons();
    }

    @Step
    public void checkCorrectAnswer(String result) {
        calculatorPage.checkResult(result);
    }
}


