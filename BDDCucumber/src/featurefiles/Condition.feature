Feature: Condition

Background:
Given User enter the NGC URL
When User selects the conditional form on NGC home page 

@Condition
Scenario Outline: 
And User enter first name "<fname>"
And User enter last name "<lname>"
And User enter street Address "<st_Address>"
And User enter city "<city>"
And User select state "<state>"
And User enter Zip "<Zip>"
And User enter email "<email>"
And User selects department to contact
And User enter subject "<subject>" 
And User enter message "<message>"
And User click Next

Then close browser

Examples:
|fname|lname|st_Address|city|state|Zip|email|subject|message|
|first|name|willow st |karachi|5|12345|A@yahoo.com|Good subject to read|Good message to read|
|first1|name2|hillow st |Lahore|7|67891|A@yahoo.com|Good subject to read1|Good message to read1|
|first2|name2|trillow st |Hyderabad|20|34567|A@yahoo.com|Good subject to read2|Good message to read2|




Scenario Outline: 
And User enter first name "<fname>"
And User enter last name "<lname>"
And User enter street Address "<st_Address>"
And User enter city "<city>"
And User select state "<state>"
And User enter Zip "<Zip>"
And User enter email "<email>"
And User selects department to contact billing
And User enter Account number "<Account number>"
And User enter subject "<subject>" 
And User enter message "<message>"
And User click Next
Then close browser


Examples:
|fname|lname|st_Address|city|state|Zip|email|Account number|subject|message|
|first|name|willow st |karachi|5|12345|A@yahoo.com|123456789|Good subject to read|Good message to read|
|first1|name2|hillow st |Lahore|7|67891|A@yahoo.com|123456789|Good subject to read1|Good message to read1|
|first2|name2|trillow st |Hyderabad|20|34567|A@yahoo.com|123456789|Good subject to read2|Good message to read2|




Scenario Outline: 

And User enter first name "<fname>"
And User enter last name "<lname>"
And User enter street Address "<st_Address>"
And User enter city "<city>"
And User select state "<state>"
And User enter Zip "<Zip>"
And User enter email "<email>"
And User selects department to contact customer service
And User has open a ticket 
And User enter Ticket number "<Ticket number>"
And User enter subject "<subject>" 
And User enter message "<message>"
And User click Next
Then close browser


Examples:
|fname|lname|st_Address|city|state|Zip|email|Ticket number|subject|message|
|first|name|willow st |karachi|5|12345|A@yahoo.com|123456789|Good subject to read|Good message to read|
|first1|name2|hillow st |Lahore|7|67891|A@yahoo.com|123456789|Good subject to read1|Good message to read1|
|first2|name2|trillow st |Hyderabad|20|34567|A@yahoo.com|123456789|Good subject to read2|Good message to read2|









Scenario Outline: 
And User enter first name "<fname>"
And User enter last name "<lname>"
And User enter street Address "<st_Address>"
And User enter city "<city>"
And User select state "<state>"
And User enter Zip "<Zip>"
And User enter email "<email>"
And User selects department to contact customer service
And User has not open a trouble ticket 
And User enter subject "<subject>" 
And User enter message "<message>"
And User click Next
Then close browser


Examples:
|fname|lname|st_Address|city|state|Zip|email|subject|message|
|first|name|willow st |karachi|5|12345|A@yahoo.com|Good subject to read|Good message to read|
|first1|name2|hillow st |Lahore|7|67891|A@yahoo.com|Good subject to read1|Good message to read1|
|first2|name2|trillow st |Hyderabad|20|34567|A@yahoo.com|Good subject to read2|Good message to read2|



@Condition
Scenario Outline: 
And User enter first name "<fname>"
And User enter last name "<lname>"
And User enter street Address "<st_Address>"
And User enter city "<city>"
And User select state "<state>"
And User enter Zip "<Zip>"
And User enter email "<email>"
And User selects department to contact customer service
And User has not open a trouble ticket 
And User enter subject "<subject>" 
And User enter message "<message>"
And User click Next
Then User validate the error message 
Then close browser




Examples:
|fname|lname|st_Address|city|state|Zip|email|subject|message|
||name|willow st |karachi|5|12345|A@yahoo.com|Good subject to read|Good message to read|
