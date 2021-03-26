package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import gherkin.ast.DataTable;

public class BaseClass {

		public static WebDriver driver;
		public static DataTable dataTable;

		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Hari Prasad S\\eclipse-workspace\\CucumberPOM\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			return driver;
		}
		
	

		public static void loadUrl(String url) {
			driver.get(url);
			maximize();
			implicitlyWait();
		}

		public static void maximize() {
			driver.manage().window().maximize();
		}

		public static void implicitlyWait() {
			driver.manage().timeouts().implicitlyWait(11 ,TimeUnit.SECONDS);
		}

		public static void sendKey(WebElement element, String data) {
			element.sendKeys(data);
		}

		public static void buttonClick(WebElement element) {
			element.click();
		}

		public static void selctbytext(WebElement element, String data) {
			new Select(element).selectByVisibleText(data);
		}

		public static void selectbyvalue(WebElement element, String data) {
			new Select(element).selectByValue(data);
		}

		public static void selectbyindex(WebElement element, int index) {
			new Select(element).selectByIndex(index);
		}

		public static List<String> getOptions(WebElement element, String data) {
			List<String> l = new ArrayList<String>();
			List<WebElement> options = new Select(element).getOptions();
			for (WebElement newOpt : options) {
				l.add(newOpt.getText());
			}
			return l;
		}
		
		public void clear(WebElement element) {
			
			element.clear();

		}

		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}
		public static void submit(WebElement element) {
			element.submit();
		}
		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println("My Order Id Is " +attribute);
			return attribute;
		}

		public void confirmAlertAccept() {

			Alert alert = driver.switchTo().alert();
			alert.accept();

		}

		public void confirmAlertDismiss() {

			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		}
	}

