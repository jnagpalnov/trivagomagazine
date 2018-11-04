package baseclasses;

import commonutils.CommonUtils;
import driversetup.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Jatin on 11/3/2018.
 */
public class BasePage {
    public WebDriver driver;
    WebDriverWait wait;

    protected BasePage(){
        this.driver= DriverFactory.getInstanceOfDriverFactory().getDriver();
        setWait(Integer.parseInt(CommonUtils.getCentralData("WaitTimeoutInSeconds")));
    }

    /**
     * @param by
     * @return wait for visibility of element and then return true if element is present else false
     */
    protected boolean isElementPresent(By by){
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by)) != null;
        }
        catch (TimeoutException ex){
            return false;
        }
    }

    /**
     * @param by
     * @return return inner text of the element
     */
    protected String getElementText(By by){
        return find(by).getText();
    }

    /**
     * @param by
     * @return return list of web elements
     */
    protected List<WebElement> findElements(By by){
        try {
            return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        }
        catch (TimeoutException ex){
            return null;
        }
    }

    protected WebElement find(By by){
        try {
           // wait.until(ExpectedConditions.stalenessOf(driver.findElement(by)));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        catch (TimeoutException ex){
            return null;
        }
    }

    protected void clickElement(WebElement webElement){
        webElement.click();
    }

    protected void clickJS(WebElement webElement){
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()",webElement);
    }

    protected void pressEnter(WebElement webElement){
        webElement.sendKeys(Keys.ENTER);
    }

    protected void enterText(WebElement webElement, String text){
        webElement.sendKeys(text);
    }

    private void setWait(long timeoutInSeconds ){
        wait=new WebDriverWait(driver,timeoutInSeconds);
    }
}
