package switchingwindows_webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SwithcWindows {
	@Test
	public void Swtichchildwindow() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","E:\\eclipse\\Selenium Driver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("terms-link")).click();
		String parent_window= driver.getWindowHandle();
		Set<String>s1= driver.getWindowHandles();
		//Iterator will point to the first element
		Iterator<String>i1=s1.iterator();
		while(i1.hasNext()) //will see if there is any value present for the parent window
		{
			String child_window= i1.next();
			if(!parent_window.equalsIgnoreCase(child_window))
			{
			driver.switchTo().window(child_window);
			Thread.sleep(10000);
			System.out.println(driver.getTitle());
			driver.quit();
			}
			
		}
		driver.switchTo().window(parent_window);
		System.out.println(driver.getTitle());
				
	}

}
