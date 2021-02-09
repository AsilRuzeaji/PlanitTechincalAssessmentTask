package com.panit.pages;

import com.panit.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShopPage extends BasePage{
    public void buyItem(int itemNum){
        WebElement item = Driver.getDriver().findElement(By.xpath("//*[@id=\"product-"+itemNum+"\"]/div/p/a"));
        item.click();
    }

    public void buyItemNumberOfTime(int itemNum, int numOfItem){
        for (int i = 0; i < numOfItem; i++) {
            buyItem(itemNum);

        }
    }

    public String verifyItemName(String itemName){
        WebElement item = Driver.getDriver().findElement(By.xpath("//td[.=' "+itemName+"']"));
        String attributeValue = item.getText();
        return attributeValue;
    }
}
