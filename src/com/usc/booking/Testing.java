package com.usc.booking;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	TimeTable tt = new TimeTable();

	@Test
	public void displayTimeTableByDay() {
		tt.displayTimeTableByDay();
	}

	@Test
	public void displayTimeTableByExercise() {
		tt.displayTimeTableByExercise();
	}

}
