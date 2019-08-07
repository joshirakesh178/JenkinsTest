package TestScript;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Array<character, integer> {

	public int findMissingNumber() {

		int arr[] = { 1, 2, 3, 4, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}

		System.out.println(sum);
		int expectedSum = 6 * (6 + 1) / 2;
		System.out.println(expectedSum);
		int missingNumber = expectedSum - sum;
		System.out.println(missingNumber);
		return missingNumber;

	}

	public void checkNumberPresent(int arr[], int num) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				flag = false;
				System.out.println("no is present");
			}

		}

		if (flag == true) {
			System.out.println("no is not present");
		}
	}

	public void findMinMaxNumber(int[] arr) {

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min < arr[i]) {

			} else {
				min = arr[i];
			}

			if (max > arr[i]) {

			} else {
				max = arr[i];
			}
		}

		System.out.println(min);
		System.out.println(max);
	}

	public void findPairGreaterThenGivenNumber(int arr[], int num) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				// System.out.print("i is "+arr[i]);
				// System.out.println(" j is "+arr[j]);
				if (arr[i] + arr[j] > num) {

					System.out.println("no are" + arr[i] + "and " + arr[j]);
				}
			}
		}
	}

	public void findRepetivChar(String str) {

		int i, j;
		int count;
		char arr[] = str.toCharArray();
		char arr1[] = null;
		System.out.println("No Repeated Elements are :");
		for (i = 0; i < str.length(); i++) {
			count = 0;
			for (j = i + 1; j < str.length(); j++) {
				if (arr[i] != arr[j]) {
					// System.out.print(arr[i] + " ");

				} else {
					count++;
				}
			}

			if (count == 0) {
				System.out.print(arr[i] + " ");
			}

		}
	}

	static void firstNonRepeating(int arr[], int n) {
		boolean flag = true;
		int i;
		for (i = 0; i < n; i++) {
			int j;
			for (j = 0; j < n; j++)
				if (i != j && arr[i] == arr[j]) {

					flag = false;
				}

		}
		if (flag == true) {

			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 2, 5, 3, 2, 1 };
		Array obj = new Array();
		// obj.findMissingNumber();
		// obj.checkNumberPresent(input,9);
		// obj.findMinMaxNumber(input);

		// obj.findPairGreaterThenGivenNumber(input, 6);
		// obj.findRepetivChar("AAABHHBYUTYU");
		int arr[] = { 9, 4, 9, 6, 7, 4 }; 
        int n = arr.length; 
  
        obj.firstNonRepeating(arr,n);
	
	}

}
