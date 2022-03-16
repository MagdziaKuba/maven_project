package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class SampleTestListener implements ITestListener {
    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("I am taking screenshot");
        //UploadTest
        //AsercjaTest
        //zrzut ekranu kiedy nasz test zakończy się niepowodzeniem
        WebDriver driver=DriverFactory.getDriver();

        int randomNumber=(int) (Math.random()*1000);

        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File src=screenshot.getScreenshotAs(OutputType.FILE);
        String nameFile="failedTest"+randomNumber+".png";
        try {
            FileUtils.copyFile(src, new File("src/test/resources/"+nameFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("I am starting test");

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub

    }
}
