package com.ktronix.www.automation.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ktronix.com/")
public class HomePage extends PageObject {
    public static final Target Search_Option= Target.the("Search Silla Gamer").located(By.xpath("//*[@id=\"js-site-search-input\"]"));
    public static final Target Search_Button= Target.the("Search").located(By.xpath("//*[@id=\"ui-id-3\"]/li[3]/a[1]/div[2]/div[2]"));
    //public static final Target NoThanks_Button= Target.the("No Thanks").located(By.xpath("//*[@id=\"cart\"]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]"));
}

