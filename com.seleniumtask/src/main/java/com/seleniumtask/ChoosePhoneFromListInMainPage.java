package com.seleniumtask;

import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChoosePhoneFromListInMainPage {

	WebDriver driver;

	public ChoosePhoneFromListInMainPage(WebDriver driver) {
		this.driver = driver;
	}

	By newProductsInTheBestPrice = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[1]/td[2]");
	By tablets = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[2]/td[2]");
	By alcatelInTablets = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[1]/table/tbody/tr[1]/td[2]");
	By alcatel = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[3]/td[2]");
	By alcatelIdolMiniInAlcatel = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[2]/table/tbody/tr[3]/td[2]");
	By alcatelIdolMini = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By apple = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[4]/td[2]");
	By appleSE = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[3]/table/tbody/tr[10]/td[2]");
	By SE16GB = By.xpath("/html/body/div/div[4]/div/div[3]/div[1]");
	By SE64GB = By.xpath("/html/body/div/div[4]/div/div[3]/div[2]/div");
	By blackberry = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[5]/td[2]");
	By blackberryZ10InBlackberry = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[5]/table/tbody/tr[10]/td[2]");
	By blackberryZ10 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By Htc = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[6]/td[2]");
	By HtcA9InHtc = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[6]/table/tbody/tr[3]/td[2]");
	By HtcA9 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By huawei = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[7]/td[2]");
	By huaweiAscendp6InHuawei = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[7]/table/tbody/tr[6]/td[2]");
	By huaweiAscendp6 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By LG = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[8]/td[2]");
	By LGG5InLG = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[8]/table/tbody/tr[12]/td[2]");
	By LGG5 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By motorolaLenovo = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[9]/td[2]");
	By motoGInMotorolaLenovo = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[9]/table/tbody/tr[1]/td[2]");
	By motoG = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By nokiaMicrosoft = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[10]/td[2]");
	By lumia625InNokiaMicrosoft = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[10]/table/tbody/tr[17]/td[2]");
	By lumia625 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By samsung = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[11]/td[2]");
	By samsungGalaxyJ1InSamsung = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[11]/table/tbody/tr[12]/td[2]");
	By samsungGalaxyJ1 = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");
	By sony = By.xpath("/html/body/div/div[5]/div[1]/div/div/table/tbody/tr[12]/td[2]");
	By sonyXperiaEInSony = By.xpath("/html/body/div/div[5]/div[1]/div/div/div[12]/table/tbody/tr[1]/td[2]");
	By sonyXperiaE = By.xpath("/html/body/div/div[4]/div/div[3]/div/div");

	public MainPage searchForNewProductsInTheBestPrice() {
		driver.findElement(newProductsInTheBestPrice).click();
		return new MainPage(driver);
	}

	public void moveMouse(WebElement element) {
		String mouseOverImplementation = "if(document.createEvent){var mouseover = document.createEvent('MouseEvents');" + "mouseover.initEvent('mouseover', true, false); " + "arguments[0].dispatchEvent(mouseover);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		((JavascriptExecutor) driver).executeScript(mouseOverImplementation, element);
	}

	public AlcatelInTablets searchForAlcatelInTablets() {
		WebElement searchForTablets = driver.findElement(tablets);
		WebElement searchForalcatelInTablets = driver.findElement(alcatelInTablets);
		moveMouse(searchForTablets);
		searchForalcatelInTablets.click();
		return new AlcatelInTablets(driver);
	}

	public AlcatelIdolMiniInAlcatel searchForAlcateIdolMiniInAlcatel() {
		WebElement searchForAlcatel = driver.findElement(alcatel);
		WebElement searchForAlcatelIdolMiniInAlcatel = driver.findElement(alcatelIdolMiniInAlcatel);
		moveMouse(searchForAlcatel);
		searchForAlcatelIdolMiniInAlcatel.click();
		return new AlcatelIdolMiniInAlcatel(driver);
	}

	public IphonesSEInIphones searchForAppleSEInApple() {
		WebElement searchForApple = driver.findElement(apple);
		WebElement searchForAppleSE = driver.findElement(appleSE);
		moveMouse(searchForApple);
		searchForAppleSE.click();
		return new IphonesSEInIphones(driver);
	}

	public BlackberryZ10InBlackberry searchForBackBerryZ10InBlackBerry() {
		WebElement searchForBlackberry = driver.findElement(blackberry);
		WebElement searchForBlackberryZ10InBlackberry = driver.findElement(blackberryZ10InBlackberry);
		moveMouse(searchForBlackberry);
		searchForBlackberryZ10InBlackberry.click();
		return new BlackberryZ10InBlackberry(driver);
	}

	public HtcA9InHtc searchForHtcA9InHtc() {
		WebElement searchForHtc = driver.findElement(Htc);
		WebElement searchForHtcA9InHtx = driver.findElement(HtcA9InHtc);
		moveMouse(searchForHtc);
		searchForHtcA9InHtx.click();
		return new HtcA9InHtc(driver);
	}

	public AscendP6InHuawei searchForAscendP6InHuawei() {
		WebElement searchForHuawei = driver.findElement(huawei);
		WebElement searchForHuaweiAscendP6 = driver.findElement(huaweiAscendp6InHuawei);
		moveMouse(searchForHuawei);
		searchForHuaweiAscendP6.click();
		return new AscendP6InHuawei(driver);
	}

	public LGG5InLG searchForLGG5InLG() {
		WebElement searchForLG = driver.findElement(LG);
		WebElement searchForLGG5InLG = driver.findElement(LGG5InLG);
		moveMouse(searchForLG);
		searchForLGG5InLG.click();
		return new LGG5InLG(driver);
	}

	public MotoGInMotorolaLenovo searchForMotoGInMotorolaLenovo() {
		WebElement searchForMotorolaLenovo = driver.findElement(motorolaLenovo);
		WebElement searchForMotoGInMotorolaLenovo = driver.findElement(motoGInMotorolaLenovo);
		moveMouse(searchForMotorolaLenovo);
		searchForMotoGInMotorolaLenovo.click();
		return new MotoGInMotorolaLenovo(driver);
	}

	public Lumia625InNokiaMicrosoft searchForLumia625InNokiaMicrosoft() {
		WebElement searchForNokiaMicrosoft = driver.findElement(nokiaMicrosoft);
		WebElement searchForLumia625InNokiaMicrosoft = driver.findElement(lumia625InNokiaMicrosoft);
		moveMouse(searchForNokiaMicrosoft);
		searchForLumia625InNokiaMicrosoft.click();
		return new Lumia625InNokiaMicrosoft(driver);
	}

	public GalaxyJ1InSamsung searchForGalaxyJ1InSamsung() {
		WebElement searchForSamsung = driver.findElement(samsung);
		WebElement searchForGalaxyJ1InSamsung = driver.findElement(samsungGalaxyJ1InSamsung);
		moveMouse(searchForSamsung);
		searchForGalaxyJ1InSamsung.click();
		return new GalaxyJ1InSamsung(driver);
	}

	public XperiaEInSony searchForXperiaEInSony() {
		WebElement searchForSony = driver.findElement(sony);
		WebElement searchForSonyXperiaEInSony = driver.findElement(sonyXperiaEInSony);
		moveMouse(searchForSony);
		searchForSonyXperiaEInSony.click();
		return new XperiaEInSony(driver);
	}
}
