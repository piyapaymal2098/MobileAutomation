package Com.myntra;

import Pages.HomePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Random;

public class CartTest extends BaseClass{
    @Test
    public void testCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        HomePage  hp= new HomePage(driver);
        hp.closeDialog.click();
        hp.image.click();
        hp.FWd.click();
        hp.women.click();
        hp.Dresses.click();
        hp.dress_image.click();
        hp.Bag.click();
        hp.size.click();
        hp.ssize.click();
        hp.done_button.click();
        hp.addToBag.click();
      //  hp.go_to_bag.click();
      // WebElement go_to_bag = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Go to Bag\")"));
        //hp.go_to_bag.click();
      //  TouchAction action = new TouchAction(driver);
     //   action.tap(new TapOptions().withElement(ElementOption.element(hp.go_to_bag))).perform();
      //  action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hp.go_to_bag))).perform();

        hp.PlaceOrder.click();
    }
    @Test
    public void TakeScreenShot() throws IOException {
    /*    Random r= new Random();
        int randint = r.nextInt();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        HomePage  hp= new HomePage(driver);
        hp.closeDialog.click();
        hp.image.click();
        hp.FWd.click();
        hp.women.click();
        hp.Dresses.click();
        Runtime.getRuntime().exec("adb shell screencap -p /sdcard/Pictures/myntra.png");
        hp.dress_image.click();
// Run the adb command to take a screenshot and save it to device's /sdcard/ directory


/*
        TakesScreenshot ts= (TakesScreenshot)driver;
        File scrfile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir")+"myntra_SEcreenshot.png");
        Files.copy(scrfile.toPath(), destFile.toPath());*/

      /*  int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        // Coordinates for pinch-in action
        int startX1 = (int) (width * 0.75);
        int startY1 = (int) (height * 0.5);
        int endX1 = (int) (width * 0.25);
        int endY1 = (int) (height * 0.5);

        // Create TouchAction for pinch-in (zoom-out)
        TouchAction<?> action = new TouchAction<>(driver);
        action.press(PointOption.point(startX1, startY1))
                .moveTo(PointOption.point(endX1, endY1))
                .release()
                .perform();

        action.press(PointOption.point(endX1, endY1))
                .moveTo(PointOption.point(startX1, startY1))
                .release()
                .perform();
        //=============================================================================
        int width1 = driver.manage().window().getSize().getWidth();
        int height1 = driver.manage().window().getSize().getHeight();

        // Coordinates for pinch-out action
        int startX2 = (int) (width1 * 0.25);
        int startY2 = (int) (height1 * 0.5);
        int endX2 = (int) (width1 * 0.75);
        int endY2 = (int) (height1 * 0.5);

        // Create TouchAction for pinch-out (zoom-in)
        TouchAction<?> action1 = new TouchAction<>(driver);
        action.press(PointOption.point(startX1, startY1))
                .moveTo(PointOption.point(endX1, endY1))
                .release()
                .perform();*/
     /*   action.press(PointOption.point(endX1, endY1))
                .moveTo(PointOption.point(startX1, startY1))
                .release()
                .perform();*/



    }


}
