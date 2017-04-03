package samp;

import org.junit.BeforeClass;

public class JUnitAnnotation {
	  //execute before class
	   @BeforeClass
	   public static void beforeClass() {
	      System.out.println("in before class");
	   }
}
