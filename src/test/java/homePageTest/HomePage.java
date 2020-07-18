package homePageTest;

import base.ScriptBase;
import controller.HomePageController;
import org.testng.annotations.Test;

public class HomePage extends ScriptBase {
    HomePageController hpc;
    @Test
    public void verifyContactUsButtonDisplayed(){
        init();
        hpc=new HomePageController(driver);
        hpc.contactUsTab();
    }

    @Test
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
