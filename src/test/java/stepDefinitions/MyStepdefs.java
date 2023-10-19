package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyStepdefs {
    WebDriver driver;
    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
        driver = DriverFactory.initializeDriver();
     }

    @When("User opens URL {string}")
    public void userOpensURL(String url) {
        driver.navigate().to(url);
     }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String mail, String password) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(mail);
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
     }

    @And("Click on Login")
    public void clickOnLogin() {
        driver.findElement(By.cssSelector(".login-button")).click();
     }

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String title) {
        Assert.assertTrue(driver.getTitle().equals(title));
    }
    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
        driver.findElement(By.xpath("//*[text()='Logout']")).click();
        System.out.println("User click on Log out link");
    }

    @And("close browser")
    public void closeBrowser() {
        driver.quit();
   }
}
