package com.practice.tests.day_01.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P01_GetTitleGetUrl {
    @Test
    void test1() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/");
        System.out.println(page.url());
        assertTrue(page.url().contains("cydeo"));
        System.out.println(page.title());
        assertEquals("Practice",page.title());
        page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();
    }


}
