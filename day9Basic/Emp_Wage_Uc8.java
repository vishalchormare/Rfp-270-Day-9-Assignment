package day9Basic;

import java.util.Scanner;

public class Emp_Wage_Uc8 {
	public static int day = 20, Hours = 100, Wage_per_Hour = 20, Full_Day_Hour = 8, Part_Time_Hour = 8, Total_Wage = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Employee Wage Computation");
		String companyName = in.nextLine();

		employeeWage(companyName);

	}

	public static void employeeWage(String companyName) {
		int status;
		while (day != 0 && Hours != 0) {
			status = (int) (Math.random() % 3);// status of the employee
			switch (status) {
			case 0: {
				System.out.println("Employee is absent");
			}
			case 1: {
				System.out.println("Part time Hour");
				Total_Wage = Wage_per_Hour * Part_Time_Hour;
			}
			default: {
				Total_Wage = Wage_per_Hour * Full_Day_Hour;
				System.out.println("Employee is present");
				System.out.println(Total_Wage);
			}
			}
			day--;
			Hours--;
		}
		System.out.println(companyName + " " + Total_Wage);
	}

}
