package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FillTextFields extends BaseClass{

	public void filltext()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> textFields=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement element:textFields)
		{
			element.sendKeys("Hello");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FillTextFields fillText=new FillTextFields();
		fillText.browserInitiation();
		fillText.filltext();
	}

}
