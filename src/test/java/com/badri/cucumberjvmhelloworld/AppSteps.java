/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cucumberjvmhelloworld;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;


/**
 * Cucumber JVM adding two numbers with TestNG NOT Junit
 * @author badrisugavanam
 */

public class AppSteps {
    App app= new App();
    int result=0;
 
    @Given("^(\\d+) , (\\d+)  numbers$")
public void _number(int arg1, int arg2) throws Throwable {
    app.a=arg1;
    app.b=arg2;
    result=app.add(arg1, arg2);
}

@Then("^The result should be (\\d+)$")
public void The_result_should_be(int arg3) throws Throwable {
    Assert.assertTrue(arg3==result);
}


}
