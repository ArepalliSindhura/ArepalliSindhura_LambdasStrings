package epam.Java8LambdasStrings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringsWithLetterA {

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
		ans = StringList(al);
		System.out.println("The strings are ");
		ans.forEach(x -> System.out.println(x));
	}

	private static ArrayList<String> StringList(ArrayList<String> al) {
		return (ArrayList<String>) al.stream().filter(str -> str.length() == 3).filter(str -> str.startsWith("a")).collect(Collectors.toList());
	}

}
