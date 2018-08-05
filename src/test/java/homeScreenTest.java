import ajeAndroid_pageObjects.homeScreen;
import ajeAndroid_pageObjects.privacyNotice;
import ajeAndroid_pageObjects.univNavBar;
import io.appium.java_client.android.AndroidDriver;
import javafx.scene.layout.Priority;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class homeScreenTest {
    private AndroidDriver wd;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

/*        capabilities.setCapability("deviceName", "06825d1c0b358d2c");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "/Users/manoj/Downloads/app-english-staging-1021.apk");
        capabilities.setCapability("appWaitActivity", "net.aljazeera.english.activity.SplashScreenActivity");

        wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);*/

        capabilities.setCapability("testobject_api_key", "A2D588D13BA940FF8F765F450BC19B07");
        capabilities.setCapability("appWaitActivity", "net.aljazeera.english.activity.SplashScreenActivity");
        capabilities.setCapability("deviceName", "Motorola_Moto_E_2nd_gen_free");
        capabilities.setCapability("recordScreenshots", "true");
        wd = new AndroidDriver(new URL("https://eu1.appium.testobject.com/wd/hub"), capabilities);

        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void agreePrivacy() throws Exception {
        privacyNotice.agreePrivacy(wd);

    }


    @Test
    public void testUnivNavBar() throws Exception {
        univNavBar.navigateToWatchTab(wd);
        univNavBar.navigateToBrowseTab(wd);
        univNavBar.navigateToMoreTab(wd);
        univNavBar.navigateHomeTab(wd);
        univNavBar.navigateMyFeedTab(wd);
        System.out.println("Navigated between tabs Successfully");
    }

    @Test
    public void testActionBars() throws Exception {
        homeScreen.clickActionsBars(wd);

    }

    @AfterClass
    public void tearDown() {

       // wd.quit();

    }

}
