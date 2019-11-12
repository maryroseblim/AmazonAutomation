package com.vikas.fw;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="classpath:Amazon.feature", glue="stefdefinition")

public class TestRunnerwithTestNG extends AbstractTestNGCucumberTests{
		

}
