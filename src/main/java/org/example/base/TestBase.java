package org.example.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.example.utility.Utility;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

public class TestBase {

    public static AppiumDriverLocalService service;
    public static AndroidDriver driver;
    public static Utility utility;

    public static boolean checkIfServerIsRunning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();

        } catch (Exception e) {
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }


    public static AppiumDriverLocalService startServer() {

        try {

            Runtime runtime = Runtime.getRuntime();
            runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
            Thread.sleep(10000);
            System.out.println("Hold server creation");

            boolean flag = checkIfServerIsRunning(4723);

            if(!flag) {
                System.out.println("Server not started");
                service = AppiumDriverLocalService.buildDefaultService();
                service.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return service;
    }

    public static void stopServer() {

        System.out.println("Server stopped");
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("taskkill /F /IM node.exe");
            runtime.exec("taskkill /F /IM cmd.exe");
            Thread.sleep(3000);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void startEmulator() {

        try {

            Runtime.getRuntime().exec(System.getProperty("user.dir") + "src\\main\\resources\\apk\\Pixel_7a.bat");
            Thread.sleep(8000);
            System.out.println("Started Emulator");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AndroidDriver capabilities(String appName) {

        try {

            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\files\\gobal.properties");
            Properties property = new Properties();
            property.load(file);

            String device = property.getProperty("device");

            if(device.contains("Emulator")) {
                startEmulator();
            }

            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel7a");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            cap.setCapability("autoGrantPermissions", true);
//			cap.setCapability(MobileCapabilityType.NO_RESET, false);

            cap.setCapability("appPackage", "com.myntra.android");
            cap.setCapability("appActivity", "com.myntra.android.activities.react.ReactActivity");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            Thread.sleep(3000);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return driver;

    }


}
