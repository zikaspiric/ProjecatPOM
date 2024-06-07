package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {


    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");
    }

    @Test
    public void userCanLogin(){
        sidebarPage.clickOnPracticeButton();
        practicePage.clickOnGoToLogInPage();



    }
}
