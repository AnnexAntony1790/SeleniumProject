package seleniumprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadExample {
	public WebDriver driver;

	public void fileUpload() {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement chooseFile = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));//WebDriverWait is used
		wait.until(ExpectedConditions.elementToBeClickable(chooseFile));
		chooseFile.click();
		chooseFile.sendKeys("C:\\Annex\\Java\\Assignments\\pdf\\Aggregation.pdf");
	}

	public void robotClass() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement chooseFile = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		chooseFile.click();
		StringSelection stringSelection = new StringSelection("C:\\Annex\\Java\\Assignments\\pdf\\Aggregation.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);// copy path to clipboard
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws AWTException  {
		// TODO Auto-generated method stub
		FileUploadExample fileUploadExample = new FileUploadExample();
		// fileUploadExample.fileUpload();
		fileUploadExample.robotClass();
	}

}
