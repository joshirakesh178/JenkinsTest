package TestScript;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Programs {
	
	public void checkArmastrongNumber(int n) {
		
		int num =n;
		int rem =0,sum=0;
		
		while (num>0) {
			rem= num %10;
			num= num/10;
			sum= sum+(rem*rem*rem);
		}
		if(sum==n) {
			System.out.println("numbers is armastrong number ");
		}
		else {
			System.out.println("numbers is not armastrong number ");
		}
	}
	
	public void factorial(int n) {
		int fact =1;
		for(int i=n;i>0;i--) {
			fact= fact*i;
		}
		System.out.println("factorial is "+fact);
	}
	public void reverseStringWithBuffer(String str) {
		
		String reverse= "";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		String s = new String (str);
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reverse = reverse+ str.charAt(i);
		}
		
		System.out.println(reverse);
	}
	
	public void printRepetitiveChar(String str) {
		int count;
		HashMap <Character,Integer> map = new HashMap <>();
		for(int i=0;i<str.length()-1;i++) {
			
			for(int j=i+1;j<str.length();j++) {
				count =0;
				if(str.charAt(i)==str.charAt(j)) {
//					System.out.println(str.charAt(i));
					map.put(str.charAt(i), count+1);
					
					if(map.get(str.charAt(i))>0) {
						map.put(str.charAt(i), count+1);
					}
					
				}
			}
		}
		
		for(Map.Entry<Character, Integer> entery :  map.entrySet()) {
			
			if(entery.getValue()>0 && !entery.getValue().equals(" ")) {
				System.out.println(entery.getKey());
			}
		}
	}
	
	public void Anagram(String str1,String str2) {
		boolean flag= false;
		if(str1.length()==str2.length()) {
			flag =true;
		}
		
		if(flag) {
			
			for(int i=0;i<str1.length();i++) {
				
				for(int j=0;j<str2.length();j++) {
					
					if(str1.toUpperCase().charAt(i)==str2.toUpperCase().charAt(j)) {
						
						flag =false;
						
					}
				}
				
				if(flag) {
					System.out.println("String are not Anagram");
				}
			}
			
			if(flag) {
				System.out.println("String are not Anagrams");
			}
			if(flag==false) {
				System.out.println("String are Anagrams");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Programs obj = new Programs();
//		obj.checkArmastrongNumber(154);
//		obj.factorial(5);
//		obj.reverseStringWithBuffer("RAKESH");
		obj.Anagram("ARMY","mry");
	}

}
