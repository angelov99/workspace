import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.cars.bg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class, 'mdc-ripple-upgraded')]")).click();
		driver.findElement(By.xpath("//nav[@id = 'navigationList']/a[4]")).click();
		driver.findElement(By.xpath("//*[@id=\'searchPage\']/form/div/div/div/div[1]/span[2]")).click();
		driver.findElement(By.id("locationText")).click();
		WebElement locationText = driver.findElement(By.id("locationText"));
		Thread.sleep(2000);
		locationText.sendKeys("Плевен");
		driver.findElement(By.xpath("//*[@id=\"accountCitySelectSheet\"]/div/header/div/section[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"dealershipsListContainer\"]/div/div[4]/a/div")).click();
		driver.findElement(By.xpath("//div[@title = 'Audi A6 3.0TDI S-LINE']/div/div/a/div")).click();
		
		
			
	
		

		
	}

}
