package Com.myntra;

import Pages.HomePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyntraTest extends BaseClass{
    @Test
    public void myntraTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        HomePage  hp= new HomePage(driver);
        hp.closeDialog.click();
        hp.image.click();
//        hp.top.click();
//        hp.Anouk.click();
//        hp.AnoukFullimg.click();
//        hp.AddtoBag.click();
//        hp.SizeS.click();
//        hp.buyDone.click();
//        hp.GoToBag.click();

        hp.BagButton.click();
    }

}
