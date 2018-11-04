package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import pageobjects.DestinationPage;

import java.util.List;

/**
 * Created by Jatin on 11/4/2018.
 */
public class DestinationPageSteps {
    DestinationPage destinationPage=new DestinationPage();

    @Then("^User is navigated to the \"([^\"]*)\" page$")
    public void verifyDestinationPageContents(String destination) throws Throwable{
        destinationPage.verifyDestinationPageHeader(destination);
        destinationPage.verifyArticles(destination);
    }
}
