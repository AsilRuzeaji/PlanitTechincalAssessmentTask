package com.panit.step_definitions;

import com.panit.pages.ShopPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShopPageDefinitions {
    ShopPage shopPage = new ShopPage();

    @Then("user buy Funny Cow 2 times")
    public void user_buy_funny_cow_times() {
        shopPage.buyItemNumberOfTime(6,2);
    }

    @Then("user buy Fluffy Bunny 1 time")
    public void user_buy_fluffy_bunny_time() {
        shopPage.buyItemNumberOfTime(4,1);
    }


    /**
     *
     * @param string == funny cow
     * @param string2 == fluffy bunnny
     */
    @Then("user verify {string} and {string} in the cart")
    public void user_verify_and_in_the_cart(String string, String string2) throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertTrue(shopPage.verifyItemName(string).equalsIgnoreCase(string));
        Assert.assertTrue(shopPage.verifyItemName(string2).equalsIgnoreCase(string2));



    }

}
