package com.employee;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
//		Getting user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of employees: ");
		int numOfEmployees = sc.nextInt();
		sc.nextLine();

//		Creating Employee array
		Employee[] employees = new Employee[numOfEmployees];

//		Building each employee
		for (int i = 0; i < employees.length; i++) {
			System.out.println("\n======================================\n");
			System.out.println("\nFor employee number " + String.valueOf(i + 1));

			System.out.println("Enter name of employee: ");
			String name = sc.nextLine();

			System.out.println("Enter grade of employee: U1, U2, U3, U4, P1, P2");
			String grade = sc.nextLine();

//			Setting Employee Attributes from user input
			employees[i] = new Employee();
			employees[i].setEmpId(i + 1);
			employees[i].setEmpName(name);

//			Handle if grade is invalid and retry loop
			try {
				employees[i].setGrade(grade);
			} catch (InvalidGradeException e) {
				e.printStackTrace();

				System.out.println("\nRetry!\n");

				i--;
				continue;
			}

			System.out.println("\nEmployee created - ");
			System.out.println(employees[i]);
		}

//		Reading/Writing from/to a file
		System.out.println("\nWriting to file... ");
		try {
//			Writing
			FileWriter fw = new FileWriter("empdetails.txt");

			for (int i = 0; i < employees.length; i++) {
				fw.write(employees[i].stringifyForFile());
			}

			fw.close();

//			Reading
			System.out.println("\nNow reading from file... \n");
			FileReader fr = new FileReader("empdetails.txt");

			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}

			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nCompleted");
	}

}
