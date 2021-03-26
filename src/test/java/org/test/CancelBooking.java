package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class CancelBooking extends BaseClass{
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement bookingOrderId;
	
	@FindBy(xpath = "//a[contains(text(),'Booked Itinerary')]")
	private WebElement bookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement orderIdText;

	@FindBy(id = "search_hotel_id")
	private WebElement searchHotelId;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement orderIdCheckBox;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelButton;
	
	@FindBy(id = "search_result_error")
	private WebElement cancelErrorMessage;
	
	public WebElement getBookingOrderId() {
		return bookingOrderId;
	}
	public void setBookingOrderId(WebElement bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}
	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}
	public void setBookedItinerary(WebElement bookedItinerary) {
		this.bookedItinerary = bookedItinerary;
	}
	public WebElement getOrderIdText() {
		return orderIdText;
	}
	public void setOrderIdText(WebElement orderIdText) {
		this.orderIdText = orderIdText;
	}
	public WebElement getSearchHotelId() {
		return searchHotelId;
	}
	public void setSearchHotelId(WebElement searchHotelId) {
		this.searchHotelId = searchHotelId;
	}
	public WebElement getOrderIdCheckBox() {
		return orderIdCheckBox;
	}
	public void setOrderIdCheckBox(WebElement orderIdCheckBox) {
		this.orderIdCheckBox = orderIdCheckBox;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}
	public WebElement getCancelErrorMessage() {
		return cancelErrorMessage;
	}
	public void setCancelErrorMessage(WebElement cancelErrorMessage) {
		this.cancelErrorMessage = cancelErrorMessage;
	}
	public void cancelBookingOrderId() {

		String order = getAttribute(getBookingOrderId());
		buttonClick(getBookedItinerary());
		sendKey(getOrderIdText(), order);
		buttonClick(getSearchHotelId());
		buttonClick(getCancelButton());
		confirmAlertAccept();

	}
	
	public void verifyCancel() {
		
		String cancelMessage = getText(getCancelErrorMessage());
		Assert.assertEquals("The booking has been cancelled.", cancelMessage);
		System.out.println("Cancelled Successfully");
	}

	public void cancelExistingBookingId() {
		
		buttonClick(getBookedItinerary());
		buttonClick(getCancelButton());
		confirmAlertAccept();

	}
	
	
}
