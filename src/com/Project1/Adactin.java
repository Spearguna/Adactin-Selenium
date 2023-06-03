package com.Project1;

//import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Adactin {
	private static void website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Project1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.name("username")).sendKeys("spearguna");
		driver.findElement(By.id("password")).sendKeys("speargun7");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.id("location"));
		Select aa = new Select(location);
		aa.selectByValue("London");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select bb = new Select(hotels);
		bb.selectByIndex(3);
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select cc = new Select(room);
		cc.selectByVisibleText("Super Deluxe");
		WebElement noofrooms = driver.findElement(By.id("room_nos"));
		Select dd = new Select(noofrooms);
		dd.selectByIndex(4);
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("03/10/2022");
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.clear();
		checkout.sendKeys("07/10/2022");
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select ee = new Select(adults);
		ee.selectByValue("4");
		WebElement child = driver.findElement(By.id("child_room"));
		Select ff = new Select(child);
		ff.selectByVisibleText("3 - Three");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("first_name")).sendKeys("Rattle");
		driver.findElement(By.id("last_name")).sendKeys("snake1234567");
		driver.findElement(By.xpath("//textarea[@rows='4']")).sendKeys("5/465, II Fllor"
				+ "Valayapathy salai"
				+ "J.J.Nagar"
				+ "Chennai-37");
		driver.findElement(By.name("cc_num")).sendKeys("1234567891011121");
		WebElement card_type = driver.findElement(By.id("cc_type"));
		Select gg = new Select(card_type);
		gg.selectByVisibleText("American Express");
		WebElement expiry_month = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		Select hh = new Select(expiry_month);
		hh.selectByIndex(12);
		WebElement expiry_year = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		Select ii = new Select(expiry_year);
		ii.selectByVisibleText("2022");
		driver.findElement(By.xpath("(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]")).sendKeys("444");
		driver.findElement(By.name("book_now")).click();

		Thread.sleep(3000);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement itinerary = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
		//js.executeScript("arguments[0].scrollIntoView();", itinerary);
		itinerary.click();
		//TakesScreenshot ts =(TakesScreenshot)itinerary;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\Dell\\eclipse-workspace\\Project\\screenshot\\booking.png");
		//FileHandler.copy(source, destination);


		}
		public static void main (String[] gg) throws InterruptedException {
		website();
		}
		}


