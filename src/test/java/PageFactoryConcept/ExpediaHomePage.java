package PageFactoryConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomePage {
	WebDriver driver;

	@FindBy(id = "header-logo")
	WebElement Expedialogo;

	@FindBy(xpath = "//a[contains(text(), 'List your property')]")
	WebElement listYourProperty;

	@FindBy(xpath = "//li[@id ='account-menu']/button[@id = 'header-account-menu']")
	WebElement account;

	@FindBy(id = "account-signin")
	WebElement login;

	@FindBy(id = "account-register")
	WebElement accRegister;

	@FindBy(id = "header-history")
	WebElement myLists;

	@FindBy(id = "header-itineraries")
	WebElement myTrips;

	@FindBy(id = "header-support-menu")
	WebElement support;

	@FindBy(id = "support-cs")
	WebElement customerSupport;

	@FindBy(id = "support-feedback")
	WebElement feedback;

	@FindBy(id = "header-language-2058")
	WebElement espanol;

	@FindBy(id = "header-language-2052")
	WebElement langChinese;

	@FindBy(id = "primary-header-flight")
	WebElement flights;

	@FindBy(id = "primary-header-hotel")
	WebElement hotels;

	@FindBy(id = "primary-header-package")
	WebElement bundlesAndSave;

	@FindBy(id = "primary-header-car")
	WebElement cars;

	@FindBy(id = "primary-header-cruise")
	WebElement cruises;

	@FindBy(id = "primary-header-activity")
	WebElement thingsToDO;

	@FindBy(id = "primary-header-vacationRental")
	WebElement vacationRentals;

	@FindBy(id = "primary-header-deals")
	WebElement deals;

	@FindBy(id = "primary-header-rewards")
	WebElement rewards;

	@FindBy(id = "primary-header-mobile")
	WebElement mobile;

	@FindBy(xpath = "//span[@class = 'symbol rtb_hotels']")
	WebElement tickSymbol1;

	@FindBy(xpath = "//ul[@id = 'reasons-to-believe-banner']/li[1]/span[@class ='reason']")
	WebElement tickSymbol1_text;

	@FindBy(xpath = "//span [@class = 'symbol rtb_lowest_price']")
	WebElement tickSymbol2;

	@FindBy(xpath = "//ul[@id = 'reasons-to-believe-banner']/li[2]/span[@class ='reason']")
	WebElement tickSymbol2_text;

	@FindBy(id = "tab-flight-tab-hp")
	WebElement flight_tab;

	@FindBy(id = "flight-origin-hp-flight")
	WebElement flying_from;

	@FindBy(id = "flight-destination-hp-flight")
	WebElement destination;

	@FindBy(id = "flight-departing-hp-flight")
	WebElement flight_depart_date;

	@FindBy(id = "flight-returning-hp-flight")
	WebElement flight_return_date;

	@FindBy(xpath = "//div[@id = 'traveler-selector-hp-flight']//ul/li/button")
	WebElement no_of_travellers;

	@FindBy(xpath = "//div[@class = 'datepicker-cal']//div[3]//tr[3]//td[5]")
	WebElement departing_date;

	@FindBy(xpath = "//div[@class = 'datepicker-dropdown']/div//div[3]//tr[4]/td[3]")
	WebElement return_date;

	@FindBy(xpath = "//form[@id = 'gcw-flights-form-hp-flight']//button[@type = 'submit']")
	WebElement submit;

	public  ExpediaHomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void flight_tab_click() {
		flight_tab.click();

	}

	public void flying_from_txt() {

		flying_from.sendKeys("New Delhi");
	}

	public void destination_txt() {
		destination.sendKeys("Banglore");
	}

	public void flight_depart_date_select() throws InterruptedException {
		flight_depart_date.click();
		Thread.sleep(2000);
		departing_date.click();

	}

	public void flight_return_date_select() throws InterruptedException {

		flight_return_date.clear();
		flight_return_date.sendKeys("04/21/2010");
		Thread.sleep(2000);
		//return_date.sendKeys("04/21/2010");

	}

	public void submit_click() {
		submit.click();
	}

	public void headerFlightClick() {
		flights.click();
		System.out.println("The Flight link in Header bar is clicked");
	}

	public void headerHotelClick() {
		hotels.click();
		System.out.println("The hotel link in Header bar is clicked");
	}

	public void headerPackageClick() {
		bundlesAndSave.click();
		System.out.println("The 'Bundle And Save' link in Header bar is clicked");
	}

	public void headerCarsClick() {
		cars.click();
		System.out.println("The cars link in Header bar is clicked");
	}

	public void headerCruisesClick() {
		cruises.click();
		System.out.println("The Cruises link in Header bar is clicked");
	}

	public void headerActivityClick() {
		thingsToDO.click();
		System.out.println("The Things To Do link in Header bar is clicked");
	}

	public void headerVacationRentalsClick() {
		vacationRentals.click();
		System.out.println("The Vacation Rentals link in Header bar is clicked");

	}

	public void headerDealsClickClick() {
		deals.click();
		System.out.println("The Deals link in Header bar is clicked");
	}

	public void headerRewardsClick() {
		rewards.click();
		System.out.println("The Reward link in Header bar is clicked");
	}

	public void headerMobileClick() {
		mobile.click();
		System.out.println("The Mobile link in Header bar is clicked");
	}

}
