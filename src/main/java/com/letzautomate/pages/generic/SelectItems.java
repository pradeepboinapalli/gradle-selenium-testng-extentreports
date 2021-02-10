package com.letzautomate.pages.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class
SelectItems extends BasePage {
    /*

       1.Deselct all
       2.Select By Index
       3. Select by Value
       4. Deselect by index.
       5. Return all the selected options.
       6.deselect by value
       7. deselect by visible text
       8.get first selected option
       9. select by visible Text
       10. Is the selected List box supports multiple selection/ not.
       11. Return all the options of list box.



        */
    private WebElement element;

    public SelectItems(WebElement element) {
        this.element = element;
        getDriver();
    }


    public void deslectAllItems(List<WebElement> element) {

        Iterator<WebElement>
                iterator = element.iterator();

        while (iterator.hasNext()) {
            System.out.println("Value is : "
                    + iterator.next().getText());
            iterator.next().click();

        }

    }

    public void deslectItemsByValues(String value) {


        List<WebElement> elementToAct = element.findElements(By.xpath("//li"));
        ListIterator<WebElement>
                iterator = elementToAct.listIterator();
        if (iterator.next().getText().equalsIgnoreCase(value)) {
            iterator.next().click();
        }


    }

    public void slectItemsByValues(String value) {


        List<WebElement> elementToAct = element.findElements(By.xpath("//li"));

        for (int i = 0; i < elementToAct.size(); i++) {
            String val = elementToAct.get(i).getText();
            System.out.println(val);
            if (val.equalsIgnoreCase(value)) {
                elementToAct.get(i).click();
            }
        }
        /*ListIterator<WebElement>
                iterator = elementToAct.listIterator();
        System.out.println(iterator.next().getText());
        if (iterator.next().getText().equalsIgnoreCase(value)) {
            System.out.println(iterator.next().getText());
            iterator.next().click();
        }*/


    }


    public void slectAllItems(List<WebElement> element) {

        Iterator<WebElement>
                iterator = element.iterator();

        while (iterator.hasNext()) {
            System.out.println("Value is : "
                    + iterator.next().getText());
            iterator.next().click();

        }


    }
}
