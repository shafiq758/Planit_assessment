package Test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Functions.createTest;



public class Planit_Test_Execution 
{
  
	createTest field= new createTest();
    

    @Test(priority = 1) 
    public void validatecontactFields() 
    {
    	field.validatecontactform("Shafiq","shafiq@yahoo.com","this is a test");
    	
       
    }
    
    @Test(priority=2)
    
    public void submit_form() throws InterruptedException 
    {
    	for (int i=0;i<5;i++) {
    	field.submitForm("Daniyal"+i, "Daniyal@yahoo.com", "This is a career"+i);
    	
    }
    }
    
    @Test(priority=3)
    public void buy_item()
    {
    	field.Perform_shopping();
    }
    
    @AfterTest
    public void close() 
    {
    	field.close();
    }

}