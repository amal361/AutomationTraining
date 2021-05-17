package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div//h1")
	WebElement payrollApplicationText;
	@FindBy(xpath = "//a[text()='Company']")
	WebElement clickCompanyMenu;
	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clickClientMenu;
	@FindBy(xpath = "//a[text()='Workers']")
	WebElement clickWorkerMenu;

	public String getpayrollapplicationtext() throws InterruptedException {
		Thread.sleep(2000);
		String text = payrollApplicationText.getText();
		return text;
	}

	public CompanyPage clickOnCompanyMenu() throws InterruptedException {
		Thread.sleep(2000);
		clickCompanyMenu.click();
		return new CompanyPage(driver);
	}

	public ClientPage clickOnClientMenu() throws InterruptedException {
		Thread.sleep(2000);
		clickClientMenu.click();
		return new ClientPage(driver);
	}

	public WorkerPage ClickOnWorkerMenu() throws InterruptedException {
		Thread.sleep(2000);
		clickWorkerMenu.click();
		return new WorkerPage(driver);
	}
}

