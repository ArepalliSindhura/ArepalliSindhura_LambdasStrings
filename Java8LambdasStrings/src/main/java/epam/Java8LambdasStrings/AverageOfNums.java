package epam.Java8LambdasStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNums {

	public static void main(String[] args) {
		int sum = 0, num;
		double avg;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements you wish to store in array..");
		int len = sc.nextInt();
		System.out.println("enter the elements you wish to store in the array..");
		for(int i = 0; i < len; i++) {
			System.out.println("enter num " + (i+1));
			al.add(sc.nextInt());
		}
		System.out.println("Average of array is " + AverageOfList(al));
	}

	private static Double AverageOfList(ArrayList<Integer> al) {
		return al.stream().mapToDouble(a -> a).average().getAsDouble();
	}
}
