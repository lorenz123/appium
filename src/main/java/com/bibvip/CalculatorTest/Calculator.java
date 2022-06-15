package com.bibvip.CalculatorTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Calculator {

    static AppiumDriver driver;
    public static final Integer WAITING_TIME = 40;
    public static final Integer POLLING_TIME = 1;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            e.getCause();
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void openCalculator() throws MalformedURLException {

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

        //success connection - test
        URL appiumUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(appiumUrl, cap);
        System.out.println("Application Started");

        //This should call once only because it's an expensive task
        WebDriverWait wait = getWebDriverWait(driver);

        //Get rid of onboarding 3 steps tutorial
        WebElement tapBanner = getElementWithPolling(wait, By.id("com.dc.bib:id/hbi_image"));
        tapBanner.click();
        tapBanner.click();
        tapBanner.click();

        WebElement tapProfileBtn = getElementWithPolling(wait, By.id("com.dc.bib:id/nfht_iv_user"));
        tapProfileBtn.click();

        WebElement tapLoginBtn = getElementWithPolling(wait, By.id("com.dc.bib:id/tv_phone"));
        tapLoginBtn.click();

        WebElement tapMobile = getElementWithPolling(wait, By.id("com.dc.bib:id/ce_mobile_number"));
        tapMobile.click();

        //TODO tap the keyboard keys after it appears, working already on UiAutomator2
        tapMobile.sendKeys("512521321");
        WebElement tapPassword = getElementWithPolling(wait, By.id("com.dc.bib:id/et_pwd"));
        tapPassword.click();
        tapPassword.sendKeys("31231321");

        WebElement userLogin = getElementWithPolling(wait, By.id("com.dc.bib:id/bg_color"));
        userLogin.click();



    }

    public static WebElement getElementWithPolling(WebDriverWait wait, By webElementBy) {
        wait.pollingEvery(Duration.ofSeconds(POLLING_TIME));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElementBy));
        return element;
    }

    public static WebDriverWait getWebDriverWait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAITING_TIME));
        return wait;
    }

}
