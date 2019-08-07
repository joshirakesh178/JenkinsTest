package TestScript;

public class Test {
	
	public void MirrorTraingle(int length) {
		
		System.out.println("This is a Mirror Triangle");
		System.out.println();
	    for(int j=0;j<length;j++) {
	    	
	        for(int i=j;i<length;i++) {
	        	
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public void Traingle(int length) {
		
		System.out.println("This is a Triangle");
		System.out.println();
	    for(int j=1;j<length+1;j++) {
	    	
	        for(int i=0;i<j;i++) {
	        	
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	 public void EquilateralTriangle(int length) {
		 
		 System.out.println("This is Equilateral Triangle");
		 System.out.println();
		 
		 boolean flag= false;
		 for (int j=0;j<=length;j++) {
				 
				 for(int k=0;k<=j*2;k++) {
					 
					 if(k==0) {
						  flag= true;
					 }
					 else {
						 flag = false;
					 }
					 
					 if(flag) {
					
						 for(int i=j;i<=length;i++) {
							 
							 System.out.print(" ");
						 }
					 }
					 						 
					 System.out.print("*");
					 
				 }
				 System.out.println();
		 }
	 }

	public static void main(String[] args) {
		Test obj = new Test();
		obj.Traingle(6);
		System.out.println();
		System.out.println("#######################");
		System.out.println();
		obj.MirrorTraingle(6);
		System.out.println("#######################");
		System.out.println();
		obj.EquilateralTriangle(6);
		System.out.println("#######################");
		System.out.println();
	}

}
