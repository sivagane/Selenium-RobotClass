package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensPrintpara {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium RobotClass\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	d.manage().window().maximize();
	WebElement Scroll = d.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)", Scroll);
    Thread.sleep(3000);
    WebElement Para = d.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
    js.executeScript("arguments[0].setAttribute('style', 'background: blue;');", Para);
    

}
}
