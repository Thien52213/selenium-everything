package org.josdoaitran;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestWebDocker {
    @Test
    public void TestHeadlessBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
//        https://www.selenium.dev/blog/2023/headless-is-going-away/
//        Headless in newest chrome version - version 109 and older
//        Headless in older version:   chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }

    @Test
    public void TestBrowser(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        https://www.selenium.dev/blog/2023/headless-is-going-away/
//        Headless in newest chrome version - version 109 and older
//        Headless in older version:   chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--no-sandbox");
//        chromeOptions.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}