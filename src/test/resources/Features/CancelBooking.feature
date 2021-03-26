Feature: Verifying Cancel Booking

@smoke7
  Scenario Outline: Verifying Booking Details with Booking 
    Given user Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrenPerPerson>"
    And User Should Select the hotel Page
    And User Should Enter Personal and Payment Details "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpDateMonth>","<ExpDateYear>","<CVVNumber>"
		And User should the cancel the already Booked Hotel
Examples: 
|UserName|PassWord|Location|Hotels|RoomType|NoOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerPerson|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpDateMonth|ExpDateYear|CVVNumber|
|Hariprasadsrisridhar|Orange@11|Sydney|Hotel Sunshine|Deluxe|2 - Two|16/03/2021|17/03/2021|1 - One|2 - Two|Hari|Prasad|London|1234567891234567|VISA|March|2022|123|

@smoke8
  Scenario Outline: Verifying Booking Details with already Booked Order Id
    Given user Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should click cancel button on Order Id to be cancelled
Examples: 
|UserName|PassWord|
|Hariprasadsrisridhar|Orange@11|