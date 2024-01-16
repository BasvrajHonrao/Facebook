package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	
	public static void selectByVisibleText(WebElement wb,String value)
	{
		new Select(wait.visibilityOfElement(wb)).selectByVisibleText(value);
	}

}
