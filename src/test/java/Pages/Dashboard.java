package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard
{
    WebDriver driver;
    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[2]/div[1]/button")
    WebElement learnField ;
    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learnmaterialField ;
    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLearn() {
        learnField.click();
    }
    public void selectLearning() throws InterruptedException {
        Thread.sleep(5000);
        learnmaterialField.click();
    }
}
