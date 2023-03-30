package Demo;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		HashSet<String> hs=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ramesh%20G/Downloads/Hotal1.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allOpt = s.getOptions();
		int count=allOpt.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allOpt.get(i).getText();
			hs.add(text);
		}
		for(String link:hs)
		{
			System.out.println(link);
		}
		driver.close();

}}
