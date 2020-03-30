package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium RobotClass\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	WebElement ClBtn = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	ClBtn.click();
	WebElement LoBtn = d.findElement(By.xpath("//a[@class='_3Ep39l']"));
    LoBtn.click();
    WebElement Email = d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
    Email.sendKeys("sivag918@gmail.com");
    Actions a=new Actions(d);
    a.doubleClick(Email).perform();
    a.contextClick(Email).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    WebElement Pass = d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
    Pass.click();
    
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
}
}
