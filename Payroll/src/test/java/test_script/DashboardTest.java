package test_script;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.CompanyPage;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends Base {
	@Test(enabled=false)
	public void verifyPayrollApplicationText() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		DashboardPage dashboardpage=loginpage.clickLoginButton();
		String actualText=dashboardpage.getpayrollapplicationtext();
		String expectedText="PAYROLL APPLICATION";
		assertEquals(actualText, expectedText,"invalid text");
	}
	@Test(enabled=true)
	public void verifyCompanyMenuClick() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		DashboardPage dashboardpage=loginpage.clickLoginButton();
		CompanyPage companypage=dashboardpage.clickOnCompanyMenu();
}
}
