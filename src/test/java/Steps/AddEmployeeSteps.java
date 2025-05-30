package Steps;

import Pages.AddEmployeePage;
import Utils.CommonMethods;
import Utils.ExcelReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    AddEmployeePage addEmployeePage=new AddEmployeePage();

    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
       // WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        // WebElement LastNameLocator = driver.findElement(By.id("lastName"));
        // firstNameLocator.sendKeys("mark");
        //LastNameLocator.sendKeys("jacob");
        sendText("mark",addEmployeePage.firstNameLocator);
        sendText("jacob",addEmployeePage.LastNameLocator);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //WebElement saveButton = driver.findElement(By.id("btnSave"));
        //saveButton.click();
        click(addEmployeePage.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println(" Steps will be implemented later");
    }

    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
       // WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        //firstNameLocator.sendKeys("mark");
        sendText("mark",addEmployeePage.firstNameLocator);

        //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        //middleNameLocator.sendKeys("ms");
        sendText("ms",addEmployeePage.middleNameLocator);

        //WebElement LastNameLocator = driver.findElement(By.id("lastName"));
       // LastNameLocator.sendKeys("jacob");
        sendText("jacob",addEmployeePage.LastNameLocator);
    }

    @When("user enters {string} and {string} and {string} in the application")
    public void user_enters_and_and_in_the_application(String firstName, String middleName, String lastName) {
        //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        //WebElement LastNameLocator = driver.findElement(By.id("lastName"));

        //firstNameLocator.sendKeys(firstName);
        //middleNameLocator.sendKeys(middleName);
        //LastNameLocator.sendKeys(lastName);
        sendText(firstName,addEmployeePage.firstNameLocator);
        sendText(middleName,addEmployeePage.middleNameLocator);
        sendText(lastName,addEmployeePage.LastNameLocator);
    }

    @When("user add {string} , {string} and {string}")
    public void user_add_and(String fn, String mn, String ln) {
       // WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        //WebElement LastNameLocator = driver.findElement(By.id("lastName"));

        //firstNameLocator.sendKeys(fn);
        //middleNameLocator.sendKeys(mn);
        //LastNameLocator.sendKeys(ln);
        sendText(fn,addEmployeePage.firstNameLocator);
        sendText(mn,addEmployeePage.middleNameLocator);
        sendText(ln,addEmployeePage.LastNameLocator);
    }

    @When("user adds multiple employees using data table and save them")
    public void user_adds_multiple_employees_using_data_table_and_save_them
            (io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> employeeNames = dataTable.asMaps();
        for (Map<String, String> employee : employeeNames
        ) {
           // WebElement firstNameLocator = driver.findElement(By.id("firstName"));
            // WebElement middleNameLocator = driver.findElement(By.id("middleName"));
            // WebElement LastNameLocator = driver.findElement(By.id("lastName"));

            addEmployeePage.firstNameLocator.sendKeys(employee.get("firstName"));
            addEmployeePage.middleNameLocator.sendKeys(employee.get("middleName"));
            addEmployeePage.LastNameLocator.sendKeys(employee.get("lastName"));

            //WebElement saveButton = driver.findElement(By.id("btnSave"));
            addEmployeePage.saveButton.click();

            WebElement addEmpPimOption = driver.findElement(By.id("menu_pim_addEmployee"));
            addEmpPimOption.click();

        }
    }

    @When("user adds multiple employees from excel file")
    public void user_adds_multiple_employees_from_excel_file() throws IOException {
        List<Map< String,String>> newEmployees = ExcelReader.read();
        for (Map<String,String> employee: newEmployees) {
            // WebElement firstNameLocator = driver.findElement(By.id("firstName"));
            // WebElement middleNameLocator = driver.findElement(By.id("middleName"));
            // WebElement LastNameLocator = driver.findElement(By.id("lastName"));

            addEmployeePage.firstNameLocator.sendKeys(employee.get("firstName"));
            addEmployeePage.middleNameLocator.sendKeys(employee.get("middleName"));
            addEmployeePage.LastNameLocator.sendKeys(employee.get("lastName"));

           // WebElement saveButton = driver.findElement(By.id("btnSave"));
            addEmployeePage.saveButton.click();

            WebElement addEmpPimOption = driver.findElement(By.id("menu_pim_addEmployee"));
            addEmpPimOption.click();

        }
    }


}
