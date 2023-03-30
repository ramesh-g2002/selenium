package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 
 */
public class Alphabitical {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> a1=new ArrayList<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ramesh%20G/Downloads/Hotal1.html");
		WebElement cplistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(cplistbox);
		Thread.sleep(3000);
		List<WebElement> option = s.getOptions();
		int count=option.size();
		for(int i=0;i<count;i++)
		{
			String text = option.get(i).getText();
			a1.add(text);
		}
		Collections.sort(a1);
		System.out.println(a1);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
		driver.close();
}
}
