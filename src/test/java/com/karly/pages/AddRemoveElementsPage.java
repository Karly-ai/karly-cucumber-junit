package com.karly.pages;

import com.karly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveElementsPage {

    public AddRemoveElementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[.='Delete']")
    public List<WebElement> deleteButton;

}
