package com.letzautomate.pages.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDrive {

    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = null;
       // String browserToLaunch = System.getProperty("browserToLaunch");
       // browserToLaunch.equalsIgnoreCase("chrome"))
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//drivers//chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--start-fullscreen");
            options.addArguments("--disable-extensions");

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(desiredCapabilities);
    /*"https://www.w3.org/TR/wai-aria-practices/examples/listbox/listbox-rearrangeable.html"
        //"http://demo.guru99.com/test/delete_customer.php"*/
        driver.get("https://www.w3.org/TR/wai-aria-practices/examples/listbox/listbox-rearrangeable.html");
        //System.out.println("Cookie is.."+driver.manage().getCookies().toString());
        WebElement element= driver.findElement(By.xpath("//a[text()='Browser and Assistive Technology Support']"));
        element.click();
        /*element.sendKeys("Jil Jil Jigel");
       // Thread.sleep(5000);
        WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));*/
        Actions actions= new Actions(driver);
        //actions.
        actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
        /*Thread.sleep(4000);
        button.click();
        driver.switchTo().alert().accept();*/


    }
}
