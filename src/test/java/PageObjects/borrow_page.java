package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class borrow_page {
	
	@FindBy(xpath="(//li[@class='selected']/label)[1]")
	WebElement appli_type;
	
	@FindBy(xpath="//select[@title=\"Number of dependants\"]")
	WebElement no_of_depend;
	
	@FindBy(xpath="(//li[@class='selected'])[2]/label")
	WebElement property;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[1]")
	WebElement your_income;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[2]")
	WebElement your_other_income;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[5]")
	WebElement living_expenses;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[6]")
	WebElement loan_repayment;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[7]")
	WebElement other_loan_payment;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[8]")
	WebElement other_commitments;
	
	@FindBy(xpath="(//div[@class='input__wrapper']/input)[9]")
	WebElement credit_card_limit;
	
	@FindBy(xpath="//button[@id='btnBorrowCalculater']")
	WebElement calculate_borrow_button;
	
	@FindBy(xpath="//button[@class='start-over']")
	WebElement start_over_button;
	
	@FindBy(xpath="//span[@id='borrowResultTextAmount']")
	WebElement borrow_estimation;
	
	@FindBy(xpath="//span[@class='borrow__error__text']")
	WebElement borrow_test;
	
	public borrow_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement return_appli_type()
	{
		return appli_type;
	}
     
	public WebElement return_no_of_depend()
	{
		return no_of_depend;
	}
	
	public WebElement return_property()
	{
		return property;
	}

	public WebElement return_your_income()
	{
		return your_income;
	}

	public WebElement return_your_other_income()
	{
		return your_other_income;
	}

	public WebElement return_living_expenses()
	{
		return living_expenses;
	}

	public WebElement return_loan_repayment()
	{
		return loan_repayment;
	}
	
	public WebElement return_other_loan_payment()
	{
		return other_loan_payment;
	}

	public WebElement return_other_commitments()
	{
		return other_commitments;
	}

	public WebElement return_credit_card_limit()
	{
		return credit_card_limit;
	}

	public WebElement return_calculate_borrow_button()
	{
		return calculate_borrow_button;
	}
	
	public WebElement return_start_over_button()
	{
		return start_over_button;
	}
	
	public WebElement return_borrow_estimation()
	{
		return borrow_estimation;
	}
	
	public WebElement return_borrow_test()
	{
		return borrow_test;
	}
}
