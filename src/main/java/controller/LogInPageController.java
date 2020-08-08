package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageController {

    @FindBy(id = "email")WebElement inputEmail;
    @FindBy(id = "passwd")WebElement inputPasswd;
    @FindBy(css = "#SubmitLogin > span")WebElement logInButton;
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")WebElement signInButton;

    //@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a") WebElement signInButton;
    //@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a") WebElement signInButton;
    public LogInPageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void signInTab() {
        signInButton.isDisplayed();
    }
     public void login(){
         signInButton.click();
         inputEmail.sendKeys("test@gmail.com");
         inputPasswd.sendKeys("123");
         signInButton.click();
        }
    }

