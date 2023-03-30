package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allselected {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Ramesh%20G/Downloads/Hotal1.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Thread.sleep(3000);
	Select s=new Select(mtrlistbox);
	List<WebElement> allOpt = s.getOptions();
	int count=allOpt.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		Thread.sleep(3000);
		s.selectByIndex(i);	
		}
	for (int i = count;i>=0; i--) {
		Thread.sleep(3000);
		s.deselectByIndex(i);
	}
	}
}

