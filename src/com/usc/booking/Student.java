package com.usc.booking;

public class Student {

	private int studId;
	private String studName;
	private String studAddress;
	private String studPhoneNumber;
	private String lessonBooked;
	private String bookingStatus;
	private int rating;
	private int price;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public String getStudPhoneNumber() {
		return studPhoneNumber;
	}

	public void setStudPhoneNumber(String studPhoneNumber) {
		this.studPhoneNumber = studPhoneNumber;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLessonBooked() {
		return lessonBooked;
	}

	public void setLessonBooked(String lessonBooked) {
		this.lessonBooked = lessonBooked;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Student(int studId, String studName, String studAddress, String studPhoneNumber, String lessonBooked,
			String bookingStatus, int rating, int price) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.studPhoneNumber = studPhoneNumber;
		this.lessonBooked = lessonBooked;
		this.bookingStatus = bookingStatus;
		this.rating = rating;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress
				+ ", studPhoneNumber=" + studPhoneNumber + ", lessonBooked=" + lessonBooked + ", bookingStatus="
				+ bookingStatus + ", rating=" + rating + ", price=" + price + "]";
	}
}
