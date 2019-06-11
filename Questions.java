import java.util.*;
public class Questions {
	
	/*
	 * Write a function, persistence, that takes in a positive 
	 * parameter num and returns its multiplicative persistence, 
	 * which is the number of times you must multiply the digits 
	 * in num until you reach a single digit.
	 */
	public int persistence(int num) {
		//turn the number into an array of digits
		String[] arr = Integer.toString(num).split("");
		int count = 0;
		int product = 1;
		//while there is more than one digit
		while (arr.length > 1) {
			//multiply each digit together
			for(int i=0;i < arr.length;i++) {
				product = product*(Integer.parseInt(arr[i]));
			}
			count++;
			//the product gets split up into digits again
			arr = Integer.toString(product).split("");
			product = 1;
		}
		return count;
	}
	
	/*
	 * function that checks whether a number is prime or not
	 */
	public static boolean isPrime(int n) {
		//number must be greater than 1
		if(n <= 1) {
			return false;
		}
		//check if 2 to n-1 divides evenly
		for(int i = 2; i < n; i++) {
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	//function that counts the number of primes
	public int numberPrimes(int n) {
		int count = 0;
		for(int i = 2; i <=n; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	//function that takes in a string and returns the distance to 
	//the nearest vowel for each character
	public int[] distance(String str) {
		int[] distarr = new int[str.length()];
		//max distance between letters is 26
		int min = 26; 
		int dist;
		for(int i = 0; i < str.length(); i++) {
			//calculate absolute distance between character and 'a'
			dist = Math.abs(str.charAt(i) - 'a');
			//check if distance is lower than the minimum
			if(dist <=min) {
				min = dist;
			}
			dist = Math.abs(str.charAt(i) - 'e');
			if(dist <=min) {
				min = dist;
			}dist = Math.abs(str.charAt(i) - 'i');
			if(dist <=min) {
				min = dist;
			}dist = Math.abs(str.charAt(i) - 'o');
			if(dist <=min) {
				min = dist;
			}dist = Math.abs(str.charAt(i) - 'u');
			if(dist <=min) {
				min = dist;
			}
			//set value in distarr to the min
			distarr[i] = min;
			min = 26;
		}
		return distarr;
	}
	
	//function that takes a string and returns a string with letters
	//in alphabetical order
	public String letterSort(String str) {
		//create array of the characters
		String[] arr = str.split("");
		//sort the array alphabetically
		Arrays.sort(arr);
		//create new string from array
		str = String.join("",arr);
		return str;
	}
}
