package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator extends StudentGrade {
	

	public static void main(String[] args) {
		char ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t***************STUDENT GRADE CALCULATOR *************** ");
		
		do {
		//start the atm processs
		StudentGrade s=new StudentGrade();
		s.marks();

		System.out.println("\nDo you want to do more grade calculate:  Y/N");
		 ans = sc.next().charAt(0); 
		}while(ans == 'y'|| ans =='Y');
		
		System.out.println("Thank You For Coming :) ");

	}
	
}