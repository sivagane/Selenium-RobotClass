package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium RobotClass\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	WebElement CBtn = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	CBtn.click();
	Thread.sleep(3000);
	WebElement btn = d.findElement(By.xpath("(//div[@class='iUmrbN'])[27]"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)",btn);
    WebElement Ph = d.findElement(By.xpath("//div[text()='Moto G8 Plus (Crystal Pink, 64 GB)']"));
    Actions a=new Actions(d);
    a.contextClick(Ph).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
}
}
