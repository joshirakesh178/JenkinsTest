package TestScript;

import java.io.IOException;

public class Exception1 {

	void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
	
	public static void main(String[] args) throws IOException {
		Exception1 m=new Exception1();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	}
}
