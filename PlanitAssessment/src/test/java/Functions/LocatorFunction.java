package Functions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import loadApp.ServerLoader;
import variables.ElementLocators;

public class LocatorFunction 
{

    ServerLoader server = new ServerLoader();
    ElementLocators element = new ElementLocators();
    WebDriver driver;

    String frog_price, bunny_price, bear_price;
    String frog_price_cart, bunny_price_cart, bear_price_cart = " ";

    public LocatorFunction() 
    {
        this.driver = server.launch_app();
    }

    // Clicks the Home button
    public void clickHome() 
    {
        driver.findElement(element.home).click();
    }

    // Clicks the Contact button
    public void clickcontact() 
    {
        driver.findElement(element.contact).click();
    }

    // Enters forename
    public void forename(String name) 
    {
        driver.findElement(element.forename).sendKeys(name);
    }

    // Enters email
    public void email(String name) {
        driver.findElement(element.email).sendKeys(name);
    }

    // Enters message
    public void message(String name) 
    {
        driver.findElement(element.message).sendKeys(name);
    }

    // Waits for given seconds
    public void implicitwait(int wait) 
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
    }

    // Clicks submit
    public void submit() {
        driver.findElement(element.submit).click();
    }

    // Validates forename error label
    public void assert_forename() 
    {
        if (driver.findElement(element.forename_label) != null) {
            String text = driver.findElement(element.forename_label).getText();
            Assert.assertEquals(text, "Forename is required");
        }
    }

    // Validates email error label
    public void assert_email() 
    {
        if (driver.findElement(element.Email_label) != null) {
            String text = driver.findElement(element.Email_label).getText();
            Assert.assertEquals(text, "Email is required");
        }
    }

    // Validates message error label
    public void assert_message() 
    {
        if (driver.findElement(element.Message_label) != null) {
            String text = driver.findElement(element.Message_label).getText();
            Assert.assertEquals(text, "Message is required");
        }
    }

    // Validates forename error removal
    public void forename_error() 
    {
        try {
            boolean forname = driver.findElement(element.forename_label).isDisplayed();
            if (forname) {
                System.out.println("Forename Error still Present");
            }
        } catch (Exception e) {
            System.out.println("Forename Error Removed");
        }
    }

    // Validates email error removal
    public void Email_error() 
    {
        try {
            boolean email = driver.findElement(element.Email_label).isDisplayed();
            if (email) {
                System.out.println("Email Error still Present");
            }
        } catch (Exception e) {
            System.out.println("Email Error Removed");
        }
    }

    // Validates message error removal
    public void Message_error() 
    {
        try {
            boolean message = driver.findElement(element.Message_label).isDisplayed();
            if (message) {
                System.out.println("Message Error still Present");
            }
        } catch (Exception e) {
            System.out.println("Message Error Removed");
        }
    }

    // Verifies success message after form submission
    public void success_message(String forename) 
    {
        String success = driver.findElement(element.success).getText();
        Assert.assertEquals(success, "Thanks " + forename + ", we appreciate your feedback.");
    }

    // Navigates to shop page
    public void shop() 
    {
        driver.findElement(element.shop).click();
    }

    // Selects stuffed frog
    public void stuffed_frog() 
    {
        driver.findElement(element.stuffed).click();
    }

    // Selects fluffy bunny
    public void fluffy_bunny() 
    {
        driver.findElement(element.bunny).click();
    }

    // Selects valentine bear
    public void valentine_bear() 
    {
        driver.findElement(element.bear).click();
    }

    // Navigates to cart
    public void cart() 
    {
        driver.findElement(element.cart).click();
    }

    // Updates frog quantity
    public void add_frog() 
    {
        driver.findElement(element.stuffed_cart).clear();
        driver.findElement(element.stuffed_cart).sendKeys("2");
    }

    // Updates bunny quantity
    public void add_bunny() 
    {
        driver.findElement(element.bunny_cart).clear();
        driver.findElement(element.bunny_cart).sendKeys("5");
    }

    // Updates bear quantity
    public void add_bear() 
    {
        driver.findElement(element.bear_cart).clear();
        driver.findElement(element.bear_cart).sendKeys("3");
    }

    // Gets prices from shop page
    public void getselected_price() 
    {
        frog_price = driver.findElement(element.frog_price).getText();
        bunny_price = driver.findElement(element.bunny_price).getText();
        bear_price = driver.findElement(element.bear_price).getText();
    }

    // Gets prices from cart
    public void getselected_cart_price() 
    {
        frog_price_cart = driver.findElement(element.frog_cart_price).getText();
        bunny_price_cart = driver.findElement(element.bunny_cart_price).getText();
        bear_price_cart = driver.findElement(element.bear_cart_price).getText();
    }

    // Compares shop and cart prices
    public void match_price() 
    {
        Assert.assertEquals(frog_price, frog_price_cart);
        Assert.assertEquals(bunny_price, bunny_price_cart);
        Assert.assertEquals(bear_price, bear_price_cart);
    }

    // Verifies item subtotals and total price
    public void verify_subtotal() 
    {
        double frog = Double.parseDouble(frog_price_cart.replace("$", "")) * 2;
        double bunny = Double.parseDouble(bunny_price_cart.replace("$", "")) * 5;
        double bear = Double.parseDouble(bear_price_cart.replace("$", "")) * 3;

        double frog_sub = Double.parseDouble(driver.findElement(element.sub_frog_cart_price).getText().replace("$", ""));
        double bunny_sub = Double.parseDouble(driver.findElement(element.sub_bunny_cart_price).getText().replace("$", ""));
        double bear_sub = Double.parseDouble(driver.findElement(element.sub_bear_cart_price).getText().replace("$", ""));
        double total = Double.parseDouble(driver.findElement(element.total).getText().replace("Total: ", ""));

        Assert.assertEquals(frog, frog_sub);
        Assert.assertEquals(bunny, bunny_sub);
        Assert.assertEquals(bear, bear_sub);
        Assert.assertEquals(frog + bunny + bear, total);
    }
    
    public void closedriver() 
    {
    	driver.quit();
    }
}
