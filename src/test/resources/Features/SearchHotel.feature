Feature: Verifying Search Hotel Page in Adactin Hotel App

@smoke1
  Scenario Outline: Verifying Search Hotel with All Fields
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Enter The Booking Details "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildrenPerPerson>"
   
Examples: 
|UserName|PassWord|Location|Hotels|RoomType|NoOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerPerson|
|Hariprasadsrisridhar|Orange@11|Sydney|Hotel Sunshine|Deluxe|2 - Two|26/03/2021|27/03/2021|1 - One|2 - Two|


@smoke2
  Scenario Outline: Verifying Search Hotel with Mandatory fields
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Details "<Location>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>"
   
Examples: 
|UserName|PassWord|Location|Hotels|RoomType|NoOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerPerson|
|Hariprasadsrisridhar|Orange@11|Sydney|Hotel Sunshine|Deluxe|2 - Two|26/03/2021|27/03/2021|1 - One|2 - Two|

@smoke3
  Scenario Outline: Verifying Search Hotel with Check In and Check out Date
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should Enter The Booking Details "<CheckInDate>","<CheckOutDate>"
   
Examples: 
|UserName|PassWord|CheckInDate|CheckOutDate|
|Hariprasadsrisridhar|Orange@11|26/03/2021|27/03/2021|

@smoke4
Scenario Outline: Verifying Search Hotel with without entering any fields
    Given user Should Login With Login Credentials "<UserName>" and "<PassWord>"
    When User Should click the Search button
   
Examples: 
|UserName|PassWord|
|Hariprasadsrisridhar|Orange@11|
