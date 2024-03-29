package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPageController {

    @FindBy(xpath = "//*[@id='email']")WebElement inputEmail;
    @FindBy(id = "passwd")WebElement inputPasswd;
    @FindBy(css = "#SubmitLogin > span")WebElement logInButton;
    //@FindBy(xpath = "//a[@class='login']")WebElement signInButton;

    //@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a") WebElement signInButton;
    @FindBy(css = "a.login") WebElement signInButton;
    @FindBy(css= "span.navigation_page")WebElement authenticationTab;
    public LogInPageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void signInTab() {
        signInButton.isDisplayed();
    }
     public void login() throws InterruptedException {
         signInButton.click();
         Thread.sleep(1000);
         authenticationTab.isDisplayed();
         Assert.assertEquals(authenticationTab,authenticationTab);

         //inputEmail.sendKeys("test@gmail.com");
         //inputPasswd.sendKeys("123");
         //signInButton.click();

        }
       public void informationDesk(WebDriver driver,String information){
        driver.findElement(By.xpath("//a[contains(text(),'"+information+"')]")).isDisplayed();

       }

    public void inPutEmailOrPass(WebDriver driver,String inputEmailOrPass,String emailOrPass) {
driver.findElement(By.xpath("//*[@id='"+inputEmailOrPass+"']")).sendKeys(emailOrPass);

    }
    public void information(WebDriver driver,String specials) {
        driver.findElement(By.xpath("//*[@id='" + specials + "']")).sendKeys(specials);

    }

    public void signInButton(){
        signInButton.click();
    }

}


