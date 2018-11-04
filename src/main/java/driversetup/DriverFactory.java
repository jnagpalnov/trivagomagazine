package driversetup;

import commonutils.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Jatin on 11/3/2018.
 */
public class DriverFactory {
    private WebDriver driver;

    /**
     * Singleton class
     */
    private DriverFactory() {
        initializeWebDriver();
    }

    private static DriverFactory instanceOfDriverFactory;

    public static DriverFactory getInstanceOfDriverFactory() {
        if(instanceOfDriverFactory ==null)
        {
            instanceOfDriverFactory = new DriverFactory();
        }
        return instanceOfDriverFactory;
    }

    /**
     * Initialize Web driver
     */
    private void initializeWebDriver()  {
        String browser= CommonUtils.getCentralData("Browser");

       if(browser.equalsIgnoreCase("Chrome")) {
           System.setProperty("webdriver.chrome.driver",CommonUtils.getCentralData("ChromeDriverExePath"));
           ChromeOptions options=new ChromeOptions();
           driver = new ChromeDriver();
       }
       else if(browser.equalsIgnoreCase("Firefox")){
           System.setProperty("webdriver.firefox.marionette",CommonUtils.getCentralData("FirefoxDriverExePath"));
           driver = new FirefoxDriver();
       }
       else {
           System.setProperty("webdriver.ie.driver",CommonUtils.getCentralData("IEDriverExePath"));
           driver = new InternetExplorerDriver();
       }
    }

    /**
     * @return instance of Webdriver
     */
    public WebDriver getDriver(){
        return  driver;
    }

    /**
     *  Set driverfactory instance null and quit Webdriver
     */
    public void quit(){
        instanceOfDriverFactory=null;
        driver.quit();
    }
}
