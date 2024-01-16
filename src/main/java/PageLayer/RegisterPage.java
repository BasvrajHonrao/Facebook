package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	@FindBy(name="reg_email__")
	private WebElement email;
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	@FindBy(name="birthday_day")
	private WebElement day;
	@FindBy(name="birthday_month")
	private WebElement month;
	@FindBy(name="birthday_year")
	private WebElement year;
	@FindBys(@FindBy(name="//label[@class='_58mt']"))
	private List<WebElement> ls;
	
	public RegisterPage()
	{
	PageFactory.initElements(driver, this);	
	}
}

