package com.Mavenproject;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Attachementfile {
    	  WebDriver driver;
    	  
    	  driver.get("https://www.filemail.com/share/upload-file");
  		driver.manage().window().maximize();
  		WebElement element = driver.findElement(By.xpath("//*[text()='Add Files']"));
  		element.click();

  		Robot r = new Robot();
  		r.delay(2000);
  		StringSelection ss = new StringSelection("C:\\Users\\srir2\\Desktop\\gjgjg\\New folder\\png");
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
  		r.keyPress(KeyEvent.VK_CONTROL);
  		r.keyPress(KeyEvent.VK_V);
  		r.keyRelease(KeyEvent.VK_CONTROL);
  		r.keyRelease(KeyEvent.VK_V);
  		r.keyPress(KeyEvent.VK_ENTER);
  		r.keyRelease(KeyEvent.VK_ENTER);
      }
      }
