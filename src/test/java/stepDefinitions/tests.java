package stepDefinitions;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.borrow_page;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.browserlaunch;

public class tests extends browserlaunch {
	WebDriver driver;
	Properties prop;
	utilities.util_file file;
	borrow_page pom;

	@Before
	public void setup() throws IOException {
		file = new utilities.util_file();
		prop = file.propfile();
		pom = new borrow_page(driver);
	}

	@Given("User Launch Browser")
	public void user_launch_browser() throws IOException {
		driver = launchBrowser();

	}

	@Given("user navigate to {string}")
	public void user_navigate_to(String string) {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Application type is Single")
	public void application_type_is_single() throws InterruptedException {
		Thread.sleep(2000);
		pom.return_appli_type().click();

	}

	@When("No.of.dependants is {int}")
	public void no_of_dependants_is(Integer int1) {
		Select s = new Select(pom.return_no_of_depend());
		s.selectByVisibleText("0");
	}

	@When("select buying option as home to live in,")
	public void select_buying_option_as_home_to_live_in() {
		pom.return_property().click();
	}

	@When("Enter income as ${double}")
	public void enter_income_as_$(Double double1) {
		pom.return_your_income().sendKeys(prop.getProperty("income"));
	}

	@When("Enter other income as ${double}")
	public void enter_other_income_as_$(Double double1) {
		pom.return_your_other_income().sendKeys(prop.getProperty("othericome"));
	}

	@When("Enter iving expenses ${int}")
	public void enter_iving_expenses_$(Integer int1) {
		pom.return_living_expenses().sendKeys(prop.getProperty("livingexpenses"));
	}

	@When("Enter current home loan repayments  as ${int}")
	public void enter_current_home_loan_repayments_as_$(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter other loan repayments as ${int}")
	public void enter_other_loan_repayments_as_$(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter other commitments as ${int}")
	public void enter_other_commitments_as_$(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter total credit card limits as ${double}")
	public void enter_total_credit_card_limits_as_$(Double double1) {
		pom.return_loan_repayment().sendKeys(prop.getProperty("hloanrepay"));
	}

	@Then("click on Work out how much I could borrow button")
	public void click_on_work_out_how_much_i_could_borrow_button() {
		pom.return_other_loan_payment().sendKeys("oloanrepay");
	}

	@Then("validate borrowing estimate is ${double}.")
	public void validate_borrowing_estimate_is_$(Double double1) {
		String value = pom.return_calculate_borrow_button().getText();
		if (value.equals(prop.getProperty("estimate")))
			System.out.println("estimation is correct");
		else
			System.out.println("Estimation is not proper please check the application");
	}

	@Given("user is in much-borrow page")
	public void user_is_in_much_borrow_page() {
		String url = driver.getCurrentUrl();
		if (url.equals(prop.getProperty("url"))) {
			System.out.println("url matches");
		}

		else {
			System.out.println("please navigate to proper url");
			driver.get(prop.getProperty("url"));
		}
	}

	@Then("Click on Startover")
	public void click_on_startover() {
		pom.return_start_over_button().click();
	}

	@Given("User is on much-borrow page")
	public void user_is_on_much_borrow_page() {
		String url = driver.getCurrentUrl();
		if (url.equals(prop.getProperty("url"))) {
			System.out.println("url matches");
		}

		else {
			System.out.println("please navigate to proper url");
			driver.get(prop.getProperty("url"));
		}
	}

	@Given("Enter Living Expenses as {int}")
	public void enter_living_expenses_as(Integer int1) {
		pom.return_living_expenses().sendKeys("0");
		pom.return_calculate_borrow_button().click();
	}

	@Then("validate the message")
	public void validate_the_message() {
		String message=pom.return_borrow_test().getText();
		if(message.equals(prop.getProperty("text")))
			System.out.println("Proper message");
		else
			System.out.println("check the message");
	}

}
