package ajeAndroid_pageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class privacyNotice {

    public static WebElement element = null;

    public static void agreePrivacy(AndroidDriver wd) {

        element = wd.findElement(By.id("net.aljazeera.english:id/btn_agree"));
        element.click();

    }
}