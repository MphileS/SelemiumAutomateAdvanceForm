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
        Thread.sleep(5000);
    }
    @Test(dependsOnMethods = "selectColorTest")
    public void addQuantityTest()
    {
        practice.addQuantity("2");
    }
    @Test(dependsOnMethods = "addQuantityTest")
    public void addAddressTest()
    {
        practice.addAddress("06 Polaris street ,Pioneer Valley");
    }
     @Test(dependsOnMethods = "addAddressTest")
    public void clickNextButtonTest()
    {
        practice.clickNextButton();
    }
    @Test(dependsOnMethods = "clickNextButtonTest")
    public void selectShippingOptionTest()
    {
        practice.selectShippingOption();
    }
    @Test(dependsOnMethods = "selectShippingOptionTest")
    public void selectWarrantyOptionTest()
    {
        practice.selectWarranty();
    }
    @Test(dependsOnMethods = "selectWarrantyOptionTest")
    public void addDiscountTest()
    {
        practice.addDiscount("SAVE10");
    }
    @Test(dependsOnMethods = "addDiscountTest")
    public void applyDiscountTest()
    {
        practice.applyDiscount();
    }
    @Test(dependsOnMethods = "applyDiscountTest")
    public void clickPurchaseButton()
    {
        practice.clickPurchaseButton();
    }
    @Test(dependsOnMethods = "clickPurchaseButton")
    public void viewInvoiceHistoryTest() throws InterruptedException {
        Thread.sleep(5000);
        practice.viewInvoiceHistory();
    }
    @Test(dependsOnMethods = "viewInvoiceHistoryTest")
    public void viewInvoiceTest()
    {
        practice.viewInvoice();
    }

}
