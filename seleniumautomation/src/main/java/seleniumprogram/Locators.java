package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass {
	public void idLocator() {
		WebElement msgId = driver.findElement(By.id("single-input-field"));
		WebElement inputFirstId = driver.findElement(By.id("value-a"));
		WebElement inputSecondId = driver.findElement(By.id("value-b"));

	}

	public void nameLocator() {
		WebElement descName = driver.findElement(By.name("description"));
		WebElement viewportName = driver.findElement(By.name("viewport"));
		WebElement keywordsName = driver.findElement(By.name("keywords"));
	}

	public void classLocator() {
		WebElement navClass = driver.findElement(By.className("navbar-brand"));
		WebElement containerClass = driver.findElement(By.className("container page"));
		WebElement footerClass = driver.findElement(By.className("mt-5"));
	}

	public void linkLocator() {
		WebElement radio_Link = driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement checkbox_Link = driver.findElement(By.linkText("check-box-demo.php"));
		WebElement select_Link = driver.findElement(By.linkText("select-input.php"));
	}

	public void partialLinkLocator() {
		WebElement radio_PartialLink = driver.findElement(By.partialLinkText("radio-button"));
		WebElement checkbox_PartialLink = driver.findElement(By.partialLinkText("check-box"));
		WebElement select_PartialLink = driver.findElement(By.partialLinkText("select"));

	}

	public void cssSelectorEx() {

		// tag#id
		WebElement tagId = driver.findElement(By.cssSelector("input#single-input-field"));
		// tag.class
		WebElement tagClass = driver.findElement(By.cssSelector("ul.navbar-nav"));
		// tag[attributetype=attributevalue]
		WebElement tagattr = driver.findElement(By.cssSelector("input[id=value-a]"));
		// tag.class[attributetype=attributevalue]
		WebElement tagidattr = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));

	}

	public void absoluteXpathex() {
		WebElement absoluteXpath = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}

	public void relativeXpatheg() {
		/* 
		 * // tagname[@attributetype='attributevalue']
		 */
		WebElement relativeXpath = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement placeHolder = driver.findElement(By.xpath("//input[@placeholder='Message']"));
	}

	public void dynamicXpatheg() {
		/*
		 * //tagname[contains(@attributetype,'attributevalue')] 		 */
		WebElement dynamicPath = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement textmsg = driver.findElement(By.xpath("//button[text()='Show Message']"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
