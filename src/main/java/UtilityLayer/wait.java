package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class wait extends BaseClass{
	
	public static WebElement visibilityOfElement(WebElement wb)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		
	}

	public static List<WebElement> visibilityOfAllElement(List<WebElement> ls)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(ls));
		
	}
public static void sendKeys(WebElement wb,String value)
{
	visibilityOfElement(wb).sendKeys(value);
}
public static void click(WebElement wb)
{
	visibilityOfElement(wb).click();
}
public static void selectCheckbox(List<WebElement> ls,String value)
{
	for(WebElement abc:ls)
	{
		if (abc.getText().equalsIgnoreCase(value));
		abc.click();
	}
}

}
