package epam.Java8LambdasStrings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfPalindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		System.out.println("enter the number of strings you wish to store..");
		int len = sc.nextInt();
		System.out.println("enter the strings");
		for(int i = 0; i < len; i++) {
			al.add(sc.next());
		}
		ans = palindromeList(al);
		System.out.println("The palindrome strings are ");
		System.out.println(ans);
	}
 
	private static ArrayList<String> palindromeList(ArrayList<String> al) {
		return (ArrayList<String>) al.stream().filter(str -> str.equals(ReverseString(str))).collect(Collectors.toList());
	}

	public static String ReverseString(String str) {
		String s = "";
		for(int i = str.length()-1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}
}
