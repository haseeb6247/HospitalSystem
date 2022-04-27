package com.usc.booking;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		int studId;
		String studName;
		String studAddress;
		String studPhoneNumber;
		String lessonBooked;
		String bookingStatus;
		int rating;
		String t;

		int count = 0;
		char otherchoice = 'Y';

		Student s[] = new Student[10];
		TimeTable tt = new TimeTable();

		while (otherchoice == 'Y') {
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("           Welcome to The University Sports Centre (USC)");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1: TT Chart of lesoon offered");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("2: Book Appointment");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("3: Change Booking");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("4: Rate Lesson");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("5: Print Report");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("6: Exist Application");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("                  Please Feel Free to Choice the Service's");
			System.out.println("******************************************************************************");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("*****View TimeTable By Day/Excerise*****");
				t = scanner.next();
				if (t.equalsIgnoreCase("Day")) {
					tt.displayTimeTableByDay();
				} else {
					tt.displayTimeTableByExercise();
				}
				break;

			case 2:
				System.out.println("*****Book Appointment*****");
				System.out.println("Student Id");
				studId = scanner.nextInt();
				System.out.println("Student Name");
				studName = scanner.next();
				System.out.println("Student address");
				studAddress = scanner.next();
				System.out.println("Student phone number");
				studPhoneNumber = scanner.next();
				System.out.println("Lesson booked");
				lessonBooked = scanner.next();
				System.out.println("Booking status");
				bookingStatus = scanner.next();
				System.out.println("Rating the exercise");
				rating = scanner.nextInt();

				s[count] = new Student(studId, studName, studAddress, studPhoneNumber, lessonBooked, bookingStatus,
						rating);
				count++;
				System.out.println("Appointment Booked Successfully..!!");
				break;

			case 3:
				System.out.println("*****Change Appointment Booking*****");
				System.out.println("Do you want to 'CANCEL' OR 'REBOOK' the Appointment");
				System.out.println("Student Id");
				studId = scanner.nextInt();
				for (int i = 0; i < count; i++) {
					if (s[i] != null && s[i].getStudId() == studId) {
						System.out.println("Booking status");
						bookingStatus = scanner.next();
						if (bookingStatus.equals("CANCEL"))
							System.out.println("Appointment is Cancelled Successfully..!!");
						else
							System.out.println("Lesson Booking");
						lessonBooked = scanner.next();
						System.out.println("Appointment is Rescheduled Successfully..!!");
						s[i].setBookingStatus(bookingStatus);
						s[i].setLessonBooked(lessonBooked);
					}
				}
				break;

			case 4:
				System.out.println("*****Rate Lesson*****");
				System.out.println("Student Id");
				studId = scanner.nextInt();
				for (int i = 0; i < count; i++) {
					if (s[i] != null && s[i].getStudId() == studId) {
						System.out.println(
								"Please rate lesson in ranging from 1 to 5 (1: Very dissatisfied, 2: Dissatisfied, 3: Ok, 4: Satisfied, 5: Very Satisfied).");
						rating = scanner.nextInt();
						System.out.println("Thank you for rating the lesson..!!");
						s[i].setRating(rating);
					}
				}
				break;

			case 5:
				System.out.println("*****Report*****");
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %14s %15s %9s %10s", "Student Id", "Student Name", "Student Addr",
						"Phone Number", "Lesson", "Rating");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (int i = 0; i < count; i++) {

					System.out.format("%5s %12s %15s %16s %12s %9s", s[i].getStudId(), s[i].getStudName(),
							s[i].getStudAddress(), s[i].getStudPhoneNumber(), s[i].getLessonBooked(), s[i].getRating());
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");
				break;

			case 6:
				System.out.println("Thank you for using The University Sports Centre (USC) Application...!!!");
				break;

			default:
				System.out.println("Sorry...!! You enter a worng choice...!!");
				System.out.println("Thank You...!! Please try again...!!");
				break;

			}
			System.out.println("Do you like to continue...!!");
			otherchoice = scanner.next().charAt(0);
			if (Character.isLowerCase(otherchoice)) {
				otherchoice = Character.toUpperCase(otherchoice);
			}

		}
	}
}
