package Steps;

import Pages.LoginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class LoginSteps extends CommonMethods {
    //public WebDriver driver;

   // LoginPage loginPage=new LoginPage();


    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
        openBrowserAndLaunchApplication();

        //driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().window().maximize();
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        // WebElement username = driver.findElement(By.name("txtUsername"));
        // username.sendKeys("admin");
        sendText(ConfigReader.read("userName"),loginPage.username);

       // WebElement password= driver.findElement(By.name("txtPassword"));
             // password.sendKeys("Hum@nhrm123");
        sendText(ConfigReader.read("password"),loginPage.password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        //WebElement LoginButton = driver.findElement(By.id("btnLogin"));
        //LoginButton.click();
        click(loginPage.LoginButton);

    }

    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        System.out.println("Test is Passed ");
    }

    @When("user click on PIM option")
    public void user_click_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimOption.click();
        click(pimOption);
    }

    @When("user clicks on Add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmpPimOption = driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmpPimOption.click();
        click(addEmpPimOption);
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
       // WebElement username = driver.findElement(By.name("txtUsername"));
       // WebElement password= driver.findElement(By.name("txtPassword"));
        sendText(ConfigReader.read("invaliduserName"),loginPage.username);
        sendText(ConfigReader.read("Password"),loginPage.password);


    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        System.out.println("error is shown");

    }


}
