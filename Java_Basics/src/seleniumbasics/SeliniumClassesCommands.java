package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeliniumClassesCommands {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.navigate().refresh();

		driver.get("http://automationpractice.com/index.php");

		/* verifition */

		// Boolean ref= driver.findElement(By.xpath("")).isDisplayed();

		WebElement ref = driver.findElement(By.xpath(""));
		ref.isDisplayed();
		ref.isEnabled();
		ref.isSelected();

		/* buttons , radiobuttons ,checkbox */

		WebElement refButtons = driver.findElement(By.xpath(""));
		refButtons.click();
		refButtons.isDisplayed();
		ref.isEnabled();
		ref.isSelected();// ("applicable for radio and checkboxes")

		WebElement refButtonSub = driver.findElement(By.xpath(""));
		refButtonSub.submit();

		/* FieldBox */

		WebElement fieldBoxsample = driver.findElement(By.xpath(""));
		fieldBoxsample.sendKeys("Muthukumaran");

		/* DropDowns */
		WebElement dropdowns = driver.findElement(By.xpath(""));

		Select selectdrop = new Select(dropdowns);

		selectdrop.selectByValue("2020");
		selectdrop.selectByVisibleText("August");
		selectdrop.selectByIndex(3);

		selectdrop.deselectAll();
		selectdrop.deselectByIndex(20);
		selectdrop.deselectByValue("2025");
		selectdrop.deselectByVisibleText("August");

		/* Alert */ /*
					 * System alert and Web page Alert WebPage Simple Alert - "ok"Button Prompt
					 * Alert --Sending some input confirmation alert - "Ok or cancel button"
					 */

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("values");

		/*
		 * TimeOuts in Selinium AKA Synchronisation in Selenium
		 * 
		 * Static Wait and Dynamic Wait Static wait - Definiety wait or halt the
		 * execution for the given period of time
		 * 
		 * disadvatage definite wait execution time taken to execute delays slowness
		 * With all the above factors it is not preferable
		 */

		Thread.sleep(30000);

		/*
		 * Dynamic Wait Implicit wait
		 */
		driver.manage().timeouts().implicitlyWait(2500,
				TimeUnit.MILLISECONDS); /* Time given for all the elements to be identified by the driver */

		/* page load time out */
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

		/* Explicit wait */

		WebDriverWait explicitwait = new WebDriverWait(driver, 20);
		explicitwait.until(ExpectedConditions.visibilityOf(dropdowns));

		/* FluentWait */

		FluentWait fluent = new WebDriverWait(driver, 20);
		fluent.until(ExpectedConditions.alertIsPresent());
		fluent.pollingEvery(5, TimeUnit.SECONDS);

		/* Frames */
		int framenumber = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		int parentFrame = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("text");

		/* Actions Class */

		Actions mouseref = new Actions(driver);
		WebElement soureref = driver.findElement(By.xpath("//input[@type='range' and @min='0']"));
		WebElement destref = driver.findElement(By.xpath("//input[@type='range' and @value='90']"));
		mouseref.dragAndDrop(soureref, destref);
		mouseref.build().perform();

	}

}
