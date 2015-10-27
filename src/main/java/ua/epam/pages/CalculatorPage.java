package ua.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CalculatorPage extends PageObject {

    @FindBy(xpath = "//ol//div[5]/div[4]/div/span")
    private WebElementFacade addButton;
    @FindBy(xpath = "//ol//div[4]/div[4]/div/span")
    private WebElementFacade substractButton;
    @FindBy(xpath = "//ol//div[2]/div[4]/div/span")
    private WebElementFacade divideButton;
    @FindBy(xpath = "//ol//div[3]/div[4]/div/span")
    private WebElementFacade multiplyButton;
    @FindBy(xpath = "//ol//div[1]/div[4]/div/span")
    private WebElementFacade acButton;
    @FindBy(xpath = "//ol//div[2]/div[5]/div[3]//span")
    private WebElementFacade equalButton;
    @FindBy(xpath = "//*[@id='cwos']")
    private WebElementFacade resultField;
    @FindBy(xpath = "//*[@id='cwtltblr']")
    public WebElementFacade inputField;
    //buttons
    @FindBy(xpath = "//ol//div[2]/div[5]/div[1]//span")
    private WebElementFacade numberZero;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[4]/div[1]//span")
    private WebElementFacade numberOne;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[4]/div[2]//span")
    private WebElementFacade numberTwo;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[4]/div[3]//span")
    private WebElementFacade numberThree;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[3]/div[1]//span")
    private WebElementFacade numberFour;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[3]/div[2]//span")
    private WebElementFacade numberFive;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[3]/div[3]//span")
    private WebElementFacade numberSix;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[2]/div[1]//span")
    private WebElementFacade numberSeven;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[2]/div[2]//span")
    private WebElementFacade numberEight;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[2]/div[3]//span")
    private WebElementFacade numberNine;
    @FindBy(xpath = "//ol//div[2]/div[5]/div[2]//span")
    private WebElementFacade buttonDecimal;

    public void checkButtons() {
        numberNine.click();
        numberEight.click();
        numberSix.click();
        numberFive.click();
        numberFour.click();
        numberThree.click();
        numberTwo.click();
        buttonDecimal.click();
        numberZero.click();
        numberOne.click();
    }
    public void enterNumber(String number) {
        inputField.sendKeys(number);
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void clickSubstractButton() {
        substractButton.click();
    }

    public void clickMultiplyButton() {
        multiplyButton.click();
    }

    public void clickDivideButton() {
        divideButton.click();
    }

    public void clickEqualsButton() {
        equalButton.click();
    }

    public void clickAcButton() {
        acButton.click();
    }

    public boolean checkResult(String result) {
        return resultField.getText().equals(result);
    }

}
