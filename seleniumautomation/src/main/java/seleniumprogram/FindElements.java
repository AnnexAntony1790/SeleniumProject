package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends BaseClass {

	public void multipleCheckBoxClick() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkboxItems = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for (WebElement listCheckBox : checkboxItems) {
			listCheckBox.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements findElements=new FindElements();
		findElements.browserInitiation();
		findElements.multipleCheckBoxClick();
		
	}

}
