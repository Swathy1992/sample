package samp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	String message = "Hello World";	
	String str1 = new String ("abc");
    String str2 = new String ("abc");
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,messageUtil.printMessage());
	      assertEquals(str1, str2);
	   }
}
