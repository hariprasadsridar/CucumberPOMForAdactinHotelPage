Feature: Verifying Hotel Booking Page

@smoke5
  Scenario Outline: Verifying Booking hotel page with All Input fields 
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrenPerPerson>"
    And User Should Select the hotel Page
    And User Should Enter Personal and Payment Details "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpDateMonth>","<ExpDateYear>","<CVVNumber>"

Examples: 
|UserName|PassWord|Location|Hotels|RoomType|NoOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerPerson|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpDateMonth|ExpDateYear|CVVNumber|
|Hariprasadsrisridhar|Orange@11|Sydney|Hotel Sunshine|Deluxe|2 - Two|16/03/2021|17/03/2021|1 - One|2 - Two|Hari|Prasad|London|1234567891234567|VISA|March|2022|123|

@smoke6
  Scenario Outline: Verifying Booking hotel page without entering any Input fields 
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrenPerPerson>"
    And User Should Select the hotel Page
    And User Should click Book Now button
    
Examples: 
|UserName|PassWord|Location|Hotels|RoomType|NoOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerPerson|
|Hariprasadsrisridhar|Orange@11|Sydney|Hotel Sunshine|Deluxe|2 - Two|16/03/2021|17/03/2021|1 - One|2 - Two|

