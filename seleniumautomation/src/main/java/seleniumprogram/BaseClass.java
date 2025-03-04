package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver; 
	
	public void browserInitiation()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
	}
	public void quitAndclose()
	{
		driver.close();
		//driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass base=new BaseClass();
		base.browserInitiation();
		base.quitAndclose();
	}

}
