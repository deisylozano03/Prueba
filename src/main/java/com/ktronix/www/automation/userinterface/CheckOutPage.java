package com.ktronix.www.automation.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.omg.CORBA.PUBLIC_MEMBER;

public class CheckOutPage extends PageObject {

    public static final Target Email = Target.the("Email").located(By.xpath("//*[@id=\"j_username\"]"));
    public static final Target Login_Button = Target.the("Login").located(By.xpath("//*[@id=\"alkostoSoftLoginForm\"]/button[1]"));
    public static final Target First_Name = Target.the("First Name").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target Last_Name = Target.the("Last Name").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target Phone = Target.the("Phone").located(By.xpath("//*[@id=\"phone\"]"));
    public static final Target Authorize_Check = Target.the("Authorize").located(By.xpath("//*[@id=\"signInPostForm\"]/div[6]/label[1]"));
    public static final Target Continue= Target.the("Continue").located(By.xpath("//*[@id=\"js-buttonSignIn\"]"));
    public static final Target ID = Target.the("ID").located(By.xpath("//*[@id=\"address.idNumber\"]"));
    public static final Target Depart= Target.the("Depart").located(By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/form/div[1]/div[4]/div[1]/div[5]/div[1]/div/div[1]/div/span/select/option[26]"));
    public static final Target City= Target.the("City").located(By.xpath("//*[@id=\"address.cityCode\"]/option[15]"));
    public static final Target Address= Target.the("Address").located(By.xpath("//*[@id=\"addressLine1\"]"));
    public static final Target Barrio=Target.the("Barrio").located(By.xpath("//*[@id=\"addressDistrict\"]"));
    public static final Target Continue_Button= Target.the("Continue_Button").located(By.xpath("//*[@id=\"continueAddress\"]"));
    public static final Target Continue_Button2= Target.the("Continue_Button 2").located(By.xpath("//*[@id=\"deliveryMethodSubmit\"]"));




}

