package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	WebDriver driver;
public void getDriver() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
}
public void launchUrl(String url) {
	driver.get(url);
}
public void typeText(WebElement element, String data) {
	element.sendKeys("data");
}
public void getAttribute(WebElement element, String Attributevalue) {
	String attribute = element.getAttribute("Attributevalue");
	}
public void getText(WebElement element) {
	String text = element.getText();
}
public void locatorId(String AttributeName) {
	WebElement element = driver.findElement(By.id("AttributeName"));
}
public void name(String AttributeName) {
	WebElement element = driver.findElement(By.name("AttributeName"));
}
}
