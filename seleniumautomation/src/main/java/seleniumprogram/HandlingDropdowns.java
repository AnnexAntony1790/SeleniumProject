package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends BaseClass{
	public void selectDropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectDropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectDropdown);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(2);
		select.selectByValue("Green");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdowns handlingDropdowns=new HandlingDropdowns();
		handlingDropdowns.browserInitiation();
		handlingDropdowns.selectDropdown();
		
	}

}
