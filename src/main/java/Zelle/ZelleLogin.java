package Zelle;


import ZelleScreens.LoginScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ZelleLogin {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "Android Emulator");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\pande\\Downloads\\Zelle-7.6.0-qa1-742-debug.apk.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        Thread.sleep(3000);


        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
        //AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        System.out.println("url launched");

        Thread.sleep(10000);
        LoginScreen x = new LoginScreen();
        x.LoginFunctionallity();


    }


    }


