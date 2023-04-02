package ZelleScreens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginScreen {
    public static AndroidDriver driver;

        public void LoginFunctionallity() throws InterruptedException, MalformedURLException {

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
            System.out.println("url launched");
            Thread.sleep(10000);
            System.out.println("url launched");
            Thread.sleep(10000);


      driver.findElementById("com.zellepay.zelle.qa1:id/launch_continue").click();
      Thread.sleep(3000);
      //System.out.println("continue");
      driver.findElementById("android:id/button1").click();
      System.out.println("allow");
      Thread.sleep(3000);
      driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
      System.out.println("allow location");
      Thread.sleep(3000);


      driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
      System.out.println("allow app");
      Thread.sleep(3000);
      WebElement enterNumber = driver.findElementById("com.zellepay.zelle.qa1:id/getstarted_phonenumber");
      enterNumber.sendKeys("5003000009");
      Thread.sleep(3000);
            System.out.println("Number entered");
      driver.findElementById("com.zellepay.zelle.qa1:id/getstarted_continue").click();
      Thread.sleep(3000);
            System.out.println("Clicked on continue");
      driver.findElementById("com.zellepay.zelle.qa1:id/legal_disclosure_legal_checkbox").click();
      Thread.sleep(3000);
            System.out.println("legal");
      driver.findElementById("com.zellepay.zelle.qa1:id/legal_disclosure_primary_cta").click();
      Thread.sleep(50000);
            System.out.println("notification allowed");
      driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
      Thread.sleep(3000);
            System.out.println("Permission allowed");
      driver.findElementById("com.zellepay.zelle.qa1:id/zelle_dialog_secondary_cta").click();
      Thread.sleep(3000);
            System.out.println("continue with zelleApp");
      driver.findElementById("com.zellepay.zelle.qa1:id/skip_cta").click();
            System.out.println("skip for now");

      driver.findElementById("com.zellepay.zelle.qa1:id/button_send").click();
            System.out.println("send clicked");

       driver.findElementById("com.zellepay.zelle.qa1:id/placeholder_search").sendKeys("Sandip3");
            System.out.println("conct serched");

       driver.findElementById("com.zellepay.zelle.qa1:id/contact_token").click();
            System.out.println("contct selected");

       driver.findElementById("android:id/button1").click();
            System.out.println("selected OK");

        driver.findElementById("com.zellepay.zelle.qa1:id/keypadview_1").click();
            System.out.println("selecetd 1 doller");

        driver.findElementById("com.zellepay.zelle.qa1:id/review").click();
            System.out.println("clicked on review CTA");

        driver.findElementById("com.zellepay.zelle.qa1:id/submit").click();
            System.out.println("clicked on send CTA");

        driver.findElementById("android:id/button1").click();
            System.out.println("selected Yes");

  }
    }

