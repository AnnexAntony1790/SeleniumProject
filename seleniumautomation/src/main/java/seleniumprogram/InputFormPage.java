package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFormPage extends BaseClass {

	public void verifyUsercanEnterMessage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enterMessage = driver.findElement(By.id("single-input-field"));
		System.out.println(enterMessage.isEnabled());
		enterMessage.sendKeys("hello");
		WebElement showMessage = driver.findElement(By.id("button-one"));
		showMessage.click();
	}
	public void getTotal()
	{
		//get total method to send keys and click on button 
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("12");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("24");
		WebElement getTotalButton=driver.findElement(By.id("button-two"));
		getTotalButton.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFormPage inputFormPage = new InputFormPage();
		inputFormPage.browserInitiation();
		inputFormPage.verifyUsercanEnterMessage();
		
		inputFormPage.getTotal();
	}

}
