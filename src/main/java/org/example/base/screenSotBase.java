package org.example.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class screenSotBase {

    public static AndroidDriver driver;

    @BeforeClass
    public void emulatorSetup() throws IOException, URISyntaxException, InterruptedException {
        ChromeOptions options = new ChromeOptions();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "ANDROID");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("deviceName", "Pixel7a");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appPackage", "com.dddev.gallery.album.photo.editor");
        caps.setCapability("appActivity", "com.gallery.activities.SplashActivity");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability("noReset", "true");
        caps.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        Runtime.getRuntime().exec("adb shell settings put global zen_mode 1");
        Thread.sleep(3000);
        Runtime.getRuntime().exec("adb shell settings put global zen_mode 0");


    }

    @AfterClass
    public void closeDriver() {

        driver.quit();
    }

}
