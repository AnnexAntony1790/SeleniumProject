package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass {
	public void dragAndDropMethod() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(drag1).click();
        actions.doubleClick(drag1).perform();
        WebElement dragTo=driver.findElement(By.id("mydropzone"));
        actions.dragAndDrop(drag1, dragTo).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop drag = new DragAndDrop();
		drag.browserInitiation();
		drag.dragAndDropMethod();
	}

}
