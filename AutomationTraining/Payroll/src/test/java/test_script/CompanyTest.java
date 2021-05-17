package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.CompanyPage;
import pages.DashboardPage;
import pages.LoginPage;

public class CompanyTest extends Base {
	@Test(enabled=true)
	public void verifyCompanyPageTitle() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		DashboardPage dashboardpage=loginpage.clickLoginButton();
		CompanyPage companypage=dashboardpage.clickOnCompanyMenu();
		String actualTitle=companypage.getCompanyPageTitle();
		String expectedTitle="Company";
		Assert.assertEquals(actualTitle, expectedTitle,"invalid Title");
	}
	@Test(enabled=true)
	public void verifyCompanyPage() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		DashboardPage dashboardpage=loginpage.clickLoginButton();
		CompanyPage companypage=dashboardpage.clickOnCompanyMenu();
		companypage.enterCompanyName();
		companypage.enterCompanyEmail();
		companypage.enterCompanyEmailAdrress();
		companypage.enterStartedDate();
		companypage.clickStatus();
		companypage.clickSave();
		companypage.clickBranchoption();
		String actualTitle=companypage.getCompanyPageTitle();
		String expectedTitle="Company";
		Assert.assertEquals(actualTitle, expectedTitle,"invalid Title");
	}
	}


