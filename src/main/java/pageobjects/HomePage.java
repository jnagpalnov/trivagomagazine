package pageobjects;

import baseclasses.BasePage;
import driversetup.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jatin on 11/4/2018.
 */
public class HomePage extends BasePage {

    By searchIcon=By.className("search-icon");
    By searchTextField=By.cssSelector(".search-input");
    By searchResultTitle=By.cssSelector(".search-results .section-title");
    By articleCard=By.cssSelector(".search-results .row>.article-card");
    By searchResultArticleDetails=By.cssSelector(".search-results .row>.article-card .details");
    By closedMenu=By.xpath("//div[@id='menu' and contains(@style,'display: none;')]");

    public void clickSearchIcon(){
        clickElement(find(searchIcon));
    }

    public void enterSearchText(String text){
        enterText(find(searchTextField),text);
        pressEnter(find(searchTextField));
    }

    public void verifySearchResults(String destination){
        String heading=getElementText(searchResultTitle);
        Assert.assertTrue(heading.contains("Search Results"));
        int numberOfArticleInSearchResultText=Integer.parseInt(heading.substring(0,heading.indexOf(" ")));

        if(numberOfArticleInSearchResultText==0){
            Assert.fail("Search results for destination + '"+destination+ "' is 0");
        }

        Assert.assertTrue(findElements(articleCard).size()==numberOfArticleInSearchResultText);
        for(WebElement articleDetails: findElements(searchResultArticleDetails)) {
            Assert.assertTrue(articleDetails.getText().contains(destination) || articleDetails.getText().contains(destination.toUpperCase()));
        }
     }

     public void clickNavIcon(){
        By navIcon=By.className("nav-icon");
        clickElement(find(navIcon));
     }

     public void verifyDestinationMenuCardPresent(String destinationMenuCard){
         By destinationMenu=By.xpath("//div[@class='destination-menu' and contains(.,'"+destinationMenuCard+"')]");
         Assert.assertNotNull("Menu card '"+ destinationMenuCard+"' is not present",find(destinationMenu));
     }

     public void verifyDestinationMenuCardsPresent(List<String> destinationMenuCardsList){
         Assert.assertFalse("Menu drawer is closed",isElementPresent(closedMenu));
         for(String destinationMenuCard:destinationMenuCardsList) {
             verifyDestinationMenuCardPresent(destinationMenuCard);
         }
     }

    public void clickMenuCard(String destinationMenuCard) {
        By destinationMenu=By.xpath("//div[@class='destination-menu' and contains(.,'"+destinationMenuCard+"')]");
        clickJS(find(destinationMenu));
    }
}
