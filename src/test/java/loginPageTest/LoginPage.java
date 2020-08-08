package loginPageTest;

import base.ScriptBase;
import controller.LogInPageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {
LogInPageController logInPageController;
@BeforeTest
public void BeforeTest(){
    init();
}

@Test
    public void verifySignInButtonDisplayed (){

  logInPageController =new LogInPageController(driver);
logInPageController.signInTab();

}
@Test
public void verifyLogIn(){
    logInPageController=new LogInPageController(driver);

    logInPageController.login();
}

@AfterTest
    public void afterTest (){
    driver.close();
driver.quit();
}

}



