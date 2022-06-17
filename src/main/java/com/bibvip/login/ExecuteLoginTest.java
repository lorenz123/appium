package com.bibvip.login;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static com.bibvip.login.LoginAutoTest.doLoginAuto;
import static com.bibvip.onboarding.SkipOnboarding.clickOnboardingPopups;
import static com.bibvip.configs.DeviceConfiguration.getDeviceConfiguration;
import static com.bibvip.configs.DriverConfiguration.getDriverConfig;
import static com.bibvip.utility.ThinkingTimeUtil.getWebDriverWait;
import static com.bibvip.variables.UrlPort.URL_PORT;

public class ExecuteLoginTest {

    public static void performLogin() throws MalformedURLException {

        DesiredCapabilities cap = getDeviceConfiguration(); //device config
        AppiumDriver driver = getDriverConfig(cap, URL_PORT); //driver config
        WebDriverWait wait = getWebDriverWait(driver); //This should call once only because it's an expensive task

        //App launched
        clickOnboardingPopups(wait); //Skip the 3 steps tutorial
        doLoginAuto(wait); //Test 1 - performLogin

    }
}
