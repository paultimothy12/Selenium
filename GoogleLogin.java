package seleniumtest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "YOUR WEBDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		//navigation to google
		driver.get("https://www.google.co.in/");
		Actions action = new Actions(driver);
		//clicking on sign-in
		WebElement signinclick= driver.findElement(By.cssSelector("#gb > div > div.gb_Re > a"));
		action.moveToElement(signinclick);
		action.click();
		action.perform();
		//login 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("NEW EMAIL ADDRESS");
		WebElement signinclick1= driver.findElement(By.cssSelector("#identifierNext > div > button > div.VfPpkd-RLmnJb"));
		action.moveToElement(signinclick1);
		action.click();
		action.perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("YOU PASSWORD");
		WebElement passnext = driver.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb"));
		action.moveToElement(passnext);
		action.click();
		action.perform();
		driver.close();
	}

}
