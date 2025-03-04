package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableClass extends BaseClass{
	
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableData=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableData.getText());// get full data of table
		
	}
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(selectRow.getText());
	}
	public void selectData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[3]"));
		System.out.println(selectData.getText());
	}
	public void selectColomnData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> colomnData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:colomnData)
		{
			System.out.println(element.getText());
		}
	}
	public void elementSearch()
	{
		String input="Cedric Kelly";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> colomnData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:colomnData)
		{
			if(element.getText().equals(input))
			{
				System.out.println(element.getText());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableClass tableClass=new TableClass();
		tableClass.browserInitiation();
		tableClass.fullTable();
		System.out.println("**********************");
		tableClass.selectRow();
		System.out.println("**********************");
		tableClass.selectData();
		System.out.println("**********************");
		tableClass.selectColomnData();
		System.out.println("**********************");
		tableClass.elementSearch();

	}

}
