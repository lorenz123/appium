package com.bibvip;

import com.bibvip.consts.ElementType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.BibTest.driver;
import static com.bibvip.utility.AppUtil.getBy;
import static com.bibvip.utility.ThinkingTimeUtil.getElementWithPolling;
import static com.bibvip.utility.mobile.MobileGenerator.getMobileNumber;
import static com.bibvip.utility.password.PasswordGenerator.getRandomPassword;
import static com.bibvip.variables.HomeVars.HOME_PROFILE_BUTTON;
import static com.bibvip.variables.LoginVars.*;
import static com.bibvip.variables.ProfileVars.PROFILE_LOGIN_BUTTON;

public class LoginAutoTest {

    public static void doLoginAuto(WebDriverWait wait) {
        WebElement tapProfileBtn = getElementWithPolling(wait, getBy(HOME_PROFILE_BUTTON, ElementType.ID));
        tapProfileBtn.click();

        WebElement tapLoginBtn = getElementWithPolling(wait, getBy(PROFILE_LOGIN_BUTTON, ElementType.ID));
        tapLoginBtn.click();

        WebElement tapMobile = getElementWithPolling(wait, getBy(LOGIN_MOBILE_TEXTFIELD, ElementType.ID));
        tapMobile.click();
        tapMobile.sendKeys(getMobileNumber());

        WebElement tapPassword = getElementWithPolling(wait, getBy(LOGIN_PASSWORD_TEXTFIELD, ElementType.ID));
        tapPassword.click();
        tapPassword.sendKeys(getRandomPassword());

        WebElement userLogin = getElementWithPolling(wait, getBy(LOGIN_BUTTON, ElementType.ID));
        userLogin.click();
    }


}
