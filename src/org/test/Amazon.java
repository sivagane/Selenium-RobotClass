package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium RobotClass\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	WebElement SignIn = d.findElement(By.xpath("(//a[@class='nav-a nav-a-2  '])[1]"));
    SignIn.click();
    WebElement Email = d.findElement(By.id("ap_email"));
    Email.sendKeys("sivag918@gmail.com");
    Actions a=new Actions(d);
    a.doubleClick(Email).perform();
    a.contextClick(Email).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    WebElement Cont = d.findElement(By.id("continue"));
    Cont.click();
    WebElement Pass = d.findElement(By.id("ap_password"));
    Pass.click();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
}
}
