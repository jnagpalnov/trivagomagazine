<h3>TrivagoMagazine Website Automation</h3>
<p>I have automated the following two tests:</p>
<ul><li>Search for any location on magazine.trivago.com by using the search bar</li>
<li>Navigate to a destination through the menu on the top left</li>
</ul>
<h3>Programming Language and Automation Tools</h3>
<ul><li>Programming Language:<b>Java(jdk 1.8)</b></li>
  <li> Build Tool: Maven</li>
  <li> Selenium WebDriver: 3.141.0 </li>
  <li> Cucumber-java:1.2.5</li>
  <li>cluecumber-report-plugin:1.4.2</li>
  <li> IDE: IntelliJ IDEA 2017.1</li>
</ul>
<h3>Framework Overview</h3>
<p>The framework is based on page object design pattern and it's leveraging BDD using cucumber.The major components of the framework are:</p>
<ul><li> DriverFactory: singleton Class to intialize the Web Driver</li> <li> BaseClass: Contians all the reusable methods like find element, isElementPresent, GetElementText etc..</li><li>PageObjects: Application pages containing page methods and locators</li>
  <li>CentralData.Property: Containing Web application specific data such as Browser,Wait Timeout, App Url etc.. </li>
  <li>Stepdefinitions: Contain step definations of application pages.</li>
  <li>Features: Containing fetaures files</li>
  <li>TestRunner: Junit runner class</li>
  <li>Target/generated-report: Contains genertaed html report</li>
  </ul>
  <h3>Running Tests:</h3>
  <ul>
  <li>Run the "src/test/java/testrunner/Runner" class</li>
 <img src="https://preview.ibb.co/eufq50/first.png" alt="first" border="0">
 <br/>
 <h3>Test-Reports</h3>
 <p>HTML report is generated using trivago cluecumber-report-plugin:1.4.2</p>
 <img src="https://preview.ibb.co/ntvwdL/second.png" alt="second" border="0">
  </ul>
