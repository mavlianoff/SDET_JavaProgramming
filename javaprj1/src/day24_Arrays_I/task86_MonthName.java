package day24_Arrays_I;

import java.util.Scanner;

public class task86_MonthName {

	public static void main(String[] args) {
		/*
		Create an array that holds 12 months names.
		User should be able to enter month index and output should be:
			�The month name is <MonthName>�
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter month index: ");
		int index = scan.nextInt();
		scan.close();
		
		String[] months = new String[12];
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		System.out.println("The month name is " + months[index]);
		
	
	}

}
