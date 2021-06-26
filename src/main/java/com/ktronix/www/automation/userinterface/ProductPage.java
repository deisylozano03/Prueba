package com.ktronix.www.automation.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject{
    public static final Target Quantity_Option = Target.the("Quantity_Option").located(By.xpath("/html/body/main/section/div[6]/div[1]/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div/div/div/div[1]/form/span/select/option[3]"));
       public static final Target Button_AddCart= Target.the("Add Cart").located(By.xpath("/html/body/main/section/div[6]/div[1]/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div/div/div/div[2]/form[2]/button"));
       public static final Target Out= Target.the("Out").located(By.xpath("//*[@id=\"js-cart-modal\"]/div/div/div[1]/button"));
        public static final Target Button_Cart= Target.the("Go Cart").located(By.xpath("//*[@id=\"js-mycart-header\"]/a/span[1]"));
    public static final Target Pay_Button= Target.the("Pay Option").located(By.xpath("//*[@id=\"js-go-to-pay\"]"));
}

