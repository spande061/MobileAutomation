package Mesho;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class meshoLogin {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "Android Emulator");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\pande\\Downloads\\Meesho_ Online Shopping App_13.9.1_Apkpure.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        Thread.sleep(3000);


        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
        //AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        System.out.println("url launched");
        Thread.sleep(5000);
        //driver.findElementById("00000000-0000-0178-ffff-ffff00000020").click();
        driver.findElementByClassName("android.widget.ImageView").click();
        Thread.sleep(5000);
        driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
        Thread.sleep(3000);
        driver.findElementById("com.meesho.supply:id/query_edit_text").sendKeys("Pants");
        driver.findElementById("com.meesho.supply:id/catalog_name").click();
        Thread.sleep(3000);
        driver.findElementById("com.meesho.supply:id/primary_cta").click();
        Thread.sleep(3000);
        driver.findElementById("com.meesho.supply:id/primary_cta").click();
    }
}
