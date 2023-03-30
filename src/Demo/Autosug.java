package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 write a script to print all the autosuggestion after typing selenium  in google search textbox?
 */
public class Autosug {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> autoSug = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int count=autoSug.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		String text = autoSug.get(i).getText();
		System.out.println(text);
		}
		driver.close();
}}
