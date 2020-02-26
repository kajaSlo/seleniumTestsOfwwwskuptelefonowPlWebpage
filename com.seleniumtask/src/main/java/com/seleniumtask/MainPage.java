package com.seleniumtask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainPage {

	WebDriver driver;

	By nextPage = By.xpath("/html/body/div/div[4]/div/form/div/ul/li[5]/a");
	By previousPage = By.xpath("/html/body/div/div[4]/div/form/div/ul/li[2]/a");
	By endPage = By.xpath("/html/body/div/div[4]/div/form/div/ul/li[6]/a");
	By startPage = By.xpath("/html/body/div/div[4]/div/form/div/ul/li[1]/a");
	By dropDownElementsOnPage = By.xpath("/html/body/div/div[4]/div/form/select[2]");
	By recentryAddedProducts = By.xpath("/html/body/div/div[4]/div/form/select[1]");
	By searchForAProduct = By.xpath("/html/body/div/div[4]/table/tbody/tr/td/form/input[1]");
	By clickButton = By.xpath("/html/body/div/div[4]/table/tbody/tr/td/form/input[2]");
	By dropDownByPrice = By.xpath("/html/body/div/div[4]/div/form/select");
	By buttonThatRedirecsToSellingPage = By.xpath("/html/body/div/div[4]/div/div[2]/div[1]/div/div[4]/a/img");
	By printButton = By.xpath("/html/body/div/div[4]/div/div[1]/a/img");
	By iphone4s16GB = By.xpath("/html/body/div/div[4]/div/div[2]/div[1]/div");
	By iphone4s32GB = By.xpath("/html/body/div/div[4]/div/div[2]/div[2]/div");
	By iphone4s64GB = By.xpath("/html/body/div/div[4]/div/div[2]/div[3]/div");
	By iphone4s8GB = By.xpath("/html/body/div/div[4]/div/div[2]/div[4]/div");
	By opinions = By.xpath("/html/body/div/div[3]/p/a/img");
	By extendedSearch = By.xpath("/html/body/div/div[4]/table/tbody/tr/td/a");
	By podlaskieProvince = By.xpath("/html/body/div/div[5]/div[3]/div/div/ul/li[10]");
	By kujawskoPomorskieProvince = By.xpath("/html/body/div/div[5]/div[3]/div/div/ul/li[2]");
	By basket = By.xpath("/html/body/div/div[5]/div[4]/div/table/tbody/tr[1]/td/a");
	By certyficationOfUtilization = By.xpath("/html/body/div/div[5]/div[14]/div/p[1]/a/img");
	By investInPhoneSells = By.xpath("/html/body/div/div[5]/div[15]/div/p/a/img");
	By partnershipProgram = By.xpath("/html/body/div/div[5]/div[16]/div/p[1]/strong[2]/span/span/span/a/img");
	By informations = By.xpath("/html/body/div/div[6]/ul/li[1]/a/span");
	By aboutUs = By.xpath("/html/body/div/div[6]/ul/li[2]/a/span");
	By trustedUs = By.xpath("/html/body/div/div[6]/ul/li[3]/a/span");
	By purchasePhonesFromCompanies = By.xpath("/html/body/div/div[6]/ul/li[4]/a/span");
	By purchasePhonesFromPrivatePeople = By.xpath("/html/body/div/div[6]/ul/li[5]/a/span");
	By phonesPricing = By.xpath("/html/body/div/div[6]/ul/li[6]/a/span");
	By utilizationAndRecyclingOfPhones = By.xpath("/html/body/div/div[6]/ul/li[7]/a/span");
	By partnershipProgramOnTheBottom = By.xpath("/html/body/div/div[6]/ul/li[8]/a/span");
	By opinionsOnTheBottom = By.xpath("/html/body/div/div[6]/ul/li[9]/a/span");
	By invest = By.xpath("/html/body/div/div[6]/ul/li[10]/a/span");
	By regulations = By.xpath("/html/body/div/div[6]/ul/li[11]/a/span");

	List <WebElement> iphones4s;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getNextPage() {
		driver.findElement(nextPage).click();
	}

	public void getPreviousPage() {
		driver.findElement(previousPage).click();
	}

	public void getEndPage() {
		driver.findElement(endPage).click();
	}

	public void getStartPage() {
		driver.findElement(startPage).click();
	}

	public void dropDown90ElementsOnPage() {
		Select dropDown90ElementsOnPage = new Select(driver.findElement(dropDownElementsOnPage));
		dropDown90ElementsOnPage.selectByVisibleText("90");
	}

	public void dropDownByRecentlyAddedProducts() {
		Select dropDownByRecentlyAddedProducts = new Select(driver.findElement(recentryAddedProducts));
		dropDownByRecentlyAddedProducts.selectByVisibleText("Ostatnio dodane produkty");
	}

	public void searchForAProduct(String productName) {
		driver.findElement(searchForAProduct).sendKeys(productName);
	}

	public void clickSearchButton() {
		driver.findElement(clickButton).click();
	}

	public List  WebElement> listOfIphone4sProducts() {

		iphones4s = new ArrayList <>();

		WebElement searchForIphone4s16GB = driver.findElement(iphone4s16GB);
		WebElement searchForIphone4s32GB = driver.findElement(iphone4s32GB);
		WebElement searchForIphone4s64GB = driver.findElement(iphone4s64GB);
		WebElement searchForIphone4s8GB = driver.findElement(iphone4s8GB);

		iphones4s.add(searchForIphone4s16GB);
		iphones4s.add(searchForIphone4s32GB);
		iphones4s.add(searchForIphone4s64GB);
		iphones4s.add(searchForIphone4s8GB);

		return iphones4s;
	}

	public List <WebElement> listOfIphone4sSortedAscendingByPrice() {

		iphones4s = new ArrayList <>();

		WebElement searchForIphone4s16GB = driver.findElement(iphone4s16GB);
		WebElement searchForIphone4s32GB = driver.findElement(iphone4s32GB);
		WebElement searchForIphone4s64GB = driver.findElement(iphone4s64GB);
		WebElement searchForIphone4s8GB = driver.findElement(iphone4s8GB);

		iphones4s.add(searchForIphone4s8GB);
		iphones4s.add(searchForIphone4s16GB);
		iphones4s.add(searchForIphone4s32GB);
		iphones4s.add(searchForIphone4s64GB);

		return iphones4s;
	}

	public void sortByPrice() {
		WebElement DropDownByPriceElement = driver.findElement(dropDownByPrice);
		Select dropDownByPrice = new Select(DropDownByPriceElement);
		dropDownByPrice.selectByVisibleText("Cena");
	}

	public By getIphone4s8GB() {
		return iphone4s8GB;
	}

	public By getIphone4s16GB() {
		return iphone4s16GB;
	}

	public By getIphone4s32GB() {
		return iphone4s32GB;
	}

	public By getIphone4s64GB() {
		return iphone4s64GB;
	}

	public SellIphone4s8GB clickSellButtonOnIphone4s8GB() {
		driver.findElement(buttonThatRedirecsToSellingPage).click();
		return new SellIphone4s8GB(driver);
	}

	public void clickPrintButton() {
		driver.findElement(printButton).click();
	}

	public ExtendedSearch clickButtonWhichRedirectsToExtendedSearch() {
		driver.findElement(extendedSearch).click();
		return new ExtendedSearch(driver);
	}

	public Opinions clickButtonWhichRedirectsToOpinions() {
		driver.findElement(opinions).click();
		return new Opinions(driver);
	}

	public Podlaskie selectPodlaskieProvince() {
		driver.findElement(podlaskieProvince).click();
		return new Podlaskie(driver);
	}

	public KujawskoPomorskie selectKujawskoPomorskieProvince() {
		driver.findElement(kujawskoPomorskieProvince).click();
		return new KujawskoPomorskie(driver);
	}

	public Basket selectBasketDirectlyFromMainPage() {
		driver.findElement(basket).click();
		return new Basket(driver);
	}

	public CertyficateOfUtilization clickCertyficationOfutilizationIcon() {
		driver.findElement(certyficationOfUtilization).click();
		return new CertyficateOfUtilization(driver);
	}

	public InvestInPhoneSellsPageNotImplemented clickInvestInPhoneSells() {
		driver.findElement(investInPhoneSells).click();
		return new InvestInPhoneSellsPageNotImplemented(driver);
	}

	public LoginRejestration clickPartnershipProgram() {
		driver.findElement(partnershipProgram).click();
		return new LoginRejestration(driver);
	}

	public Informations clickInformations() {
		driver.findElement(informations).click();
		return new Informations(driver);
	}

	public AboutUs clickAboutUs() {
		driver.findElement(aboutUs).click();
		return new AboutUs(driver);
	}

	public TrustedUs clickTrustedUs() {
		driver.findElement(trustedUs).click();
		return new TrustedUs(driver);
	}

	public PurchasePhonesFromCompanies clickPurchasePhonesFromCompanies() {
		driver.findElement(purchasePhonesFromCompanies).click();
		return new PurchasePhonesFromCompanies(driver);
	}

	public PurchasePhonesFromPrivatePeople clickPurchasePhonesFromPrivatePeople() {
		driver.findElement(purchasePhonesFromPrivatePeople).click();
		return new PurchasePhonesFromPrivatePeople(driver);
	}

	public PhonesPricing clickPhonespricing() {
		driver.findElement(phonesPricing).click();
		return new PhonesPricing(driver);
	}

	public UtilizationAndRecycling clickUtilizationAndRecycling() {
		driver.findElement(utilizationAndRecyclingOfPhones).click();
		return new UtilizationAndRecycling(driver);
	}

	public LoginRejestration clickPartnershipProgramOnTheBottomOfThePage() {
		driver.findElement(partnershipProgramOnTheBottom).click();
		return new LoginRejestration(driver);
	}

	public Opinions clickOpinionsOnTheBottomOgThePage() {
		driver.findElement(opinionsOnTheBottom).click();
		return new Opinions(driver);
	}

	public InvestInPhonesSales clickInvestOnTheBottomOfThePage() {
		driver.findElement(invest).click();
		return new InvestInPhonesSales(driver);
	}

	public Regulations clickRegulations() {
		driver.findElement(regulations).click();
		return new Regulations(driver);
	}
}
