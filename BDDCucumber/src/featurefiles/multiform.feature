Feature: multiform


@multiform
Scenario Outline: 
      Given user open webbrowser and navigate to URL1
      When user enter values in first "<fname>" name
      And user enter values in last "<lname>"name
      And user enter email "<email>"address
      And user enter "<confirm>" email 
      And click the choice of phone or email
      And click Next to navigate to next page
      And enter street "<address>"
     And enter city "<city>"
     And enter state "<state>"
     And enter zip "<Zip>"
     And Choice of mail 
     And click Next 
     And Choose the <Department> from the DropDown
     And Enter Message "<Message>"
     And click Next to Navigate to last Page
     And user accept terms of service
     Then user click submit 
     
    Examples:
    |fname|lname|email|confirm|address|address2|city|state|Zip|country|Department|Message|
    |Ayesha|Mota|abc@yahoo.com|abc@yahoo.com|21 candy lane|appt#2|moriviller|Maryland|21345|6|0|Please call in Morning|
    |Faisal|Mota|abc@yahoo.com|abc@yahoo.com|25 sweet dr|appt#2|hariville|Ohio|32456|7|1|Please call in evening|