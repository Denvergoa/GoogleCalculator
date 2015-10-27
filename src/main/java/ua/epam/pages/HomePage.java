package ua.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.google.com.ua")
public class HomePage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElementFacade searchField;

    public void openCalculator() {
        searchField.type("Калькулятор");
        searchField.submit();
    }
}