package Selenium_excel.SeleniumGrid;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class Demo extends browser {
	
	public WebDriver driver;
	
	@Test(priority=0)
	public void test() throws MalformedURLException
	{
		driver = browserInstallation();
		driver.get("https://www.espn.in/cricket/");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.open()");
		Set<String> a = driver.getWindowHandles();
		Iterator<String> i = a.iterator();
		String parent = i.next();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
		}
		driver.get("https://www.espncricinfo.com");
		driver.switchTo().window(parent);	
	}

}
