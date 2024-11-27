package Com.myntra;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

public class InstaGram {
    public static AndroidDriver driver;
    @BeforeClass
    public void testCapablity() throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "ANDROID");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("deviceName", "Pixel7a");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appPackage", "com.instagram.android");
        caps.setCapability("appActivity", "com.instagram.mainactivity.InstagramMainActivity");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability("noReset", "true");
        caps.setCapability("autoGrantPermissions", "true");
        caps.setCapability("disableAndroidAnimations", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        Runtime.getRuntime().exec("adb shell settings put global zen_mode 1");
        Thread.sleep(3000);
        Runtime.getRuntime().exec("adb shell settings put global zen_mode 0");
    }
    @Test
    public void testInstagram() throws IOException, InterruptedException {

        WebElement posttab = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.instagram.android:id/tab_icon\"])[4]"));
        posttab.click();

       /* WebElement userName = driver.findElement(By.className("android.widget.EditText"));
        userName.sendKeys("p0617003@gmail.com");
        WebElement pass  = driver.findElement(By.className("android.view.ViewGroup"));
        pass.sendKeys("Colors@123");
       // driver.findElement(By.xpath("//android.view.View[@content-desc=\"Log in\"]")).click();*/
        System.out.println(driver.context());
        Set<String> webview = driver.getContextHandles();
        driver.switchTo().defaultContent();




    }
}
