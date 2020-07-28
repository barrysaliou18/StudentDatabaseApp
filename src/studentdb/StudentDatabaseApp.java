package studentdb;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new student
		System.out.println("Enter of number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		Student[] students = new Student[numberOfStudents];
		
		
		// Create n number of new students
		for(int n = 0; n < numberOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for(int n = 0; n < numberOfStudents; n++) {
		System.out.println(students[0].toString());
		}
	}

}
