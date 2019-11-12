package com.vikas.fw;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//junit will run this class by specification of import org.junit.runner.RunWith; and @RunWith(Cucumber.class)
//run as junit test

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:LoginTest.feature", glue="com.vikas.fw")

public class TestRunner{
		

}
