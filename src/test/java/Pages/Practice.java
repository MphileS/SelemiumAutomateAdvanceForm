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
    @FindBy(id="quantity")
    WebElement quantityFiled ;
    @FindBy(id="address")
    WebElement addressField ;
    @FindBy(id="inventory-next-btn")
    WebElement inventoryField ;
    @FindBy(id="shipping-express")
    WebElement shippingOptionField ;
    @FindBy (id="warranty-1yr")
    WebElement warrantyField ;
    @FindBy (id="discount-code")
    WebElement discountField ;
    @FindBy (id="apply-discount-btn")
    WebElement applyDiscountField ;
     @FindBy (id ="purchase-device-btn")
     WebElement clickPurchaseButton ;
     @FindBy (id="view-history-btn")
     WebElement viewHistory;
    @FindBy(xpath = "//*[starts-with(@id, 'view-invoice-')]")
    WebElement viewInvoiceField ;

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
public void selectColor() throws InterruptedException
{
    Select select = new Select(selectColorField);
    Thread.sleep(5000);
    select.selectByVisibleText("Blue");
}
public void addQuantity(String quantity)
{
    quantityFiled.sendKeys(quantity);
}
public void addAddress(String address)

{
addressField.sendKeys(address);
}
public void clickNextButton()
{
    inventoryField.click(); ;
}
public void selectShippingOption()
{
    shippingOptionField.click();
}
public void selectWarranty()
{
    warrantyField.click();
}
public  void addDiscount (String discount)
{
    discountField.sendKeys(discount);
}
public void applyDiscount ()
{
    applyDiscountField.click();
}
    public void clickPurchaseButton ()
    {
       clickPurchaseButton.click();
    }
    public void viewInvoiceHistory ()
    {
        viewHistory.click();
    }
    public void viewInvoice ()
    {
 viewInvoiceField.click();
    }
}
