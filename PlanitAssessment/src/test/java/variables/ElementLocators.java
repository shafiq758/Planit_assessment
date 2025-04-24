package variables;

import org.openqa.selenium.By;

public class ElementLocators 
{
	   //This class consists of all the variables to be used for accessing the application
	
	   public  final By contact= By.xpath("//*[contains(@href,'contact')]");
	   public  final By submit= By.xpath("//*[contains(@class,'btn-contact')]");
	   public  final By forename_label=By.xpath("//*[contains(text(),'Forename is required')]");
	   public  final By Email_label=By.xpath("//*[contains(text(),'Email is required')]");
	   public  final By Message_label=By.xpath("//*[contains(text(),'Message is required')]");
	   public  final By forename=By.id("forename");
	   public  final By email=By.id("email");
	   public  final By message=By.id("message");
	   public  final By home= By.xpath("//*[contains(@href,'home')]");
	   public final By success=By.xpath("//*[contains(@class,'alert')]");
	   public final By shop=By.xpath("//*[contains(@href,'shop')]");
	   public final By stuffed=By.xpath("//*[contains(text(),'Stuffed')]/./parent::*/./child::*/./child::*[contains(@class,'btn btn')]");
	   public final By bunny=By.xpath("//*[contains(text(),'Fluffy')]/./parent::*/./child::*/./child::*[contains(@class,'btn btn')]");
	   public final By bear=By.xpath("//*[contains(text(),'Valentine')]/./parent::*/./child::*/./child::*[contains(@class,'btn btn')]");
	   public final By cart = By.xpath("//a[contains(@href,'cart')]");
	   public final By stuffed_cart=By.xpath("//*[contains(text(),'Frog')]/./parent::*/./descendant::*//input[@type='number']");
	   public final By bunny_cart=By.xpath("//*[contains(text(),'Bunny')]/./parent::*/./descendant::*//input[@type='number']");
	   public final By bear_cart=By.xpath("//*[contains(text(),'Valentine')]/./parent::*/./descendant::*//input[@type='number']");
	   public final By frog_price=By.xpath("//*[contains(text(),'Stuffed')]/./parent::*/./child::*/./child::*[contains(@class,'ng-binding')]");
	   public final By bunny_price=By.xpath("//*[contains(text(),'Bunny')]/./parent::*/./child::*/./child::*[contains(@class,'ng-binding')]");
	   public final By bear_price=By.xpath("//*[contains(text(),'Valentine')]/./parent::*/./child::*/./child::*[contains(@class,'ng-binding')]");
	   public final By frog_cart_price=By.xpath("(//*[contains(text(),'Frog')]/./parent::*/./descendant::*[contains(@class,'ng-bin')])[2]");
	   public final By bunny_cart_price=By.xpath("(//*[contains(text(),'Bunny')]/./parent::*/./descendant::*[contains(@class,'ng-bin')])[2]");
	   public final By bear_cart_price=By.xpath("(//*[contains(text(),'Valentine')]/./parent::*/./descendant::*[contains(@class,'ng-bin')])[2]");
	   public final By sub_frog_cart_price=By.xpath("(//*[contains(text(),'Frog')]/./parent::*/./descendant::*[contains(@class,'ng-bin')])[3]");
	   public final By sub_bunny_cart_price=By.xpath("(//*[contains(text(),'Bunny')]/./parent::*/./descendant::*[contains(@class,'ng-bin')])[3]");
	   public final By sub_bear_cart_price=By.xpath("(//*[contains(text(),'Valentine')]/./parent::*/./descendant::*[contains(@class,'ng-bin')])[3]");
	   public final By total=By.xpath("//*[contains(@class,'total')]");




}
