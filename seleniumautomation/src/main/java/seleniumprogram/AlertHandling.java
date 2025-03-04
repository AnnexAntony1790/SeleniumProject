package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseClass{
	
	public void alertHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonClick=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		buttonClick.click();
		driver.switchTo().alert().accept();
	}
	public void confirmAlert()
	{driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement confirmAlert=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	confirmAlert.click();
	System.out.println(confirmAlert.isDisplayed());
	driver.switchTo().alert().dismiss();
			
	}
	public void clickAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click3.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertHandling alertHandle=new AlertHandling();
		alertHandle.browserInitiation();
		//alertHandle.alertHandling();
		//alertHandle.confirmAlert();
		alertHandle.clickAlert();

	}

}
