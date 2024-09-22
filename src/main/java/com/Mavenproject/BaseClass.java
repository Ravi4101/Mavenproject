package com.Mavenproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.IIOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	static WebDriver driver;
	public static ExtentReports extentreports;
	public static File file;
	// Browser Launch

	protected static void launchbrowser(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser name");

		}
		driver.manage().window().maximize();

	}

	// get

	protected static void urllaunch(String url) {
		driver.get(url);
	}

	// Quit
	protected static void browserterminate() {
		driver.quit();
	}

	// click
	protected static void clickElement(WebElement element) {
		element.click();
	}
	// Sendkeys

	protected static void inputValues(WebElement element, String Value) {
		element.sendKeys(Value);
	}
	// Screenshot

	// protected static void takeScreenshot(WebDriver driver,String filename,String
	// format) {
	// TakesScreenshot ts = (TakesScreenshot) driver;
	// File src = ts.getScreenshotAs(OutputType.File);
	// File des = new
	// File("C:\\Users\\sathi\\eclipse-workspace\\Selepr\\mavenproject\\Screenshot");
	// FileHandler.copy(src, des); }

	// Navigete
	protected static void navigateto(String navigateurl) {
		driver.navigate().to(navigateurl);
	}

	protected static void navigatemethods(String navigatemethod, String navigateurl) {
		if (navigatemethod.equals("Back")) {
			driver.navigate().back();
		} else if (navigatemethod.equalsIgnoreCase("forward")) {
			driver.navigate().forward();

		} else if (navigatemethod.equalsIgnoreCase("refresh")) {

			driver.navigate().refresh();
		} else if (navigatemethod.equalsIgnoreCase("to")) {
			driver.navigate().to(navigateurl);

		}

	}

	// Get Text

	protected static void getText(WebDriver driver, WebElement element) {

		String text = element.getText();
		System.out.println(text);

	}

	// Actions

	protected static void rightclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick().build().perform();
	}

	/*public static void extentReportStart(String location)
	{
		extentreports = new Extentreports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
	}*/
    
    @SuppressWarnings("deprecation")
	public  static  void  extentreportTearDown(String location) throws IOException{
    	
    	extentreports.flush();
    	file = new File(location);
    	Desktop.getDesktop().browse((file).toURI());
    }
     
    	
    	public String takeScreenshot() throws IOException {
    		
    		TakesScreenshot screenshot = (TakesScreenshot) driver;
    		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
    		File destfile = new File("Screenshot\\.png" + " _" + timeStamp + ".png");
    		return destfile.getAbsolutePath();
    	}
    	public static void  validation(WebDriver act, String ect ) {
    		Assert.assertEquals(act.getTitle(), ect);
    	}
}
    		
    		
			
    		
    	
   
    
    	
    	
    	
    	
    
    	
    






