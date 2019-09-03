package com.chrisMensing.seleniumFramework.base.Methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface ITestAction {
	Object Execute(WebElement WebElementToUse, Actions ActionToUse);
}
