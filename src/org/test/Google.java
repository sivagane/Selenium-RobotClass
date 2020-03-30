package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium RobotClass\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.co.in/webhp ");
	WebElement GApps = d.findElement(By.xpath("//a[@class='gb_D gb_pc']"));
    GApps.click();
    WebElement AppsFrame = d.findElement(By.xpath("//iframe[@role='presentation']"));
    d.switchTo().frame(AppsFrame);
    Thread.sleep(3000);
    WebElement GMail = d.findElement(By.xpath("(//a[@class='tX9u1b'])[7]"));
    GMail.click();
}
}
