$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying Adactin Hotel Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Booking Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Should Login With Login Credentials \"\u003cUserName\u003e\" and \"\u003cPassWord\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User Should Enter The Booking Details \"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoomType\u003e\",\"\u003cNoOfRooms\u003e\",\"\u003cCheckInDate\u003e\",\"\u003cCheckOutDate\u003e\",\"\u003cAdultsPerRoom\u003e\",\"\u003cChildrenPerPerson\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Should Select the hotel Page",
  "keyword": "And "
});
formatter.step({
  "name": "User Should Enter Personal and Payment Details \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cBillingAddress\u003e\",\"\u003cCreditCardNo\u003e\",\"\u003cCreditCardType\u003e\",\"\u003cExpDateMonth\u003e\",\"\u003cExpDateYear\u003e\",\"\u003cCVVNumber\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord",
        "Location",
        "Hotels",
        "RoomType",
        "NoOfRooms",
        "CheckInDate",
        "CheckOutDate",
        "AdultsPerRoom",
        "ChildrenPerPerson",
        "FirstName",
        "LastName",
        "BillingAddress",
        "CreditCardNo",
        "CreditCardType",
        "ExpDateMonth",
        "ExpDateYear",
        "CVVNumber"
      ]
    },
    {
      "cells": [
        "Hariprasadsrisridhar",
        "Orange@11",
        "Sydney",
        "Hotel Sunshine",
        "Deluxe",
        "2 - Two",
        "16/03/2021",
        "17/03/2021",
        "1 - One",
        "2 - Two",
        "Hari",
        "Prasad",
        "London",
        "1234567891234567",
        "VISA",
        "March",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Booking Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Should Login With Login Credentials \"Hariprasadsrisridhar\" and \"Orange@11\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPagesteps.user_Should_Login_With_Login_Credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should Enter The Booking Details \"Sydney\",\"Hotel Sunshine\",\"Deluxe\",\"2 - Two\",\"16/03/2021\",\"17/03/2021\",\"1 - One\",\"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPagesteps.user_Should_Enter_The_Booking_Details(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should Select the hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPagesteps.user_Should_Select_the_hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should Enter Personal and Payment Details \"Hari\",\"Prasad\",\"London\",\"1234567891234567\",\"VISA\",\"March\",\"2022\",\"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPagesteps.user_Should_Enter_Personal_and_Payment_Details(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});