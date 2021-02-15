package com.letzautomate.pages.application;

import com.letzautomate.pages.generic.BasePage;
import com.letzautomate.pages.generic.SelectItems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BasePage {

    private By txtUserName = By.name("q");
    private By singleSelectImportantFeatures = By.xpath("//div[@id='ex1']//div[@class='left-area']//ul");
    WebElement element;
    //SelectItems selectItems=new SelectItems(element);
    public void login(){
        try{
            launchApp();
            enterText(txtUserName, "Ram");
            report("PASS", "Login Successful");
        }catch(Exception e){
            report("PASS", "Login UnSuccessful");
            e.printStackTrace();
        }

    }

    public void selectValue(String value) throws InterruptedException {

        launchApp();
        WebElement element = getDriver().findElement(singleSelectImportantFeatures);
        SelectItems selectItems=new SelectItems(element);
        selectItems.slectItemsByValues(value);
        Thread.sleep(10000);

    }

    public void selectAll(String value) throws InterruptedException {

        launchApp();
        WebElement element = getDriver().findElement(singleSelectImportantFeatures);
        SelectItems selectItems=new SelectItems(element);
        selectItems.slectItemsByValues(value);
        Thread.sleep(10000);
    }

}

