package ajeAndroid_pageObjects;

import genericMethods.screenshot;
//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class homeScreen {

    public static WebElement element = null;

    public static void clickActionsBars(AndroidDriver wd) {

        List<WebElement> actionBars = wd.findElements(By.className("android.support.v7.app.ActionBar$Tab"));

        actionBars.get(1).click();
        WebElement latestPage = wd.findElement(By.className("android.widget.RelativeLayout"));
        new WebDriverWait(wd, 10).until(ExpectedConditions.visibilityOf(latestPage));
        screenshot.takeScreenshot(wd);

        System.out.println("Navigated to Latest Stories");

        actionBars.get(0).click();
        WebElement topStories = wd.findElement(By.id("net.aljazeera.english:id/recycler_view"));
        new WebDriverWait(wd, 10).until(ExpectedConditions.visibilityOf(topStories));
        System.out.println("Navigated to Top Stories");
    }

    public static void checkListOfStories(AndroidDriver wd) {
        int s = wd.findElements(By.className("android.widget.RelativeLayout")).size();
        System.out.println("Number of Stories Listed " + s);
    }

    public static void clickArticle(AndroidDriver wd) {
        element = wd.findElementByName("Hunger and disease kill 110' in Somalia in 48 hours");
        element.click();
        wd.pressKeyCode(AndroidKeyCode.BACK);
    }

  /*  public static void clickAnotherArticle(AndroidDriver wd) throws InterruptedException {
        wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).click();
        Thread.sleep(5000L);
        wd.pressKeyCode(AndroidKeyCode.BACK);
    }
    public static void scrollDownToTrendingStories(AndroidDriver wd) {
        MobileElement trendingStories = (MobileElement)wd.findElement(By.id("net.aljazeera.english:id/story_image"));
        trendingStories.swipe(SwipeElementDirection.UP, 6000);
        trendingStories.
        System.out.println("Page scrolling down ");

    }

    public static void swipeDownPage(AndroidDriver wd) throws InterruptedException {

        Thread.sleep(5000L);
        wd.swipe(564, 1636, 545, 649, 5000);
        }
*/


}