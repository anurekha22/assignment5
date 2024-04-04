package assignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
	driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	driver.findElement(By.xpath("//div[@class='facet-linkhead']")).click();
	
	WebElement item = driver.findElement(By.xpath("//strong[text()=' Items Found']"));
	System.out.println("Items Found  :" + item.getText());
	List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
	System.out.println("-------BRANDS ARE--------");
	for (WebElement b : brand) {
		System.out.println(b.getText());
	}
	List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
	System.out.println("--------BAG NAMES ARE--------");
	for (WebElement n : bagname) {
		System.out.println(n.getText());
	}
	driver.close();

}
	

	}


