package TestScript;

public class Delete1 {

	public void method2() {
		
		System.out.println("delete1");
	}
	

}

class Delete2 extends Delete1{
	
	public void method1() {
		System.out.println("delete2");
	}
	
public static void main(String[] args) {
		
		Delete1 obj = new Delete1();
		Delete2 obj1= new Delete2();
		
		Delete1 obj2 = new Delete2();
//		Delete2 obj3= new Delete1()
		
		obj.method2();
//		obj.method1();
		
		obj1.method1();
		obj1.method2();
		
		obj2.method2();
//		 obj2.method1();
	}
	
}