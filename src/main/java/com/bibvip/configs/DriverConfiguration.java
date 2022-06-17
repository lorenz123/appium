package com.bibvip.configs;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverConfiguration {

    public static AppiumDriver getDriverConfig(DesiredCapabilities cap, String urlStr) throws MalformedURLException {
        URL appiumUrl = new URL(urlStr);
        AppiumDriver driver = new AppiumDriver(appiumUrl, cap);
        return driver;

    }

}
