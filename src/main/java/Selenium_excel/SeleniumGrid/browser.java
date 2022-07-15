package Selenium_excel.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class browser {
	
	public WebDriver driver;
	
	public WebDriver browserInstallation() throws MalformedURLException
	{
	/*DesiredCapabilities caps = new DesiredCapabilities();
	caps.setBrowserName("chrome");*/
	
	driver =  WebDriverManager.chromedriver().create();
	return driver;
	}
}
