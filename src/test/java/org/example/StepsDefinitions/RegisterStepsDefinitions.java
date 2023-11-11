package org.example.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterStepsDefinitions {

    WebDriver driver = null;

    @Given("The browser opens the web page")
    public void the_browser_opens_the_web_page() {
        System.out.println("EN The browser opens the web page");
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");



    }

    @Given("The user selects the login option")
    public void the_user_selects_the_login_option() {
        System.out.println("en The user selects the login option");

        By loginLinkXpath = By.xpath("//*[@id=\"MenuContent\"]/a[2]");

        WebElement loginLink = driver.findElement(loginLinkXpath);
        loginLink.click();



    }

    @When("The user clicks {string}")
    public void the_user_clicks(String string) {
        System.out.println("en The user clicks Register Now!");

        By loginLinkXpath = By.xpath("//*[@id=\"Catalog\"]/a");

        WebElement loginLink = driver.findElement(loginLinkXpath);
        loginLink.click();


    }

    @When("The user enters User ID as {string}")
    public void the_user_enters_user_id_as(String string) {
        System.out.println("en The user enters User ID as "+string);
        By userIdInputName = By.name("username");
        WebElement userIdInput = driver.findElement(userIdInputName);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the password {string}")
    public void the_user_enters_the_password(String string){
        System.out.println("en The user enters the password "+string);
        By userPassword = By.name("password");
        WebElement userIdInput = driver.findElement(userPassword);
        userIdInput.sendKeys(string);


    }

    @When("The user re-enters the password {string}")
    public void the_user_re_enters_the_password(String string) {
        System.out.println("en he user re-enters the password "+string);
        By userPassword = By.name("repeatedPassword");
        WebElement userIdInput = driver.findElement(userPassword);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the first name {string}")
    public void the_user_enters_the_first_name(String string) {

        System.out.println("en The user enters the first name "+string);
        By userFirstName = By.name("account.firstName");
        WebElement userIdInput = driver.findElement(userFirstName);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the last name {string}")
    public void the_user_enters_the_last_name(String string) {

        System.out.println("en The user enters the last name "+string);
        By userLastName = By.name("account.lastName");
        WebElement userIdInput = driver.findElement(userLastName);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the email {string}")
    public void the_user_enters_the_email(String string){
        System.out.println("en The user enters the email "+string);
        By userEmail = By.name("account.email");
        WebElement userIdInput = driver.findElement(userEmail);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the phone {string}")
    public void the_user_enters_the_phone(String string) {
        System.out.println("en The user enters the phone "+string);
        By userPhone = By.name("account.phone");
        WebElement userIdInput = driver.findElement(userPhone);
        userIdInput.sendKeys(string);


    }

    @When("The user enters address line  {string}")
    public void the_user_enters_address_line(String string) {
        System.out.println("en The user enters address line "+string);
        By userAddress = By.name("account.address1");
        WebElement userIdInput = driver.findElement(userAddress);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the city {string}")
    public void the_user_enters_the_city(String string) {
        System.out.println("en The user enters the city "+string);
        By userCity = By.name("account.city");
        WebElement userIdInput = driver.findElement(userCity);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the state {string}")
    public void the_user_enters_the_state(String string) {
        System.out.println("en The user enters the state "+string);
        By userState = By.name("account.state");
        WebElement userIdInput = driver.findElement(userState);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the ZIP code {string}")
    public void the_user_enters_the_zip_code(String string) {
        System.out.println("en The user enters the ZIP code "+string);
        By userZip= By.name("account.zip");
        WebElement userIdInput = driver.findElement(userZip);
        userIdInput.sendKeys(string);


    }

    @When("The user enters the country {string}")
    public void the_user_enters_the_country(String string){
        System.out.println("en The user enters the country "+string);
        By userCountry= By.name("account.country");
        WebElement userIdInput = driver.findElement(userCountry);
        userIdInput.sendKeys(string);


    }

    @When("The user clicks on Save Account Information")
    public void the_user_clicks_on_save_account_information() {
        System.out.println("en The user clicks on Save Account Information");

        By SaveAccountBtnElement = By.name("newAccount");

        WebElement SaveAccountBtn = driver.findElement(SaveAccountBtnElement);
        SaveAccountBtn.click();


    }

    @Then("The registration is successful and You are redirected to the main page")
    public void the_registration_is_successful_and_you_are_redirected_to_the_main_page() {

        System.out.println("en The registration is successful and You are redirected to the main page");

        By mainImageContainer = By.id("MainImageContent");

        WebElement mainImageContent = driver.findElement(mainImageContainer);

        Assert.assertNotNull("El elemento con ID 'MainImageContent' (la imagen central) no está presente", mainImageContent);

        if (driver!=null){
            driver.quit();
        }


    }

}
