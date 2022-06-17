package com.bibvip.configs;

import com.bibvip.variables.AppActivities;
import com.bibvip.variables.AppPackage;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.bibvip.variables.AppActivities.SPLASH_ACTIVITY;
import static com.bibvip.variables.AppPackage.APP_PACKAGE;

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
        cap.setCapability("appPackage", APP_PACKAGE);
        cap.setCapability("appActivity", SPLASH_ACTIVITY);

        return cap;
    }

}
