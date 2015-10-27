package ua.epam.jbehave;

import net.serenitybdd.jbehave.SerenityStories;

public class TestsStarter extends SerenityStories {
    public TestsStarter() {
        runSerenity().inASingleSession();
    }
}
