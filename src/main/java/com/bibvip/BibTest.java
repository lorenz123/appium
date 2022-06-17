package com.bibvip;

import com.bibvip.variables.UrlPort;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

//Class imports - to use methods without calling Class names
import static com.bibvip.configs.DeviceConfiguration.getDeviceConfiguration;
import static com.bibvip.configs.DriverConfiguration.getDriverConfig;
import static com.bibvip.LoginAutoTest.doLoginAuto;
import static com.bibvip.SkipOnboarding.clickOnboardingPopups;
import static com.bibvip.utility.ThinkingTimeUtil.getWebDriverWait;
import static com.bibvip.variables.UrlPort.URL_PORT;


public class BibTest {

    static AppiumDriver driver;


    public static void main(String[] args) {
        try {
            performLogin();
        } catch (MalformedURLException e) {
            e.getCause();
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void performLogin() throws MalformedURLException {

        DesiredCapabilities cap = getDeviceConfiguration(); //device config
        driver = getDriverConfig(cap, URL_PORT); //driver config
        WebDriverWait wait = getWebDriverWait(driver); //This should call once only because it's an expensive task

        //App launched
        clickOnboardingPopups(wait); //Skip the 3 steps tutorial
        doLoginAuto(wait); //Test 1 - performLogin

    }



}
