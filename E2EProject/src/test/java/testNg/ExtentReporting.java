package testNg;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporting {

	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startreport() {

		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReports.html", true);

		extent.addSystemInfo("Environment", "Environment Name").
		addSystemInfo("Host Name", "Sai cholitha")
		.addSystemInfo("Environment", "Automation Testing")
		.addSystemInfo("User Name","sai cholitha");
		
		//ExtentReports(String filePath,Boolean replaceExisting) 
		//filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
		//replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
		//True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
		//False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
		
		
		
		
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}      
        @Test
    	public void demoReportpass(){
    		test =extent.startTest("AlertSBI.java");
    		//TestCaseName – Name of the test
    		//Description – Description of the test
    		//Starting test
    		test = extent.startTest("passTest");
    		Assert.assertTrue(true);
    		//To generate the log when the test case is passed
    		test.log(LogStatus.PASS, "Test Case Passed is passTest");
        }   		
    	/*	@Test
    		public void failTest(){
    			test = extent.startTest("failTest");
    			Assert.assertTrue(false);
    			test.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
    		}*/
    		
    		/*@Test
    		public void skipTest(){
    			test = extent.startTest("skipTest");
    			throw new SkipException("Skipping - This is not ready for testing ");
    		}*/
    		
    		@AfterMethod
    		public void getResult(ITestResult result){
    			if(result.getStatus() == ITestResult.FAILURE){
    				test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
    				test.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
    			}else if(result.getStatus() == ITestResult.SKIP){
    				test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
    			}
    			// ending test
    			//endTest(logger) : It ends the current test and prepares to create HTML report
    			extent.endTest(test);
    		}
    		@AfterTest
    		public void endReport(){
    			// writing everything to document
    			//flush() - to write or update test information to your report. 
    	                //extent.flush();
    	                //Call close() at the very end of your session to clear all resources. 
    	                //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
    	                //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
    	                //Once this method is called, calling any Extent method will throw an error.
    	                //close() - To close all the operation
    	               extent.close();  
    	            
    	                
    	                
    	    }
    
    
}
    		
       