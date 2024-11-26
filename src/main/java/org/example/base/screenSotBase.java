package org.example.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class screenSotBase {

        public static AndroidDriver driver;

        @BeforeClass
        public void emulatorSetup() throws MalformedURLException, URISyntaxException, InterruptedException, MalformedURLException {


            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "ANDROID");
            caps.setCapability("platformVersion", "15");
            caps.setCapability("deviceName", "Pixel7a");
            caps.setCapability("automationName", "UIAutomator2");
            caps.setCapability("appPackage", "com.dddev.gallery.album.photo.editor");
            caps.setCapability("appActivity", "com.gallery.activities.SplashActivity");
           caps.setCapability("ignoreHiddenApiPolicyError", "true");
           caps.setCapability("noReset", "true");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

}
