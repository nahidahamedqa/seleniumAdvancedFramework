package loginPageTest;

import base.ScriptBase;
import controller.LogInPageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {
LogInPageController logInPageController;

@Test
    public void verifySignInButtonDisplayed (){

    init();
  logInPageController =new LogInPageController(driver);
logInPageController.signInTab();

}
@Test
public void verifyLogIn(){
    logInPageController=new LogInPageController(driver);
    init();
    logInPageController.login();
}

@AfterTest
    public void afterTest (){
    driver.close();
driver.quit();
}

}



