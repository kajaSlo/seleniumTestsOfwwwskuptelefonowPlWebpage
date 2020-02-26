package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagCloud {

	WebDriver driver;

	public TagCloud(WebDriver driver) {
		this.driver = driver;
	}

	By howToSellAPhoneINSkupTelefonowpl = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[1]");
	By novagsm = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[2]");
	By aboutUs = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[3]");
	By offertForGsmShops = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[4]");
	By franchiseOffer = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[5]"); 
	By plus = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[6]");
	By partnershipProgram = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[7]");
	By commissionProgram = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[8]"); 
	By questionsAndAnswers = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[9]");
	By purchaseFromindividuals = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[10]");
	By purchaseFromCompanies = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[13]");
	By Tmobile = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[14]");
	By phonesPricing = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[15]");
	By cellPhonesPricing = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[16]");
	By swappingPhones = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[17]");
	By swappingCellPhones = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[18]");
	By whoTrustedUs = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[19]");
	By Gdynia = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[20]");
	By priceOfPhones = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[21]");
	By contact = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[22]");
	By recyclingAndUtilization = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[23]");
	By regulations = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[24]");
	By purchasePhones = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[25]");
	By purchasePhonesFranchise = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[26]");
	By phones = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[28]");
	By phonesFromOrange = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[29]");
	By termsOfTheContract = By.xpath("/html/body/div/div[5]/div[18]/div/div/a[30]");

	public Search clickHowToSellAPhoneINSkupTelefonowpl() {
		driver.findElement(howToSellAPhoneINSkupTelefonowpl).click();
		return new Search(driver);
	}

	public Search clickNovagsm() {
		driver.findElement(novagsm).click();
		return new Search(driver);
	}

	public Search clickAboutUs() {
		driver.findElement(aboutUs).click();
		return new Search(driver);
	}

	public Search clickOffertForGsmShops() {
		driver.findElement(offertForGsmShops).click();
		return new Search(driver);
	}

	public Search clickFranchiseOffer() {
		driver.findElement(franchiseOffer).click();
		return new Search(driver);
	}

	public Search clickPlus() {
		driver.findElement(plus).click();
		return new Search(driver);
	}

	public Search clickPartnershipProgram() {
		driver.findElement(partnershipProgram).click();
		return new Search(driver);
	}

	public Search clickCommissionProgram() {
		driver.findElement(commissionProgram).click();
		return new Search(driver);
	}

	public Search clickQuestionsAndAnswers() {
		driver.findElement(questionsAndAnswers).click();
		return new Search(driver);
	}

	public Search clickPurchaseFromindividuals() {
		driver.findElement(purchaseFromindividuals).click();
		return new Search(driver);
	}

	public Search clickPurchaseFromCompanies() {
		driver.findElement(purchaseFromCompanies).click();
		return new Search(driver);
	}

	public Search clickTmobile() {
		driver.findElement(Tmobile).click();
		return new Search(driver);
	}

	public Search clickPhonesPricing() {
		driver.findElement(phonesPricing).click();
		return new Search(driver);
	}

	public Search clickCellPhonesPricing() {
		driver.findElement(cellPhonesPricing).click();
		return new Search(driver);
	}

	public Search clickSwappingPhones() {
		driver.findElement(swappingPhones).click();
		return new Search(driver);
	}

	public Search clickSwappingCellPhones() {
		driver.findElement(swappingCellPhones).click();
		return new Search(driver);
	}

	public Search clickWhoTrustedUs() {
		driver.findElement(whoTrustedUs).click();
		return new Search(driver);
	}

	public Search clickGdynia() {
		driver.findElement(Gdynia).click();
		return new Search(driver);
	}

	public Search clickPriceOfPhones() {
		driver.findElement(priceOfPhones).click();
		return new Search(driver);
	}

	public Search clickContact() {
		driver.findElement(contact).click();
		return new Search(driver);
	}

	public Search clickRecyclingAndUtilization() {
		driver.findElement(recyclingAndUtilization).click();
		return new Search(driver);
	}

	public Search clickRegulations() {
		driver.findElement(regulations).click();
		return new Search(driver);
	}

	public Search clickPurchasePhones() {
		driver.findElement(purchasePhones).click();
		return new Search(driver);
	}

	public Search clickPurchasePhonesFranchise() {
		driver.findElement(purchasePhonesFranchise).click();
		return new Search(driver);
	}

	public Search clickPhones() {
		driver.findElement(phones).click();
		return new Search(driver);
	}

	public Search clickPhonesFromOrange() {
		driver.findElement(phonesFromOrange).click();
		return new Search(driver);
	}

	public Search clickTermsOfTheContract() {
		driver.findElement(termsOfTheContract).click();
		return new Search(driver);
	}
}
