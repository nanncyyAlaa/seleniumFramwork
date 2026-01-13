package App;

import org.openqa.selenium.By;
import utiles.*;

public class App {

     public static final String URL = "https://the-internet.herokuapp.com/login";
    //public static final String URL = "https://the-internet.herokuapp.com/drag_and_drop";

    public static void main(String[] args) {

        String UserName = "tomsmith";
        String Password = "SuperSecretPassword!";

        By USERNAME_LOCATOR = By.id("username");
        By PASSWORD_LOCATOR = By.id("password");
        By BUTTON_LOCATOR = By.cssSelector(".radius > i");
        By SUCCESS_LOGIN_TAG_LOCATOR = By.cssSelector(".flash");

        By SOURCE_DRAG_LOCATOR = By.xpath("/html/body/div[2]/div/div/div/div[1]");
        By TARGET_DROP_LOCATOR = By.xpath("/html/body/div[2]/div/div/div/div[2]");

        // Initialize driver
        DriverManager driverManager = new DriverManager();
        driverManager.initializeBrowser();
        driverManager.implicitWait(5);

        // Utilities
        BrowserUtils browser = new BrowserUtils();
        ElementUtils element = new ElementUtils();
        waitUtils wait = new waitUtils();

        // Navigate
        browser.navigateToURL(URL);

        // Drag and Drop
       // element.dragAndDrop(SOURCE_DRAG_LOCATOR, TARGET_DROP_LOCATOR);


        // ---------- LOGIN EXAMPLE ----------
        browser.navigateToURL("https://the-internet.herokuapp.com/login");

        element.sendKeys(USERNAME_LOCATOR, UserName);
        wait.explicitWait(PASSWORD_LOCATOR, 10);
        element.sendKeys(PASSWORD_LOCATOR, Password);
        wait.explicitWait(BUTTON_LOCATOR, 10);
        element.click(BUTTON_LOCATOR);
        wait.explicitWait(SUCCESS_LOGIN_TAG_LOCATOR, 10);
        System.out.println(element.getText(SUCCESS_LOGIN_TAG_LOCATOR));


        // Close browser
        driverManager.closeBrowser();
    }
}
