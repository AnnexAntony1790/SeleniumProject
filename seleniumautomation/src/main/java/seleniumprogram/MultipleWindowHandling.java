package seleniumprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public WebDriver driver;
	
	public void browserInitialization()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactPage=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactPage.click();
		WebElement loginPage=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPage.click();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent:"+parent);
		Set<String> multipleWindow1=driver.getWindowHandles();
		String title="";
		
		for(String childWindow:multipleWindow1)
		{
			if(!childWindow.equals(parent))
			{
			System.out.println("childWindow:"+childWindow);
			driver.switchTo().window(childWindow);
			//System.out.println("Title:"+driver.getTitle());
			title=driver.getTitle();
			
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
				userName.sendKeys("Antony");
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstName.sendKeys("Annex");
				
			}
		}
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowHandling multipleWindowHandling=new MultipleWindowHandling();
		multipleWindowHandling.browserInitialization();
	}

}
