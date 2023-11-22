package org.check;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.BuildPage;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EdgeTestingClass extends BaseClass {
	@Parameters({ "browser" })
	@Test(priority = 1)
	public static void login(@Optional("Edge") String browserName) {
		try {
			getDriver(browserName);
			maxBrowser();
			getUrl(excelRead(0, 1));
			// Login
			BuildPage a = new BuildPage();
			WebElement login = a.getLogin();
			login.click();
			waitDynamic();
			WebElement userName = a.getUserName();
			textSendBasedOnJS(excelRead(1, 1), userName);
			WebElement passWord = a.getPassWord();
			textSendBasedOnJS(excelRead(2, 1), passWord);
			WebElement loginBt = a.getLoginBt();
			loginBt.click();
			waitSleep();
			naviRefresh();
			System.out.println("Successfully Logged In" + "\n");
		} catch (Exception e) {
			System.out.println("Error with LogIn: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 2)
	public void addCpu() {
		try {
			BuildPage a = new BuildPage();
			// CPU
			waitDynamic();
			WebElement cpuList = a.getCpuList();
			cpuList.click();
			waitDynamic();
			WebElement cpuBrand = a.getBrand();
			selectOptionText(cpuBrand, excelRead(3, 1));
			waitDynamic();
			WebElement cpuSeries = a.getCpuSeries();
			selectOptionText(cpuSeries, excelRead(4, 1));
			waitDynamic();
			WebElement cpuSearch = a.getCpuSearch();
			waitSleep();
			sendKeys(cpuSearch, excelRead(5, 1));
			WebElement cpuSearchBt = a.getSearchBt();
			cpuSearchBt.click();
			WebElement cpuName = a.getCpuName();
			cpuName.click();
			selectWindowId(1);
			waitSleep();
			getSsE(excelRead(28, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement cpuAddToList = a.getAddToList();
			waitDynamic();
			cpuAddToList.click();

			System.out.println("Successfully Added Cpu In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding Cpu: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 3)
	public void addCooler() {
		try {
			BuildPage a = new BuildPage();
			// CPU cooler
			waitDynamic();
			WebElement cpuCoolerList = a.getCpuCoolerList();
			cpuCoolerList.click();
			waitDynamic();
			WebElement coolerBrand = a.getBrand();
			selectOptionText(coolerBrand, excelRead(6, 1));
			waitDynamic();
			WebElement coolerSeries = a.getCpuCoolerSeries();
			selectOptionText(coolerSeries, excelRead(7, 1));
			waitDynamic();
			WebElement cpuCoolerSearch = a.getCpuCoolerSearch();
			waitSleep();
			sendKeys(cpuCoolerSearch, excelRead(8, 1));
			WebElement coolerSearchBt = a.getSearchBt();
			coolerSearchBt.click();
			WebElement cpuCoolerName = a.getCpuCoolerName();
			waitSleep();
			cpuCoolerName.click();
			selectWindowId(2);
			waitSleep();
			getSsE(excelRead(29, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement coolerAddToList = a.getAddToList();
			waitDynamic();
			coolerAddToList.click();
			System.out.println("Successfully Added CpuCooler In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding CpuCooler: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 4)
	public void addMb() {
		try {
			BuildPage a = new BuildPage();
			// MotherBoard
			waitDynamic();
			WebElement mbList = a.getMbList();
			mbList.click();
			waitDynamic();
			WebElement mbBrand = a.getBrand();
			selectOptionText(mbBrand, excelRead(9, 1));
			waitDynamic();
			WebElement mbSeries = a.getMbSeries();
			selectOptionText(mbSeries, excelRead(10, 1));
			waitDynamic();
			WebElement mbSearch = a.getMbSearch();
			waitSleep();
			sendKeys(mbSearch, excelRead(11, 1));
			WebElement mbSearchBt = a.getSearchBt();
			mbSearchBt.click();
			WebElement mbName = a.getMbName();
			waitSleep();
			mbName.click();
			selectWindowId(3);
			waitSleep();
			getSsE(excelRead(30, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement mbAddToList = a.getAddToList();
			waitDynamic();
			mbAddToList.click();
			System.out.println("Successfully Added MotherBoard In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding MotherBoard: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 5)
	public void addRam() {
		try {
			BuildPage a = new BuildPage();
			// Ram
			waitDynamic();
			WebElement ramList = a.getRamList();
			ramList.click();
			waitDynamic();
			WebElement ramBrand = a.getBrand();
			selectOptionText(ramBrand, excelRead(12, 1));
			waitDynamic();
			WebElement ramSeries = a.getRamSeries();
			selectOptionText(ramSeries, excelRead(13, 1));
			waitDynamic();
			WebElement ramSearch = a.getRamSearch();
			waitSleep();
			sendKeys(ramSearch, excelRead(14, 1));
			WebElement ramSearchBt = a.getSearchBt();
			ramSearchBt.click();
			WebElement ramName = a.getRamName();
			waitSleep();
			ramName.click();
			selectWindowId(4);
			waitSleep();
			getSsE(excelRead(31, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement ramAddToList = a.getAddToList();
			waitDynamic();
			ramAddToList.click();
			System.out.println("Successfully Added Ram In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding Ram: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 6)
	public void addSsd() {
		try {
			BuildPage a = new BuildPage();
			// SSD
			waitDynamic();
			WebElement ssdList = a.getSsdList();
			ssdList.click();
			waitDynamic();
			WebElement ssdBrand = a.getBrand();
			selectOptionText(ssdBrand, excelRead(15, 1));
			waitDynamic();
			WebElement ssdSeries = a.getSsdSeries();
			selectOptionText(ssdSeries, excelRead(16, 1));
			waitDynamic();
			WebElement ssdSearch = a.getSsdSearch();
			waitSleep();
			sendKeys(ssdSearch, excelRead(17, 1));
			WebElement ssdSearchBt = a.getSearchBt();
			ssdSearchBt.click();
			WebElement ssdName = a.getSsdName();
			waitSleep();
			ssdName.click();
			selectWindowId(5);
			waitSleep();
			getSsE(excelRead(35, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement ssdAddToList = a.getAddToList();
			waitDynamic();
			ssdAddToList.click();
			System.out.println("Successfully Added Ssd In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding Ssd: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 7)
	public void addGpu() {
		try {
			BuildPage a = new BuildPage();
			// GPU
			waitDynamic();
			WebElement gpuList = a.getGpuList();
			gpuList.click();
			waitDynamic();
			WebElement gpuBrand = a.getBrand();
			selectOptionText(gpuBrand, excelRead(18, 1));
			waitDynamic();
			WebElement gpuSeries = a.getGpuSeries();
			selectOptionText(gpuSeries, excelRead(19, 1));
			waitDynamic();
			WebElement gpuSearch = a.getGpuSearch();
			waitSleep();
			sendKeys(gpuSearch, excelRead(20, 1));
			WebElement gpuSearchBt = a.getSearchBt();
			gpuSearchBt.click();
			WebElement gpuName = a.getGpuName();
			waitSleep();
			gpuName.click();
			selectWindowId(6);
			waitSleep();
			getSsE(excelRead(32, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement gpuAddToList = a.getAddToList();
			waitDynamic();
			gpuAddToList.click();
			System.out.println("Successfully Added Gpu In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding Gpu: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 8)
	public void addPower() {
		try {
			BuildPage a = new BuildPage();
			// Power Supply
			waitDynamic();
			WebElement powerList = a.getPowerList();
			powerList.click();
			waitDynamic();
			WebElement powerBrand = a.getBrand();
			selectOptionText(powerBrand, excelRead(21, 1));
			waitDynamic();
			WebElement powerSeries = a.getPowerSeries();
			selectOptionText(powerSeries, excelRead(22, 1));
			waitDynamic();
			WebElement powerSearch = a.getPowerSearch();
			waitSleep();
			sendKeys(powerSearch, excelRead(23, 1));
			WebElement powerSearchBt = a.getSearchBt();
			powerSearchBt.click();
			WebElement powerName = a.getPowerName();
			waitSleep();
			powerName.click();
			selectWindowId(7);
			waitSleep();
			getSsE(excelRead(33, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement powerAddToList = a.getAddToList();
			waitDynamic();
			powerAddToList.click();
			System.out.println("Successfully Added PowerSupply In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding PowerSupply: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 9)
	public void addCabinet() {
		try {
			BuildPage a = new BuildPage();
			// Cabinet
			waitDynamic();
			WebElement cabinetList = a.getCabinetList();
			cabinetList.click();
			waitDynamic();
			WebElement cabinetBrand = a.getBrand();
			selectOptionText(cabinetBrand, excelRead(24, 1));
			waitDynamic();
			WebElement cabinetSeries = a.getCabinetSeries();
			selectOptionText(cabinetSeries, excelRead(25, 1));
			waitDynamic();
			WebElement cabinetSearch = a.getCabinetSearch();
			waitSleep();
			sendKeys(cabinetSearch, excelRead(26, 1));
			WebElement cabinetSearchBt = a.getSearchBt();
			cabinetSearchBt.click();
			WebElement cabinetName = a.getCabinetName();
			waitSleep();
			cabinetName.click();
			selectWindowId(8);
			waitSleep();
			getSsE(excelRead(34, 1));
			selectWindowId(0);
			waitDynamic();
			WebElement cabinetAddToList = a.getAddToList();
			waitDynamic();
			cabinetAddToList.click();
			System.out.println("Successfully Added Cabinet In List" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Adding Cabinet: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 10)
	public void saveBuild() {
		try {
			BuildPage a = new BuildPage();
			// To save Build
			waitSleep();
			WebElement save = a.getSave();
			save.click();
			waitSleep();
			System.out.println("\n" + "Successfully Saved The Build" + "\n");
		} catch (Exception e) {
			System.out.println("Error With Saving Build: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 11)
	public void createLink() {
		try {
			BuildPage a = new BuildPage();
			// To Create Link of Build
			waitDynamic();
			WebElement createLink = a.getCreateLink();
			createLink.click();
			waitSleep();
			System.out.println("\n" + "Successfully Link Created For The Build" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Creating Link: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 12)
	public void copyLink() {
		try {
			BuildPage a = new BuildPage();
			// To copy the Link
			waitSleep();
			waitDynamic();
			WebElement link = a.getLink();
			String text = link.getText();
			System.out.println("\n" + "Link :" + text);
			System.out.println("Successfully Link Copied" + "\n");
		} catch (Exception e) {
			System.out.println("Error with Creating Link: " + "Error_" + e.getMessage() + "\n");
		}
	}

	@Test(priority = 13)
	public static void getPrice() {
		// Confirmation
		try {
			BuildPage a = new BuildPage();
			// Price
			waitDynamic();
			WebElement price = a.getPrice();
			String value = getValue(price);
			System.out.println("\n" + "Total Price Of The Build Is : Rs. " + value + "\n");
		} catch (Exception e) {
			System.out.println("Error with Getting The Price: " + "Error_" + e.getMessage() + "\n");
		}
	}
}
