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

public class Snapdeal {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium RobotClass\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get(" https://www.snapdeal.com/offers/quirky");
	WebElement Pon = d.findElement(By.xpath("//a[@href='https://www.snapdeal.com/offers/pongal']"));
    Pon.click();
    Thread.sleep(3000);
    WebElement img = d.findElement(By.xpath("//img[@src='https://i3.sdlcdn.com/img/campaign/5f8cccdbb1/Rupay_WEB_31st.jpg']"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)", img);
    WebElement FLM = d.findElement(By.xpath("(//div[@class='cardProductpreText'])[2]"));
    Actions a=new Actions(d);
    a.contextClick(FLM).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
}
}
