package Utils;

import Pages.AddEmployeePage;
import Pages.LoginPage;

public class PageInitializer {


public static LoginPage loginPage;
public static AddEmployeePage addEmployeePage;



public static void initializePageObjects(){
    loginPage=new LoginPage();
    addEmployeePage = new AddEmployeePage();
}


}
