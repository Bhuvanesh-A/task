package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuildPage extends BaseClass{
		public BuildPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Login		
		@FindBy(how = How.ID, using = "log_in_popup")
		private WebElement login;

		public WebElement getLogin() {
			return login;
		}
		
		@FindBy(how = How.ID, using = "email")
		private WebElement userName;

		public WebElement getUserName() {
			return userName;
		}
		
		@FindBy(how = How.ID, using = "password")
		private WebElement passWord;

		public WebElement getPassWord() {
			return passWord;
		}
		
		@FindBy(how = How.ID, using = "send2")
		private WebElement loginBt;

		public WebElement getLoginBt() {
			return loginBt;
		}
		
		@FindBy(how = How.ID, using = "grandtotal")
		private WebElement totalPrice;

		public WebElement getPrice() {
			return totalPrice;
		}
		
		//general
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your Brand']")
		private WebElement brand;

		public WebElement getBrand() {
			return brand;
		}
				
		@FindBy(how = How.XPATH, using = "//button[contains(@onclick,'render_search_product_list(this)')]")
		private WebElement searchBt;

		public WebElement getSearchBt() {
			return searchBt;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add To List')]")
		private WebElement addToList;

		public WebElement getAddToList() {
			return addToList;
		}
		
		// CPU 
		@FindBy(how = How.ID, using = "render_product_list_btn_10")
		private WebElement cpuList;

		public WebElement getCpuList() {
			return cpuList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your Series']")
		private WebElement cpuSeries;

		public WebElement getCpuSeries() {
			return cpuSeries;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Processor (CPU)')]")
		private WebElement cpuSearch;

		public WebElement getCpuSearch() {
			return cpuSearch;
		}		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'AMD Ryzen 5 5600X')]")
		private WebElement cpuName;

		public WebElement getCpuName() {
			return cpuName;
		}
	
		//CPU Cooler
		@FindBy(how = How.ID, using = "render_product_list_btn_23")
		private WebElement cpuCoolerList;

		public WebElement getCpuCoolerList() {
			return cpuCoolerList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your Cooling Type']")
		private WebElement cpuCoolerSeries;

		public WebElement getCpuCoolerSeries() {
			return cpuCoolerSeries;
		}
				
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Cooling System (CPU Cooler)')]")
		private WebElement cpuCoolerSearch;

		public WebElement getCpuCoolerSearch() {
			return cpuCoolerSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Cooler Master Hyper 212 Halo Black ARGB')]")
		private WebElement cpuCoolerName;

		public WebElement getCpuCoolerName() {
			return cpuCoolerName;
		}
		
		//MotherBoard
		@FindBy(how = How.ID, using = "render_product_list_btn_13")
		private WebElement mbList;

		public WebElement getMbList() {
			return mbList;
		}
				
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your Chipset']")
		private WebElement mbSeries;

		public WebElement getMbSeries() {
			return mbSeries ;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Motherboard')]")
		private WebElement mbSearch;

		public WebElement getMbSearch() {
			return mbSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gigabyte B550 AORUS Elite AX V2')]")
		private WebElement mbName;

		public WebElement getMbName() {
			return mbName;
		}
		
		//RAM
		@FindBy(how = How.ID, using = "render_product_list_btn_14")
		private WebElement ramList;

		public WebElement getRamList() {
			return ramList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your KIT TYPE']")
		private WebElement ramSeries;

		public WebElement getRamSeries() {
			return ramSeries ;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Memory (RAM)')]")
		private WebElement ramSearch;

		public WebElement getRamSearch() {
			return ramSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Corsair CMK16GX4M1Z3600C18 Desktop Ram Vengeance')]")
		private WebElement ramName;

		public WebElement getRamName() {
			return ramName;
		}
		
		//SSD
		@FindBy(how = How.ID, using = "render_product_list_btn_15")
		private WebElement ssdList;

		public WebElement getSsdList() {
			return ssdList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your CAPACITY']")
		private WebElement ssdSeries;

		public WebElement getSsdSeries() {
			return ssdSeries ;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Solid State Drive (M.2 SSD)')]")
		private WebElement ssdSearch;

		public WebElement getSsdSearch() {
			return ssdSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Crucial P3 500GB PCIe')]")
		private WebElement ssdName;

		public WebElement getSsdName() {
			return ssdName;
		}
		
		//GPU
		@FindBy(how = How.ID, using = "render_product_list_btn_18")
		private WebElement gpuList;

		public WebElement getGpuList() {
			return gpuList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your GPU']")
		private WebElement gpuSeries;

		public WebElement getGpuSeries() {
			return gpuSeries ;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Graphics Card (GPU/VGA)')]")
		private WebElement gpuSearch;

		public WebElement getGpuSearch() {
			return gpuSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'MSI GeForce RTX 4060 Ventus 2X Black OC')]")
		private WebElement gpuName;

		public WebElement getGpuName() {
			return gpuName;
		}
		
		//PowerSupply
		@FindBy(how = How.ID, using = "render_product_list_btn_19")
		private WebElement powerList;

		public WebElement getPowerList() {
			return powerList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your Wattage']")
		private WebElement powerSeries;

		public WebElement getPowerSeries() {
			return powerSeries ;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Power Supply Unit (SMPS/PSU)')]")
		private WebElement powerSearch;
		
		public WebElement getPowerSearch() {
			return powerSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Cooler Master MWE 550 V2 230V SMPS')]")
		private WebElement powerName;

		public WebElement getPowerName() {
			return powerName;
		}
		
		//Cabinet
		@FindBy(how = How.ID, using = "render_product_list_btn_20")
		private WebElement cabinetList;

		public WebElement getCabinetList() {
			return cabinetList;
		}
		
		@FindBy(how = How.XPATH, using = "//select[@data-original-title='Choose Your CABINET SIZE']")
		private WebElement cabinetSeries;

		public WebElement getCabinetSeries() {
			return cabinetSeries ;
		}
		
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search Your Cabinet (Case)')]")
		private WebElement cabinetSearch;

		public WebElement getCabinetSearch() {
			return cabinetSearch;
		}
		
		@FindBy(how = How.XPATH, using = "//a[@data-original-title='Antec NX292 RGB (E-ATX) Mid Tower Cabinet With Tempered Glass Side Panel (Black)']")
		private WebElement cabinetName;

		public WebElement getCabinetName() {
			return cabinetName;
		}
//		
		//To save
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Save This Build ')]")
		private WebElement save;

		public WebElement getSave() {
			return save;
		}
		
		//To Create Link
		@FindBy(how = How.XPATH, using = "//a[@onclick='create_link();']")
		private WebElement createLink;

		public WebElement getCreateLink() {
			return createLink;
		}
//		
		//To copy 
		@FindBy(how = How.XPATH, using = "//button[@data-original-title='Copy To Clipboard']")
		private WebElement copy;

		public WebElement getCopy() {
			return copy;
		}
		
		@FindBy(how = How.ID, using = "stored_link")
		private WebElement link;

		public WebElement getLink() {
			return link;
		}
		
}
