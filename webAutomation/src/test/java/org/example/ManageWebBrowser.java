package org.example;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class ManageWebBrowser extends DriverSetup {
	
	
	
	
    @Test
    
	public  void testWebBrowser()throws InterruptedException {
//    	driver.get("https://facebook.com");
//        driver.manage().window().minimize();
//        Thread.sleep(2000);
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(2000);
       driver.navigate().to("https://google.com");
        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
        
        driver.switchTo().newWindow(WindowType.TAB)	;
        Thread.sleep(2000);
        driver.get("https://linkedin.com");
        
        driver.switchTo().newWindow(WindowType.WINDOW)	;
        driver.get("https://daraz.com");
        Thread.sleep(2000);
        
        String currentTabHandle =driver.getWindowHandle();
        System.out.println(currentTabHandle);
        
      
     
        List<String> handles = new ArrayList<>(driver.getWindowHandles());
       
        
        for(String handle: handles) {
       	System.out.println(handle);
        }
        
        driver.switchTo().window(handles.get(0));
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.switchTo().window(handles.get(1));
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.switchTo().window(handles.get(2));
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        
        
        driver.close();
        } 

}
