package com.bibvip.configs;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DeviceConfiguration {

    public static DesiredCapabilities getDeviceConfiguration() {
        DesiredCapabilities cap = new DesiredCapabilities();

        //ZTE - real device
        cap.setCapability("deviceName", "ZTE");
        cap.setCapability("udid", "320206196543");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("automationName", "UiAutomator1");
        cap.setCapability("noReset", false);
        cap.setCapability("appWaitActivity", "*");
        cap.setCapability("appWaitDuration", 5000);

//app package and first activity to open
        cap.setCapability("appPackage", "com.dc.bib");
        cap.setCapability("appActivity", "com.dc.bib.app.SplashActivity");
        return cap;
    }

}
