package Tests;

import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public void clickLoginButton() throws InterruptedException
    {
     homePage.clickLoginButton();
    }
    @Test(dependsOnMethods = "clickLoginButton")
    public void enterUsernameTests(){loginPage.enterUsername("nkosimphileshoyisa@gmail.com");}

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){loginPage.enterPassword("Password123#");}

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTest(){loginPage.clicklogin();}

    @Test(dependsOnMethods = "clickLoginTest")
    public void clickLearnTest(){dashboard.clickLearn();}

    @Test(dependsOnMethods = "clickLearnTest")
    public void selectLearnMaterialTest() throws InterruptedException {dashboard.selectLearning();}

    @Test(dependsOnMethods= "selectLearnMaterialTest")
    public void clickAutomationButtonTest() {practice.clickAutomationButton();}

    @Test(dependsOnMethods = "clickAutomationButtonTest")
    public void selectDeviceTypeTest()
    {practice.selectDeviceType();}

    @Test(dependsOnMethods  ="selectDeviceTypeTest")
    public void selectBrandTest()
    {
        practice.selectBrand();
    }
    @Test(dependsOnMethods ="selectBrandTest")
    public void selectStorageTest()
    {
        practice.selectStorage();

    }
    @Test(dependsOnMethods ="selectStorageTest")
    public void selectColorTest() throws InterruptedException {
        practice.selectColor();

    }
}
