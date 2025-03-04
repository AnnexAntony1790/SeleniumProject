package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	public WebDriver driver;

	public void displayFrames() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iFrame);
		WebElement clickFrame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		clickFrame.click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameExample frameExample = new FrameExample();
		frameExample.displayFrames();
	}

}
