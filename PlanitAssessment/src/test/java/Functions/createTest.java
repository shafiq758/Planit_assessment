package Functions;

public class createTest {

    LocatorFunction locator = new LocatorFunction();

    // Combines functions to be used in Testcase_1
    public void validatecontactform(String name, String email, String message) 
    {
        locator.clickcontact();             // Navigate to contact form
        locator.implicitwait(2);            // Wait for page to load
        locator.submit();                   // Click submit
        locator.assert_forename();          // Validate forename error
        locator.assert_email();             // Validate email error
        locator.assert_message();           // Validate message error

        locator.implicitwait(10);
        locator.forename(name);             // Enter forename
        locator.forename_error();           // Validate forename error cleared
        locator.email(email);               // Enter email
        locator.Email_error();              // Validate email error cleared
        locator.message(message);           // Enter message
        locator.Message_error();            // Validate message error cleared
    }

    // Combines functions to be used for Testcase_2
    public void submitForm(String name, String email, String message) throws InterruptedException 
    {
        locator.clickHome();                // Navigate to Home
        locator.clickcontact();             // Navigate to contact form
        // locator.implicitwait(2);         // Wait for page to load
        locator.forename(name);             // Enter forename
        locator.email(email);               // Enter email
        locator.message(message);           // Enter message
        locator.submit();                   // Click submit
        Thread.sleep(13000);                // Wait for page to load

        locator.success_message(name);      // Validate success message
    }

    // Combines functions to be used for Testcase_3
    public void Perform_shopping() 
    {
        locator.shop();                     // Navigate to Shop Page
        locator.getselected_price();        // Check and store price for selected items
        locator.stuffed_frog();             // Add stuffed Frog
        locator.fluffy_bunny();             // Add Bunny
        locator.valentine_bear();           // Add Valentine Bear
        locator.cart();                     // Go to Cart
        locator.getselected_cart_price();   // Check and store cart prices for selected items
        locator.add_frog();                 // Add quantity as per requirement
        locator.add_bunny();                // Add quantity as per requirement
        locator.add_bear();                 // Add quantity as per requirement
        locator.match_price();              // Match prices shown on shop and cart page
        locator.verify_subtotal();          // Verify calculated subtotal and total price
    }
    
    // calls when we need to close the browser
    
    public void close() 
    {
    	locator.closedriver();
    }
}
