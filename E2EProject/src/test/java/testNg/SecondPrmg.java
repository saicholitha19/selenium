package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SecondPrmg {
  
  @BeforeClass//precondition
  public void beforeClass() {
	  System.out.println("I am @@BeforeClass");
  }

  @AfterClass//postcondition
  public void afterClass() {
	  System.out.println("I am @AfterClass");
  }
  
  @Test
  public void test() {
	  System.out.println("I am @TestF");
  }

}
