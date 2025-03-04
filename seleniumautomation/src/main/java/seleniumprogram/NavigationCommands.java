package seleniumprogram;

public class NavigationCommands extends BaseClass {

	public void navigationCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//driver.navigate().back();
		//driver.navigate().forward();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigate=new NavigationCommands();
		navigate.browserInitiation();
		navigate.navigationCommands();
	}

}
