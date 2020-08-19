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
public void verifyLogIn() throws InterruptedException {
    logInPageController=new LogInPageController(driver);

    logInPageController.login();
}
@Test
public void verifyMyOrderText(){
    logInPageController=new LogInPageController(driver);
    logInPageController.informationDesk(driver,"My orders");
}
    @Test
    public void verifyMyPersonalInformationText(){
        logInPageController=new LogInPageController(driver);
        logInPageController.informationDesk(driver,"My personal info");
    }
@AfterTest
    public void afterTest (){
    driver.close();
driver.quit();
}

}



