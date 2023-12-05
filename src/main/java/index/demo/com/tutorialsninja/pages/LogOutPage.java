package index.demo.com.tutorialsninja.pages;

import index.demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {
    By logoutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    public String getTextFromLogout() {
        return getTextFromElement(logoutText);
    }
}
