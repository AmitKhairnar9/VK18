package Com.kite.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.kite.qa.base.test_base;

public class PinPage extends test_base{

	public PinPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
}
