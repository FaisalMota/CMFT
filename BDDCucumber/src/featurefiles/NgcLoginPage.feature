Feature: NGCloginPage


##@NGC
Scenario Outline: 
     Given user open webbrowser and navigate to CMS URL
     When user enter values in userid "<userid>" 
     And user enter values in Password "<password>"
     And user agrees to terms and condition
     And user click login button 
     And user validate the url title
     And click select Feedback reports from PRQS dropdown menu
     And select from select a year dropdown menu
     And select AQRUR report from select a report dropdown menu
     And user select view online from select a action dropdown menu
     And user select contractor on the attestation page
     And user search for pre selected TIN name
     And user move the TIN Name from Available section to Selected section
    And user clicks the Run Document
    
   ## And user clicks About this Report
    And user clicks Your TINs Value Modifier tab on AQRUR Report
    And user clicks Quality Performance tab on AQRUR Report
    And user clicks Cost Performance tab on AQRUR Report
    And user clicks Accompanying Tables tab on AQRUR Report
    And user clicks About the Value Modifier tab on AQRUR Report
    And user clicks Glossary tab on AQRUR Report
    And user clicks About this Report
    
  
  
    
     
 
     
    Examples:
    |userid|password|
    |Amadmin|Cms_1001|
    |Ngc1001|Cms_1001|
    
    
    
   ## @NGC
Scenario Outline: 
     Given user open webbrowser and navigate to CMS URL
     When user enter values in userid "<userid>" 
     And user enter values in Password "<password>"
     And user agrees to terms and condition
     And user click login button 
     And user validate the url title
     And click select Feedback reports from PRQS dropdown menu
     And select from select a year dropdown menu
     And select AQRUR report from select a report dropdown menu
     And user select view online from select a action dropdown menu
     And user select CMS Employee on the attestation page and Confirm
     And user search for pre selected TIN name
     
 
     
    Examples:
    |userid|password|
    |Amadmin|Cms_1001|
    |Ngc1001|Cms_1001|
    
    
    
    
    
 ##   @NGC
Scenario Outline: 
     Given user open webbrowser and navigate to CMS URL
     When user enter values in userid "<userid>" 
     And user enter values in Password "<password>"
     And user agrees to terms and condition
     And user click login button 
     And user validate the url title
     And click select Feedback reports from PRQS dropdown menu
     And select from select a year dropdown menu
     And select AQRUR report from select a report dropdown menu
     And user select view online from select a action dropdown menu
     And user select contractor on the attestation page
     And user search for pre selected TIN name
     And user move the TIN Name from Available section to Selected section
     And user clicks the Run Document
     And user verify Report of the report
    
    
    
        Examples:
    |userid|password|
    |Amadmin|Cms_1001|
    
    
    
    ##    @NGC
Scenario Outline: Scenario1Type1 
     Given user open webbrowser and navigate to CMS URL
     When user enter values in userid "<userid>" 
     And user enter values in Password "<password>"
     And user agrees to terms and condition
     And user click login button 
     And user validate the url title
     And click select Feedback reports from PRQS dropdown menu
     And select from select a year dropdown menu
     And select AQRUR report from select a report dropdown menu
     And user select view online from select a action dropdown menu
     And user select contractor on the attestation page
     And user search for pre selected TIN name
     And user move the TIN Name from Available section to Selected section
     And user clicks the Run Document
     And user verify Report of the report
     And user verify Aqrur cover page Report Senario One
     And user verify Aqrur cover page Report Senario One Against Template
     And user verify Aqrur cover page Report Senario One Against Database
     ##"<VBMDecisionDate>"
     
     
    
    
        Examples:
    |userid|password|GroupName|LastFourOFTIN|ScenarioType|VBMDecisionDate|VBMCostText|VBMAdjustmentText|
    |Amadmin|Cms_1001|||1||||
    
    
    
    @NGC
    Scenario Outline: Scenario1Type2
     Given user open webbrowser and navigate to CMS URL
     When user enter values in userid "<userid>" 
     And user enter values in Password "<password>"
     And user agrees to terms and condition
     And user click login button 
     And user validate the url title
     And click select Feedback reports from PRQS dropdown menu
     And select from select a year dropdown menu
     And select AQRUR report from select a report dropdown menu
     And user select view online from select a action dropdown menu
     And user select contractor on the attestation page
     And user search for pre selected TIN name"<LastFourOFTIN>"
     And user move the TIN Name from Available section to Selected section
     And user clicks the Run Document
    ## And user verify Report Scenario One Type Two
     And user verify Report Scen One Type Two
     And user verify Aqrur cover page Report Senario One
     And user verify Aqrur cover page Report Senario One Against Template 
     And user verify Aqrur cover page Report Senario One Type Two Against Database
    
     
     
    
    
        Examples:
    |userid|password|LastFourOFTIN|GroupName|ScenarioType|VBMDecisionDate|VBMCostText|VBMAdjustmentText|
    |Amadmin|Cms_1001|0668 & STWRFS|NQTBNYJ|1||||

    