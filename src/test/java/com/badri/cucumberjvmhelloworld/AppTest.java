package com.badri.cucumberjvmhelloworld;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format = "pretty",features="src/test/resources")
public class AppTest extends AbstractTestNGCucumberTests {
}