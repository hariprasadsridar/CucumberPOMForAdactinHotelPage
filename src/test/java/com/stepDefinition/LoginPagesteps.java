package com.stepDefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.test.BookHotel;
import org.test.CancelBooking;
import org.test.LoginPage;
import org.test.SearchHotel;
import org.test.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPagesteps extends BaseClass{
	LoginPage loginpage;
	SearchHotel searchpage;
	SelectHotel selectpage;
	BookHotel bookpage;
	CancelBooking cancelpage;

	@Given("user Login With Login Credentials {string} and {string}")
	public void user_Should_Login_With_Login_Credentials_and(String string, String string2) {
		getDriver();
		loadUrl("http://adactinhotelapp.com/index.php");
		maximize();
		loginpage = new LoginPage();
		loginpage.login(string, string2);

	}

	@When("User Enter The Booking Details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Enter_The_Booking_Details(String Location,String Hotels,String Roomtype,String NoOfRooms,String CheckIndate,
			String CheckOutDate,String AdultsPerRoom,String ChildrensPerRoom) {
		searchpage = new SearchHotel();
		searchpage.serachotelPage(Location,Hotels,Roomtype, NoOfRooms, CheckIndate, CheckOutDate, AdultsPerRoom,ChildrensPerRoom);
		
	}

	@When("User Should Select the hotel Page")
	public void user_Should_Select_the_hotel_Page() {
		selectpage = new SelectHotel();
		buttonClick(selectpage.getBtnClick());
		buttonClick(selectpage.getBtnContinue());
	}

	@When("User Should Enter Personal and Payment Details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Should_Enter_Personal_and_Payment_Details(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expDateMonth, String expDateYear, String cVVNumber) {
		bookpage = new BookHotel();
		bookpage.bookHotel(firstName, lastName, billingAddress, creditCardNo, creditCardType, expDateMonth, expDateYear, cVVNumber);
		bookpage.getBtnBook();
		implicitlyWait();
		bookpage.getGetOrderId();
		
	}
	
	@When("User should the cancel the already Booked Hotel")
	public void user_should_the_cancel_the_already_Booked_Hotel() {
	   cancelpage = new CancelBooking();
	   cancelpage.cancelBookingOrderId();
	   cancelpage.verifyCancel();
	}


	@When("User Should click cancel button on Order Id to be cancelled")
	public void user_Should_click_cancel_button_on_Order_Id_to_be_cancelled() {
		cancelpage = new CancelBooking();
		   cancelpage.cancelExistingBookingId();
		   cancelpage.verifyCancel();
	}

	@When("User Should click Book Now button")
	public void user_Should_click_Book_Now_button() {
		bookpage=new BookHotel();
	    bookpage.bookHotelWithOutAnyFields();
	    bookpage.verifyBooking();
	}

	@When("User Should Enter The Booking Details {string},{string},{string},{string},{string}")
	public void user_Should_Enter_The_Booking_Details(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {
		
		searchpage = new SearchHotel();
		searchpage.serachotelPagewithMandatoryfields(location,noOfRooms,checkInDate,checkOutDate,adultsPerRoom);
		
	   	}

	@When("User Should Enter The Booking Details {string},{string}")
	public void user_Should_Enter_The_Booking_Details(String checkInDate, String checkOutDate) {
		searchpage = new SearchHotel();
		searchpage.serachotelPagewithCheckInAndCheckOutDate(checkInDate, checkOutDate);
		searchpage.getBtnSubmit();
		searchpage.dateVerify();
		searchpage.locationVerify();
		
	    	}

	@When("User Should click the Search button")
	public void user_Should_click_the_Search_button() {
		searchpage = new SearchHotel();
		searchpage.serachotelPagewithOutEnteringAnyFields();
		
	}
}





