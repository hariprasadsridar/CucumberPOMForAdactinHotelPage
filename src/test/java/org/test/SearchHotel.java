package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRooms;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	@FindBy(id="child_room")
	private WebElement dDnChildRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	public WebElement getSelect() {
		return select;
	}
	public void setSelect(WebElement select) {
		this.select = select;
	}
	public WebElement getSelectContinue() {
		return selectContinue;
	}
	public void setSelectContinue(WebElement selectContinue) {
		this.selectContinue = selectContinue;
	}
	public WebElement getCheckInError() {
		return checkInError;
	}
	public void setCheckInError(WebElement checkInError) {
		this.checkInError = checkInError;
	}
	public WebElement getCheckOutError() {
		return checkOutError;
	}
	public void setCheckOutError(WebElement checkOutError) {
		this.checkOutError = checkOutError;
	}
	public WebElement getLocationError() {
		return locationError;
	}
	public void setLocationError(WebElement locationError) {
		this.locationError = locationError;
	}
	@FindBy(id = "continue")
	private WebElement selectContinue;

	@FindBy(id = "checkin_span")
	private WebElement checkInError;
	@FindBy(id = "checkout_span")
	private WebElement checkOutError;
	@FindBy(id = "location_span")
	private WebElement locationError;
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnhotels() {
		return dDnhotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}
	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}
	public void serachotelPage(String Location,String Hotels,String Roomtype,String NoOfRooms,String CheckIndate,
							String CheckOutDate,String AdultsPerRoom,String ChildrensPerRoom) {
		
		
		selctbytext(dDnLocation, Location);
		selctbytext(dDnhotels, Hotels);
		selctbytext(dDnRoomType, Roomtype);
		selctbytext(dDnNoOfRooms, NoOfRooms);
		sendKey(txtCheckInDate, CheckIndate);
		sendKey(txtCheckOutDate, CheckOutDate);
		selctbytext(dDnAdultRoom, AdultsPerRoom);
		selctbytext(dDnChildRoom, ChildrensPerRoom);
		buttonClick(btnSubmit);
	
		
	}
	
	public void serachotelPagewithMandatoryfields(String Location,String NoOfRooms,String CheckIndate,
			String CheckOutDate,String AdultsPerRoom) {


selctbytext(dDnLocation, Location);
selctbytext(dDnNoOfRooms, NoOfRooms);
sendKey(txtCheckInDate, CheckIndate);
sendKey(txtCheckOutDate, CheckOutDate);
selctbytext(dDnAdultRoom, AdultsPerRoom);
buttonClick(btnSubmit);



	}
	
	
	public void dateVerify() {

		String checkinText= getText(getCheckInError());
		Assert.assertEquals("CHECKIN ERROR", "Check-In Date shall be before than Check-Out Date", checkinText);
		String checkoutText= getText(getCheckOutError());
		Assert.assertEquals("CHECKOUT ERROR", "Check-Out Date shall be after than Check-In Date", checkoutText);
	
	}
	
	public void locationVerify() {
		String locationtext = getText(getdDnLocation());
		Assert.assertEquals("LOCATION ERROR", "Please Select a Location", locationtext);
		
	}
	

	public void dateChecking(String checkInDate, String checkOutDate) {

		clear(getTxtCheckInDate());
		sendKey(getTxtCheckInDate(), checkInDate);
		clear(getTxtCheckOutDate());
		sendKey(getTxtCheckOutDate(), checkOutDate);
		buttonClick(btnSubmit);

	}

	
	public void serachotelPagewithCheckInAndCheckOutDate(String CheckIndate,String CheckOutDate) {

sendKey(txtCheckInDate, CheckIndate);
sendKey(txtCheckOutDate, CheckOutDate);
buttonClick(btnSubmit);


	}
	
	public void serachotelPagewithOutEnteringAnyFields() {

		buttonClick(btnSubmit);
			}

}
