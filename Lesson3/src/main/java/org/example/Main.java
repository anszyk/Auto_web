package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


 class Main {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--headless", "--window-size=1920,1200");
//        options.addArguments("start-maximazed");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/media");

        JavascriptExecutor js  = (JavascriptExecutor) driver;

        test2Search(driver);
        test3OpenPublication(driver);
        test1Authorization(driver);
        test4Commenting(driver, js);
    }

    public static void waitError(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

     public static void test2Search(WebDriver driver) {

         driver.get("https://www.livejournal.com/media");

         waitError();

         WebElement webElement5 = driver.findElement(By.xpath("//a[contains(text(),'путешествия')]"));
         webElement5.click();

         WebElement webElement9 = driver.findElement(By.xpath("//button[@ng-click='cookiesAlert.onSubmit()']"));
         webElement9.click();

         waitError();

         WebElement webElement6 = driver.findElement(By.xpath("(//input[@name='q'])[3]"));
         webElement6.findElement(By.xpath("(//input[@name='q'])[3]"));
         webElement6.click();
         webElement6.sendKeys("Германия");

         WebElement webElement7 = driver.findElement(By.xpath("//form/div/button"));
         webElement7.click();

     }

     public static void test3OpenPublication(WebDriver driver) {

         driver.get("https://www.livejournal.com/media");

         WebElement webElement8 = driver.findElement(By.xpath("//article/a"));
         webElement8.click();

     }

     public static void test1Authorization(WebDriver driver) {

         driver.get("https://www.livejournal.com/media");

        waitError();

         WebElement webElement1 = driver.findElement(By.cssSelector(".s-header-item__link--login"));

         webElement1.click();

         WebElement webElement2 = driver.findElement(By.id("user"));
         webElement2.sendKeys("govavoj");

         WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
         webElement3.sendKeys("@User12");

         WebElement webElement4 = driver.findElement(By.name("action:login"));
         webElement4.click();

     }

     public static void test4Commenting(WebDriver driver, JavascriptExecutor js) {

         waitError();

         WebElement webElement10 = driver.findElement(By.xpath("//article/a")); //перешел в публ
         webElement10.click();

         waitError();

         WebElement webElement12 = driver.findElement(By.cssSelector(".js-replycount"));
         js.executeScript("arguments[0].scrollIntoView();", webElement12);

         WebElement webElement15 = driver.findElement(By.xpath("//a[contains(text(),'Добавить комментарий')]"));
         webElement15.click();

         WebElement webElement16 = driver.findElement(By.cssSelector(".sc-17pdh7i-0"));
         webElement16.click();
         webElement16.sendKeys("Yyt");


         WebElement webElement11 = driver.findElement(By.id("comment_submit"));
         js.executeScript("arguments[0].scrollIntoView();", webElement11);
         webElement11.click();

         driver.quit();
     }
}






























