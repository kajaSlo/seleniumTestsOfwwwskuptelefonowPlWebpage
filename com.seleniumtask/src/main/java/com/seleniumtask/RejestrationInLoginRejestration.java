package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RejestrationInLoginRejestration {

	WebDriver driver;

	public RejestrationInLoginRejestration(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[1]/td[2]/input");
	By password = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[2]/td[2]/input");
	By confirmPassword = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[3]/td[2]/input");
	By email = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[4]/td[2]/input");
	By confirmEmail = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[5]/td[2]/input");
	By phoneNumber = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[6]/td[2]/input");
	By name = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[7]/td[2]/input");
	By surname = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[8]/td[2]/input");
	By province = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[9]/td[2]/select");
	By postalCode = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[10]/td[2]/input");
	By town = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[11]/td[2]/input");
	By street = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[12]/td[2]/input");
	By houseNumber = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[13]/td[2]/input");
	By apartmentNumber = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[14]/td[2]/input");
	By bankName = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[15]/td[2]/input");
	By bankNumber = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[16]/td[2]/input");
	By acceptanceOfTheRegulations = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[17]/td[1]/input");
	By acceptanceOfProcessingPersonalData = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[18]/td[1]/input");
	By rejestrationButton = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[19]/td/input");
	By selectprovince = By.xpath("/html/body/center/b/div[1]/table/tbody/tr[9]/td[2]/select");

	public void fillInLogin(String loginName) {
		driver.findElement(login).sendKeys(loginName);
	}

	public void fillInPassword(String loginPassword) {
		driver.findElement(password).sendKeys(loginPassword);
	}

	public void fillInConfirmPassword(String loginConfirmPassword) {
		driver.findElement(confirmPassword).sendKeys(loginConfirmPassword);
	}

	public void fillInEmail(String loginemail) {
		driver.findElement(email).sendKeys(loginemail);
	}

	public void fillInConfirmEmail(String loginConfirmEmail) {
		driver.findElement(confirmEmail).sendKeys(loginConfirmEmail);
	}

	public void fillInPhoneNumber(String loginPhoneNumber) {
		driver.findElement(phoneNumber).sendKeys(loginPhoneNumber);
	}

	public void fillInName(String loginName) {
		driver.findElement(name).sendKeys(loginName);
	}

	public void fillInSurname(String loginSurname) {
		driver.findElement(surname).sendKeys(loginSurname);
	}

	public void selectProvince() {
		Select province = new Select(driver.findElement(selectprovince));
		province.selectByVisibleText("opolskie");
	}

	public void fillInPostalCode(String loginPostalCode) {
		driver.findElement(postalCode).sendKeys(loginPostalCode);
	}

	public void fillInTown(String loginTown) {
		driver.findElement(town).sendKeys(loginTown);
	}

	public void fillInStreet(String loginStreet) {
		driver.findElement(street).sendKeys(loginStreet);
	}

	public void fillInHouseNumber(String loginHouseNumber) {
		driver.findElement(houseNumber).sendKeys(loginHouseNumber);
	}

	public void fillInApartmentNumber(String loginApartmentNumber) {
		driver.findElement(apartmentNumber).sendKeys(loginApartmentNumber);
	}

	public void fillInBankName(String loginBankName) {
		driver.findElement(bankName).sendKeys(loginBankName);
	}

	public void fillInBankNumber(String loginBankNumber) {
		driver.findElement(bankNumber).sendKeys(loginBankNumber);
	}

	public void clickAcceptanceOfTheRegulations() {
		driver.findElement(acceptanceOfTheRegulations).click();
	}

	public void clickacceptanceOfProcessingPersonalData() {
		driver.findElement(acceptanceOfProcessingPersonalData).click();
	}

	public void clickrejestrationButton() {
		driver.findElement(rejestrationButton).click();
	}
}
