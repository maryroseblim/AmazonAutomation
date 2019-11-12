package com.vikas.fw;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="classpath:Amazon.feature", glue="com.vikas.fw")

public class TestRunnerwithTestNG extends AbstractTestNGCucumberTests{
		

}
