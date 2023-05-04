package testcases;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class FirstRegistration extends BaseTest {

@Test
public static void RegistrationTest() throws InterruptedException 
{
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("login"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("continue"))).click();
	
	
	//driver.findElement(By.xpath(loc.getProperty("firstName"))).sendKeys("Ravi");
	//WebElement usernameTextbox=	driver.findElement(By.xpath(loc.getProperty("firstName")));
	//usernameTextbox.sendKeys("Rawqerset");
	
	
	//First Name random characters
	{
	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String randomFirstName = "";
	int length = 5;
	Random rn = new Random();
	char[] text = new char[length];
	for (int i = 0; i < length; i++) {
		text[i] = characters.charAt(rn.nextInt(characters.length()));
	}
	for (int i = 0; i < text.length; i++) {
		randomFirstName += text[i];
		
		driver.findElement(By.xpath(loc.getProperty("firstName"))).sendKeys(randomFirstName);

	}}
	
	//Second Name random Characters
	String characters1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String randomLastName = "";
	int length1 = 5;
	Random rn1 = new Random();
	char[] text1 = new char[length1];
	for (int i = 0; i < length1; i++) {
		text1[i] = characters1.charAt(rn1.nextInt(characters1.length()));
	}
	for (int i = 0; i < text1.length; i++) {
		randomLastName += text1[i];
		
		driver.findElement(By.xpath(loc.getProperty("lastName"))).sendKeys(randomLastName);

	}

	
	String randomInt = "" + (int) (Math.random() * Integer.MAX_VALUE);
	String randomEmail = "w" + randomInt + "@gmail.com";
	driver.findElement(By.xpath(loc.getProperty("emailid"))).sendKeys(randomEmail);
	
	
	driver.findElement(By.xpath(loc.getProperty("telephone"))).sendKeys("9789798061");
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("fax"))).sendKeys("9789798061");
	driver.findElement(By.xpath(loc.getProperty("Company"))).sendKeys("company Name");
	driver.findElement(By.xpath(loc.getProperty("address"))).sendKeys("address Testing");
	driver.findElement(By.xpath(loc.getProperty("address2"))).sendKeys("address Testing 2");
	driver.findElement(By.xpath(loc.getProperty("city"))).sendKeys("address Testing 2");
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("ZipCode"))).sendKeys("560078");
	Thread.sleep(2000);
	Select country =new Select(driver.findElement(By.xpath(loc.getProperty("Country"))));
	country.selectByVisibleText("India");
	Thread.sleep(2000);
	
	Select region=new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']")));
	region.selectByVisibleText("Karnataka");	
	Thread.sleep(2000);	
	
	String characters11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String randomLoginName = "";
	int length11 = 5;
	Random rn11 = new Random();
	char[] text11 = new char[length11];
	for (int i = 0; i < length11; i++) {
		text11[i] = characters11.charAt(rn11.nextInt(characters11.length()));
	}
	for (int i = 0; i < text11.length; i++) {
		randomLastName += text11[i];
		
		driver.findElement(By.xpath(loc.getProperty("loginNm"))).sendKeys(randomLastName);
		

	}
	driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("ravikmr@1");
	driver.findElement(By.xpath(loc.getProperty("pwdconfirm"))).sendKeys("ravikmr@1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='AccountFrm_newsletter1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='AccountFrm_agree']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	Thread.sleep(5000);
	
 
	//Assert.assertTrue(usernameTextbox.getAttribute("value").contains("[Ravin]+"));
	
	WebElement ele = driver.findElement(By.xpath("//body/div/div/div/section[@id='categorymenu']/nav/ul/li[2]/a[1]"));
	ele.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Shoes']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/img[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//label[@for='option344750']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Add to Cart']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@id='cart_checkout1']//i")).click();
	Thread.sleep(3000);

	
}
}