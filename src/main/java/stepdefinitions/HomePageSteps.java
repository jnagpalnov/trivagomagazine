package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;

import java.util.List;

/**
 * Created by Jatin on 11/4/2018.
 */
public class HomePageSteps {
    HomePage homePage=new HomePage();

    @When("^User search \"([^\"]*)\"$")
    public void search(String text) throws Throwable{
        System.out.println("hhhhhh");
        homePage.clickSearchIcon();
        homePage.enterSearchText(text);
    }

    @Then("^Search results should contain articles for \"([^\"]*)\"$")
    public void verifySearchResults(String destination) throws Throwable{
     homePage.verifySearchResults(destination);
    }

    @When("^User click the top left navigation menu icon$")
    public void clickTopLeftMenu() throws Throwable {
        homePage.clickNavIcon();
    }

    @Then("^Destination menu cards should be displayed$")
    public void verifyDestinationMenuCards(DataTable table){
        List<String> menuCardsList=table.asList(String.class);
        homePage.verifyDestinationMenuCardsPresent(menuCardsList);
    }

    @And("User clicks the \"([^\"]*)\" menu card$")
    public void clickDestinationMenuCard(String destinationMenuCard){
        homePage.clickMenuCard(destinationMenuCard);
    }

    @Given("Newsletter agreement checkbox, email text-field and \"([^\"]*)\" button are present on the page")
    public void clickDestinationMenuCard1(String destinationMenuCard){
        homePage.clickMenuCard(destinationMenuCard);
    }
}
