package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlloptions {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ramesh%20G/Downloads/Hotal1.html");
		WebElement cplistbox = driver.findElement(By.id("cp"));
		Select s=new Select(cplistbox);
		List<WebElement> option = s.getOptions();
		int count=option.size();
		for(int i=0;i<count;i++)
		{
			String text = option.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();
}
}
