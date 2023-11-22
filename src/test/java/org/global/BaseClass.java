package org.global;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static FileInputStream stream;
	private static Workbook book;

	// To Close Driver
	public static void closeDriver() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To minimize the Browser
	public static void minBrowser() {
		try {
			driver.manage().window().minimize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To maximize the Browser
	public static void maxBrowser() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Choose Browser
	public static void getDriver(String browser) {
		try {
			browser = browser.toLowerCase();
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Invalid Browser");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// To Input URL
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To type on Element using SendKeys
	public static void sendKeys(WebElement webElement, String keys) {
		try {
			webElement.sendKeys("" + keys + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To type on Element using Robot
	public static void robotSendkeys(WebElement webElement, String keys) {
		try {
			String robots = keys;
			Robot r = new Robot();
			Actions act = new Actions(driver);
			maxBrowser();
			waitDynamic();
			act.doubleClick(webElement).perform();

			for (int i = 0; i < robots.length(); i++) {
				char character = robots.charAt(i);
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(character);

				if (keyCode != KeyEvent.VK_UNDEFINED) {
					r.keyPress(keyCode);
					r.keyRelease(keyCode);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// To Press Button
	public static void pressButton(WebElement webElement) {
		try {
			webElement.click();
			maxBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To make Dynamic Wait
	public static void waitDynamic() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Wait using sleep
	public static void waitSleep() {
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To make Browser FullScreen
	public static void fullScreen() {
		try {
			driver.manage().window().fullscreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Take Screenshot for Chrome
	public static void getSsC(String fileName) {
		try {
			waitSleep();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File targetFile = new File(
					"D:\\EclipseLatest\\work\\TaskTestNgPcParts\\screenshot\\chrome\\" + fileName + ".png");
			FileUtils.copyFile(sourceFile, targetFile);
			System.out.println("ScreenShot is saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Take Screenshot for Edge
	public static void getSsE(String fileName) {
		try {
			waitSleep();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File targetFile = new File(
					"D:\\EclipseLatest\\work\\TaskTestNgPcParts\\screenshot\\edge\\" + fileName + ".png");
			FileUtils.copyFile(sourceFile, targetFile);
			System.out.println("ScreenShot is saved");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To send keys using JavaScript
	public static void sendJS(WebElement webElement, String keys) {
		try {
			js = (JavascriptExecutor) driver;
			String value = keys;
			js.executeScript("arguments[0].setAttribe('value','" + value + "')", webElement);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Navigate between Windows
	public static void naviTo(String id) {
		try {
			driver.navigate().to(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Navigate between Windows
	public static void naviBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Navigate between Windows
	public static void naviForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Navigate between Windows
	public static void naviRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To scroll up using JavaScript
	public static void scrollUpJS(WebElement webElement) {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", webElement);
			waitSleep();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To scroll down using JavaScript
	public static void scrollDownJS(WebElement webElement) {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", webElement);
			waitSleep();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Handle Simple Alert
	public static void alertSimple(WebElement webElement) {
		try {
			webElement.click();
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Handle Confirm Alert with accept
	public static void alertConfirmAccept(WebElement webElement) {
		try {
			webElement.click();
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Handle Confirm Alert with dismiss
	public static void alertConfirmDismiss(WebElement webElement) {
		try {
			webElement.click();
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Handle Confirm Alert
	public static void promptConfirm(WebElement webElement, String keys) {
		try {
			webElement.click();
			Alert promptAlert = driver.switchTo().alert();
			promptAlert.sendKeys(keys);
			promptAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To drag and Drop
	public static void dragAndDrop(String sourceXpath, String targetXpath) {
		try {
			Actions act = new Actions(driver);
			WebElement sourceElement = driver.findElement(By.xpath(sourceXpath));
			WebElement targetElement = driver.findElement(By.xpath(targetXpath));
			act.dragAndDrop(sourceElement, targetElement).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To select using Index
	public static void selectOptionIndex(WebElement webElement, int index) {
		try {
			Select values = new Select(webElement);
			values.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To select using Value
	public static void selectOptionValue(WebElement webElement, String i) {
		try {
			Select values = new Select(webElement);
			values.selectByValue(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To select using VisibleText
	public static void selectOptionText(WebElement webElement, String txt) {
		try {
			Select values = new Select(webElement);
			values.selectByVisibleText(txt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To list Select Options
	public static void selectOptionList(WebElement webElement) {
		try {
			Select values = new Select(webElement);
			List<WebElement> options = values.getOptions();
			for (int i = 0; i < options.size(); i++) {
				String option = options.get(i).getText();
				System.out.println("Options size is: " + options.size());
				System.out.println("Options are: " + "\n" + option);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To MultiSelect
	public static void selectMultiple(WebElement webElement, String keys) {
		try {
			Select values = new Select(webElement);
			boolean multiple = values.isMultiple();
			System.out.println(multiple);
			List<WebElement> options = values.getOptions();
			for (int i = 0; i < options.size(); i++) {
				String option = options.get(i).getText();
				System.out.println("Options size is: " + options.size());
				System.out.println("Options are: " + "\n" + option);
			}
			values.selectByValue(keys);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To check in All Windows ID
	public static void checkAllWindowId() {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> list = new LinkedList<String>();
			list.addAll(windowHandles);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Switch Parent Window
	public static void selectParentWindowId() {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> list = new LinkedList<String>();
			list.addAll(windowHandles);
			String parentWindowHandle = list.get(0);
			driver.switchTo().window(parentWindowHandle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Switch Windows with Index
	public static void selectWindowId(int windowIndex) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> list = new LinkedList<String>();
			list.addAll(windowHandles);
			String windowId = list.get(windowIndex);
			driver.switchTo().window(windowId);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// To switch Frame
	public static void selectFrame(WebElement webElement) {
		try {
			driver.switchTo().frame(webElement);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To get the File
	public static void getFile(String fileName) {
		try {
			File sourceFile = new File("D:\\EclipseLatest\\work\\TaskTestNgPcParts\\screenshot\\" + fileName + ".xlsx");
			stream = new FileInputStream(sourceFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// To get values from Excel
	public static void excelOutput(String name) {
		try {
			book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(name);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.println(value + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// To get values from Excel with Numeric and Dates
	public static String excelReadWithNum(int rownum, int colnum) {
		try {
			File file = new File("D:\\EclipseLatest\\work\\TaskTestNgPcParts\\excel\\BuildPc.xlsx");
			FileInputStream stream = new FileInputStream(file);
			book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet("Sheet3");
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(colnum);
			CellType cellType = cell.getCellType();
			String value = null;
			switch (cellType) {
			case STRING:
				value = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
					value = simple.format(dateCellValue);

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					BigDecimal valueOf = BigDecimal.valueOf(l);
					value = valueOf.toString();

				}
				break;

			default:

				break;
			}
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// To create Excel
	public static void excelInput(String fileName, String sheetName, int rownum, int column, String cellValue) {
		try {
			File file = new File("D:\\EclipseLatest\\work\\TaskTestNgPcParts\\excel\\" + fileName + ".xlsx");
			book = new XSSFWorkbook();
			Sheet createSheet = book.createSheet(sheetName);
			Row createRow = createSheet.createRow(rownum);
			Cell createCell = createRow.createCell(column);
			createCell.setCellValue(cellValue);
			FileOutputStream out = new FileOutputStream(file);
			book.write(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To enter Input using JS
	public static void textSendBasedOnJS(String txtInput, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + txtInput + "')", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// To enter input from excel
	public static String excelRead(int rownum, int cellnum) {
		try {
			// To locate the Where Excel is
			File file = new File("D:\\EclipseLatest\\work\\TaskTestNgPcParts\\excel\\BuildPc.xlsx");

			// To get File as Input from Given Location
			FileInputStream stream = new FileInputStream(file);

			book = new XSSFWorkbook(stream);

			// To get Sheet from Workbook
			Sheet sheet = book.getSheet("Sheet1");

			// To get Row from Sheet
			Row row = sheet.getRow(rownum);

			// To get Cell from Row
			Cell cell = row.getCell(cellnum);

			// To find Cell Type
			CellType cellType = cell.getCellType();
			String value = null;
			switch (cellType) {
			case STRING:
				value = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
					value = simple.format(dateCellValue);

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					BigDecimal valueOf = BigDecimal.valueOf(l);
					value = valueOf.toString();

				}
				break;

			default:

				break;
			}
			return value;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// To clear
	public static void clearElement(WebElement webElement) {
		try {
			webElement.clear();
			webElement.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To create New Tab
	public static void newWindow() {
		try {
			driver.switchTo().newWindow(WindowType.TAB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To Get Attribute Value
	public static String getValue(WebElement web) {
		try {
			String attribute = web.getAttribute("value");
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		return new Object[][] { { excelReadWithNum(0, 0), excelReadWithNum(0, 1) },
				{ excelReadWithNum(1, 0), excelReadWithNum(1, 1) }, { excelReadWithNum(2, 0), excelReadWithNum(2, 1) },
				{ excelReadWithNum(3, 0), excelReadWithNum(3, 1) }, { excelReadWithNum(4, 0), excelReadWithNum(4, 1) }

		};
	}
}
