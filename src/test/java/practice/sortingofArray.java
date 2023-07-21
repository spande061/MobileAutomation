package practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static ZelleScreens.LoginScreen.driver;

public class sortingofArray {

    public static void main(String[] args) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

       File Source = ts.getScreenshotAs(OutputType.FILE);
       File destn = new File ("");
        FileHandler.copy(Source,destn);
            }
        }


