package TestScript;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMethod {

	public static void printDuplicateChar(String str) {
		int count =0;
		char[] charString = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : charString) {
			boolean b = Character.isWhitespace(c);
			if (b) {

			} else {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);
				}
			}
		}

		Set<Map.Entry<Character, Integer>> strSet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : strSet) {
			if (entry.getValue() > 1) {

				System.out.println(
						"duplicate char : " + entry.getKey() + " " + "repeted : " + entry.getValue() + " times");

			}
			else {
				
				System.out.println("Non repetive character : "+entry.getKey());
				count ++;
				if(count==1) {
					System.out.println("first non repetive char : "+entry.getKey());
				}
			}
		}
	}
	int a;
	String b;
//	StringMethod(){
//		
//	}
	public void add(double d,double b) {
		System.out.println(d+b);
	}
	public static void main(String[] args) {

//		printDuplicateChar("Rakesh is a bad boyR");
		StringMethod obj = new StringMethod();
		System.out.println(obj.b);
		obj.add(1.3, 2.5);
	}

}
