package org.example.utility;

import java.io.File;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;

import org.example.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.StandardCopyOption;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Utility extends TestBase {

    public static void scrollToText(String text) {

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"));
    }

    public static void swipe(AndroidDriver driver, DIRECTION direction) {

        Dimension size = driver.manage().window().getSize();

        switch (direction) {
            case UP:
                int startX = (int) (size.getWidth() * 0.5);
                int startY = (int) (size.getHeight() * 0.2);
                int endX = (int) (size.getWidth() * 0.5);
                int endY = (int) (size.getHeight() * 0.8);

                ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                        "startX", startX,
                        "startY", startY,
                        "endX", endX,
                        "endY", endY
                ));
                break;

            case DOWN:
                startX = (int) (size.getWidth() * 0.5);
                startY = (int) (size.getHeight() * 0.8);
                endX = (int) (size.getWidth() * 0.5);
                endY = (int) (size.getHeight() * 0.2);

                ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                        "startX", startX,
                        "startY", startY,
                        "endX", endX,
                        "endY", endY
                ));

                break;

            default:

                break;
        }

    }

    public static void explicitWait(AndroidDriver driver, By element) {

        WebElement wait = new FluentWait<AndroidDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    public void captureScreenShot(AppiumDriver driver, String screenShotName) {
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File source = new File(screenshotFile.getAbsolutePath());
            File destination = new File("/sdcard/Download/screenshot.png");
            FileUtils.copyFile(source, destination);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
