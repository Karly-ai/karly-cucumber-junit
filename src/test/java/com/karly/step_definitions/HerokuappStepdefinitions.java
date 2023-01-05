package com.karly.step_definitions;

import com.karly.pages.AddRemoveElementsPage;
import com.karly.utilities.ConfigurationReader;
import com.karly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HerokuappStepdefinitions {

    AddRemoveElementsPage page = new AddRemoveElementsPage();

    @Given("User is on the herokuapp page")
    public void userIsOnTheHerokuappPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User clicks {int} times Add Element button")
    public void userClicksTimesAddElementButton(int times) {
        for (int i = 0; i < times; i++) {
            page.addElementButton.click();
        }

    }

    @Then("{int} number of Delete button should appear on the page")
    public void numberOfDeleteButtonShouldAppearOnThePage(int number) {
        List<WebElement> deleteButtons = page.deleteButton;
        Assert.assertTrue(number == deleteButtons.size());

    }
}
