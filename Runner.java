package com.ipt.facebook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Runner extends BaseClass {
	
	@Test(priority=1)
	public void browserlaunch() {
		getDriver("chrome");
		}

@Test(priority=2)
public void enterurl() {
	launchUrl("https://www.facebook.com/");
	}


@Test(priority=3)
public void login() {
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chris");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("chris");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}

@Test(priority=4)
public void screenshot1() {
	screenshot();
	
}
	
	

}
