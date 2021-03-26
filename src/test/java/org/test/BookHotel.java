package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BookHotel extends BaseClass{
public BookHotel() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtPassWord;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCardNumber;
	@FindBy(id="cc_type")
	private WebElement dDnCardType;
	@FindBy(id="cc_exp_month")
	private WebElement dDnMonth;
	@FindBy(id="cc_exp_year")
	private WebElement dDnYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	@FindBy(id="book_now")
	private WebElement btnBook;
	@FindBy(id="order_no")
	private WebElement getOrderId;
	
	@FindBy(id = "first_name_span")
	private WebElement firstNameVerify;
	public WebElement getFirstNameVerify() {
		return firstNameVerify;
	}
	public void setFirstNameVerify(WebElement firstNameVerify) {
		this.firstNameVerify = firstNameVerify;
	}
	public WebElement getLastNameVerify() {
		return lastNameVerify;
	}
	public void setLastNameVerify(WebElement lastNameVerify) {
		this.lastNameVerify = lastNameVerify;
	}
	public WebElement getAddressVerify() {
		return addressVerify;
	}
	public void setAddressVerify(WebElement addressVerify) {
		this.addressVerify = addressVerify;
	}
	public WebElement getCreditCardNumberVerify() {
		return creditCardNumberVerify;
	}
	public void setCreditCardNumberVerify(WebElement creditCardNumberVerify) {
		this.creditCardNumberVerify = creditCardNumberVerify;
	}
	public WebElement getCreditCardTypeVerify() {
		return creditCardTypeVerify;
	}
	public void setCreditCardTypeVerify(WebElement creditCardTypeVerify) {
		this.creditCardTypeVerify = creditCardTypeVerify;
	}
	public WebElement getMonthVerify() {
		return monthVerify;
	}
	public void setMonthVerify(WebElement monthVerify) {
		this.monthVerify = monthVerify;
	}
	public WebElement getYearVerify() {
		return yearVerify;
	}
	public void setYearVerify(WebElement yearVerify) {
		this.yearVerify = yearVerify;
	}
	public WebElement getCvvVerify() {
		return cvvVerify;
	}
	public void setCvvVerify(WebElement cvvVerify) {
		this.cvvVerify = cvvVerify;
	}
	@FindBy(id = "last_name_span")
	private WebElement lastNameVerify;
	@FindBy(id = "address_span")
	private WebElement addressVerify;
	@FindBy(id = "cc_num_span")
	private WebElement creditCardNumberVerify;
	@FindBy(id = "cc_type_span")
	private WebElement creditCardTypeVerify;
	@FindBy(id = "cc_exp_month")
	private WebElement monthVerify;
	@FindBy(id = "cc_exp_year")
	private WebElement yearVerify;
	@FindBy(id = "cc_cvv_span")
	private WebElement cvvVerify;
	
	
	
	public WebElement getGetOrderId() {
		return getOrderId;
	}
	public void setGetOrderId(WebElement getOrderId) {
		this.getOrderId = getOrderId;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}
	public WebElement getdDnCardType() {
		return dDnCardType;
	}
	public WebElement getdDnMonth() {
		return dDnMonth;
	}
	public WebElement getdDnYear() {
		return dDnYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
	
public void bookHotel(String FirstName,String LastName,String Address,String CardNumber,String CardType,String CardMonth,String CardYear,String Cvv) {
	sendKey(txtFirstName, FirstName);
	sendKey(txtPassWord, LastName);
	sendKey(txtAddress, Address);
	sendKey(txtCardNumber, CardNumber);
	selctbytext(dDnCardType, CardType);
	selctbytext(dDnMonth, CardMonth);
	selctbytext(dDnYear, CardYear);
	sendKey(txtCvv, Cvv);
	buttonClick(btnBook);
	implicitlyWait();
	getAttribute(getOrderId);
}

public void bookHotelWithOutAnyFields() {
	buttonClick(btnBook);
	getAttribute(getOrderId);
}

public void verifyBooking() {
	String firstNameVerify = getText(getFirstNameVerify());
	Assert.assertEquals("FIRSTNAME ERROR", "Please Enter your First Name", firstNameVerify);
	String lastNameVerify = getText(getLastNameVerify());
	Assert.assertEquals("LASTNAME ERROR", "Please Enter you Last Name", lastNameVerify);
	String addressVerify = getText(getAddressVerify());
	Assert.assertEquals("ADDRESS ERROR", "Please Enter your Address", addressVerify);
	String creditCardNumberVerify = getText(getCreditCardNumberVerify());
	Assert.assertEquals("CARDNUMBER ERROR", "Please Enter your 16 Digit Credit Card Number", creditCardNumberVerify);
	String creditCardTypeVerify = getText(getCreditCardTypeVerify());
	Assert.assertEquals("CARDTYPE ERROR", "Please Select your Credit Card Type", creditCardTypeVerify);
	String monthVerify = getText(getMonthVerify());
	Assert.assertEquals("MONTH ERROR", "Please Select your Credit Card Expiry Month", monthVerify);
	String yearVerify = getText(getYearVerify());
	Assert.assertEquals("YEAR ERROR", "Please Select your Credit Card Expiry Month", yearVerify);
	String cvvVerify = getText(getCvvVerify());
	Assert.assertEquals("CVV ERROR", "Please Enter your Credit Card CVV Number", cvvVerify);
	

}


}
