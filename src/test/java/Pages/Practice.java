package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Practice
{
    WebDriver driver ;
    @FindBy( id ="tab-btn-web")
    WebElement autoAdvanceBtn ;
    @FindBy(id ="deviceType")
    WebElement deviceTypeField ;
    @FindBy(id = "brand")
    WebElement brandField ;
    @FindBy(id = "storage-128GB")
    WebElement selectStorageField ;
    @FindBy(id="color")
    WebElement selectColorField ;


    public Practice (WebDriver driver)
    {
        this.driver = driver ;
    }
    public void clickAutomationButton()
    {
        autoAdvanceBtn.click();
    }
    public void selectDeviceType()
    {
        Select select = new Select(deviceTypeField);
        select.selectByVisibleText("Phone");
    }
    public void selectBrand()
    {
        Select select = new Select(brandField);
        select.selectByVisibleText("Apple");
    }
public void selectStorage()
{
    selectStorageField.click();
}
public void selectColor() throws InterruptedException {
    Select select = new Select(selectColorField);
    Thread.sleep(5000);
    select.selectByVisibleText("Blue'");
}
}
