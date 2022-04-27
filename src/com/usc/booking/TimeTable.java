package com.usc.booking;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeTable {

	Scanner input = new Scanner(System.in);

	public void displayTimeTableByDay() {

		ArrayList<String> timeTableByDay = new ArrayList<>();
		timeTableByDay.add("Saturday");
		timeTableByDay.add("Sunday");

		System.out.println("Please enter Saturday or Sunday");
		String day = input.next();
		if (!timeTableByDay.contains(day)) {
			System.out.println("Invalid day, Please try again");
		} else {
			if (day.equalsIgnoreCase("Saturday")) {
				String data[][] = { { "Saturday", "05-03-2022", "8.30am", "Yoga", "$8" },
						{ "Saturday", "05-03-2022", "4.30pm", "Aquacise", "$20" },
						{ "Saturday", "05-03-2022", "7pm", "Box Fit", "$18" },
						{ "Saturday", "12-03-2022", "8.30am", "Yoga", "$8" },
						{ "Saturday", "12-03-2022", "4.30pm", "Aquacise", "$20" },
						{ "Saturday", "12-03-2022", "7pm", "Box Fit", "$18" }

				};
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");
			} else {
				String data[][] = { { "Sunday", "06-03-2022", "7.30am", "Yoga", "$8" },
						{ "Sunday", "06-03-2022", "4.30pm", "Body Blitz", "$15" },
						{ "Sunday", "06-03-2022", "7.30pm", "Zumba", "$16" },
						{ "Sunday", "13-03-2022", "7.30am", "Yoga", "$8" },
						{ "Sunday", "13-03-2022", "4.30pm", "Zumba", "$16" },
						{ "Sunday", "13-03-2022", "7.30pm", "Body Blitz", "$15" }

				};
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");

			}
		}
	}

	public void displayTimeTableByExercise() {

		ArrayList<String> timeTableByExercise = new ArrayList<>();
		timeTableByExercise.add("Yoga");
		timeTableByExercise.add("Zumba");
		timeTableByExercise.add("Aquacise");
		timeTableByExercise.add("Box Fit");
		timeTableByExercise.add("Body Blitz");
		System.out.println("Please enter Select the following Exercise");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println(":::: Yoga, Zumba, Aquacise, Box Fit, Body Blitz ::::");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		String exercise = input.next();
		if (!timeTableByExercise.contains(exercise)) {
			System.out.println("Invalid day, Please try again");
		} else {

			if (exercise.equalsIgnoreCase("Yoga")) {

				String data[][] = { { "Saturday", "05-03-2022", "8.30am", "Yoga", "$8" },
						{ "Sunday", "06-03-2022", "7.30am", "Yoga", "$8" },
						{ "Saturday", "12-03-2022", "8.30am", "Yoga", "$8" },
						{ "Sunday", "13-03-2022", "7.30am", "Yoga", "$8" } };
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");

			} else if (exercise.equalsIgnoreCase("Zumba")) {

				String data[][] = { { "Sunday", "06-03-2022", "7.30pm", "Zumba", "$16" },
						{ "Sunday", "13-03-2022", "4.30pm", "Zumba", "$16" } };
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");

			} else if (exercise.equalsIgnoreCase("Aquacise")) {

				String data[][] = { { "Saturday", "05-03-2022", "4.30pm", "Aquacise", "$20" },
						{ "Saturday", "12-03-2022", "4.30pm", "Aquacise", "$20" } };
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");

			} else if (exercise.equalsIgnoreCase("Box Fit")) {

				String data[][] = { { "Saturday", "05-03-2022", "7pm", "Box Fit", "$18" },
						{ "Saturday", "12-03-2022", "7pm", "Box Fit", "$18" } };
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");

			} else if (exercise.equalsIgnoreCase("Body Blitz")) {

				String data[][] = { { "Sunday", "06-03-2022", "4.30pm", "Body Blitz", "$15" },
						{ "Sunday", "13-03-2022", "7.30pm", "Body Blitz", "$15" } };
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.printf("%5s %10s %15s %10s %9s", "Week", "Date", "Timing", "Lesson", "Price");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				for (String[] data1 : data) {
					System.out.format("%5s %13s %9s %10s %9s", data1);
					System.out.println();
				}
				System.out.println(
						"----------------------------------------------------------------------------------------------");

			} else {
				System.out.println("Invalid Input....!!!");
			}

		}

	}

}
