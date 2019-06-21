package ch.ilv.crm.test.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateProductTest {

	@Test
	public void CreatePruductTest() {
		// Configure firefox driver
		 System.setProperty("webdriver.gecko.driver", "C:\\emmenegger\\Dev-Tools\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		// Start firefox driver
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:7070/products");
		String title = driver.getTitle();
		assertTrue(title.contains("Products"));

		WebElement product = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		product.sendKeys("Longbow");

		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
				
		button.click();

		WebElement productName = driver.findElement(By.xpath("/html/body/span"));

		assertTrue(productName.getText().trim().contains("Longbow"));
	}

}
