package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends BaseClass {
	public void CheckBoxClick() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxClick = driver.findElement(By.cssSelector("input#gridCheck"));
		System.out.println(checkboxClick.isSelected());
		checkboxClick.click();
		System.out.println(checkboxClick.isSelected());
	}

	public void radioButtonClick() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		// WebElement
		// radioButton=driver.findElement(By.cssSelector("input#inlineRadio1"));
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));

		radioButton.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo checkBox = new CheckBoxDemo();
		checkBox.browserInitiation();
		checkBox.CheckBoxClick();
		// checkBox.radioButtonClick();
	}

}
