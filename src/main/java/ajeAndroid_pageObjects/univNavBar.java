package ajeAndroid_pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class univNavBar {

    public static WebElement element = null;


    public static void navigateToWatchTab(AndroidDriver wd) {

        element = wd.findElement(By.id("net.aljazeera.english:id/watch_button"));
        element.click();
        System.out.println("Navigated to Watch Page");

    }

    public static void navigateToBrowseTab(AndroidDriver wd) {

        element = wd.findElement(By.id("net.aljazeera.english:id/browse_button"));
        element.click();
        System.out.println("Navigated to Browse Page");
    }

    public static void navigateToMoreTab(AndroidDriver wd) {

        element = wd.findElement(By.id("net.aljazeera.english:id/more_button"));
        element.click();
        System.out.println("Navigated to More Page");

    }

    public static void navigateMyFeedTab(AndroidDriver wd) {

        element = wd.findElement(By.id("net.aljazeera.english:id/my_feed_button"));
        element.click();
         wd.pressKeyCode(AndroidKeyCode.BACK);

    }

    public static void navigateHomeTab(AndroidDriver wd) {

        element = wd.findElement(By.id("net.aljazeera.english:id/home_button"));
        element.click();
        System.out.println("Navigated to Home Page");

    }

}
