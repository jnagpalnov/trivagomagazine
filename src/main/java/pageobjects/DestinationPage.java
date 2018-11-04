package pageobjects;

import baseclasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jatin on 11/4/2018.
 */
public class DestinationPage extends BasePage {
    By spinnerWithDisplayNone= By.xpath("//div[@class='v-spinner' and @style='display: none;']");
    By searchResultArticleDetails=By.cssSelector(".row>.article-card .card-vertical .details");
    By articleCard= By.cssSelector(".posts-section .row>.article-card .card-vertical");

    public void verifyDestinationPageHeader(String destination){
        find(spinnerWithDisplayNone);
        By title=By.cssSelector(".hero-title");
        String actualTitle=getElementText(title);
        Assert.assertTrue("Header title '"+actualTitle+"' is not equal to " +destination,getElementText(title).equalsIgnoreCase(destination));
    }

    public void verifyArticles(String destination){
        Assert.assertTrue("No article card is present",findElements(articleCard).size()>=1);
        for(WebElement articleDetails: findElements(searchResultArticleDetails)) {
            Assert.assertTrue("Article doesn't contain " + destination, articleDetails.getText().contains(destination.toUpperCase()));
        }
    }
}
