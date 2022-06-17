package com.bibvip.onboarding;

import com.bibvip.consts.ElementType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.utility.AppUtil.getBy;
import static com.bibvip.utility.ThinkingTimeUtil.getElementWithPolling;
import static com.bibvip.variables.HomeVars.HOME_BANNER;
import static com.bibvip.variables.HomeVars.HOME_PROFILE_BUTTON;

public class SkipOnboarding {

    public static void clickOnboardingPopups(WebDriverWait wait) {

        WebElement tapBanner = getElementWithPolling(wait, getBy(HOME_PROFILE_BUTTON, ElementType.ID));
        tapBanner.click();
        tapBanner.click();
        tapBanner.click();
    }
}
