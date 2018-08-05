package genericMethods;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class screenshot {
    static String destDir;
    static DateFormat dateFormat;
    Dimension size;


    public static void takeScreenshot(AndroidDriver wd) {

        destDir = "screenshots";
        File scrFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy_hh_mm_ssaa");
        new File(destDir).mkdirs();
        String destFile = dateFormat.format(new Date()) + ".png";

        try {
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
