package project_1;

//TASK 2
//STUDENT GRADE CALCULATOR
//Input: Take marks obtained (out of 100) in each subject.
//Calculate Total Marks: Sum up the marks obtained in all subjects.
//Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
//average percentage.
//Grade Calculation: Assign grades based on the average percentage achieved.
//Display Results: Show the total marks, average percentage, and the corresponding grade to the user

import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter total number of subjects: ");
		int t_subjects=sc.nextInt();
		String s_names[]=new String[t_subjects];
		
		for(int i=0;i<s_names.length;i++) {
			System.out.println("Enter name of subject "+(i+1)+": ");
			s_names[i]=sc.next();
		}
		int marks[]=new int[t_subjects];
		int t_marks=0;
		for(int i=0; i<marks.length; i++) {
			System.out.println("Enter marks of "+s_names[i]+" out of 100: ");
			marks[i]=sc.nextInt();
			t_marks+=marks[i];  //calculating total marks obtained
		}
		float avg_percentage=(float)t_marks/t_subjects ; //calculating average percentage
		
		//ASSIGN GRADES
        String grade;
		if(avg_percentage>90) {
			grade="A+";
		}
		else if(avg_percentage>=81 && avg_percentage<=89) {
			grade="A";
		}
		else if(avg_percentage>=73 && avg_percentage<=80) {
			grade="B+";
		}
		else if(avg_percentage>=65 && avg_percentage<=72) {
			grade="B";
		}
		else if(avg_percentage>=60 && avg_percentage<=64) {
			grade="C+";
		}
		else if(avg_percentage>=55 && avg_percentage<=59) {
			grade="C";
		}
		else if(avg_percentage>=50 && avg_percentage<=54) {
			grade="C-";
		}
		else {
			grade="F";
		}
		//displaying results
		System.out.println("\n !!........RESULTS........!!\n");
		System.out.println("Total marks obtained: "+t_marks);
		System.out.println("Average Percentage: "+avg_percentage);
		System.out.println("Grade: "+grade);
	}

}
