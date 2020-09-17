package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegSteps {
    WebDriver driver;
    @Given("^I navigate to angularjs site$")
    public void i_Navigate_To_Angularjs_site() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://angularjs.realworld.io/#/");
    }

    @And("^I click on sign up$")
    public void iClickOnSignUp() {
        driver.findElement(By.xpath("//a[@ui-sref='app.register']")).click();
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    @And("^I click on sign up (\\d+)$")
    public void iClickOnSignUp(int arg0) {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^am logged in with account name displayed$")
    public void amLoggedInWithAccountNameDisplayed() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//div[@class='article-preview']")).isDisplayed();

        String accountName = driver.findElement(By.xpath("//*[@class= 'nav-link ng-binding']")).getText();
        Assert.assertEquals(accountName,"Dada5xu");

    }

    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.quit();
    }
}
