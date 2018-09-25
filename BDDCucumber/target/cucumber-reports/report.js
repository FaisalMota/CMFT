$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Condition.feature");
formatter.feature({
  "line": 1,
  "name": "Condition",
  "description": "",
  "id": "condition",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "",
  "description": "",
  "id": "condition;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Condition"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enter first name \"\u003cfname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enter last name \"\u003clname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter street Address \"\u003cst_Address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter city \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select state \"\u003cstate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter Zip \"\u003cZip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User selects department to contact",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter subject \"\u003csubject\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter message \"\u003cmessage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click Next",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "close browser",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "st_Address",
        "city",
        "state",
        "Zip",
        "email",
        "subject",
        "message"
      ],
      "line": 24
    },
    {
      "cells": [
        "first",
        "name",
        "willow st",
        "karachi",
        "5",
        "12345",
        "A@yahoo.com",
        "Good subject to read",
        "Good message to read"
      ],
      "line": 25
    },
    {
      "cells": [
        "first1",
        "name2",
        "hillow st",
        "Lahore",
        "7",
        "67891",
        "A@yahoo.com",
        "Good subject to read1",
        "Good message to read1"
      ],
      "line": 26
    },
    {
      "cells": [
        "first2",
        "name2",
        "trillow st",
        "Hyderabad",
        "20",
        "34567",
        "A@yahoo.com",
        "Good subject to read2",
        "Good message to read2"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.scenarioOutline({
  "line": 114,
  "name": "",
  "description": "",
  "id": "condition;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 113,
      "name": "@Condition"
    }
  ]
});
formatter.step({
  "line": 115,
  "name": "User enter first name \"\u003cfname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "User enter last name \"\u003clname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "User enter street Address \"\u003cst_Address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "User enter city \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "User select state \"\u003cstate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "User enter Zip \"\u003cZip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "User enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "User selects department to contact customer service",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "User has not open a trouble ticket",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "User enter subject \"\u003csubject\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "User enter message \"\u003cmessage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "User click Next",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "User validate the error message",
  "keyword": "Then "
});
formatter.step({
  "line": 128,
  "name": "close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 133,
  "name": "",
  "description": "",
  "id": "condition;;",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "st_Address",
        "city",
        "state",
        "Zip",
        "email",
        "subject",
        "message"
      ],
      "line": 134,
      "id": "condition;;;1"
    },
    {
      "cells": [
        "",
        "name",
        "willow st",
        "karachi",
        "5",
        "12345",
        "A@yahoo.com",
        "Good subject to read",
        "Good message to read"
      ],
      "line": 135,
      "id": "condition;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User enter the NGC URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User selects the conditional form on NGC home page",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef1.user_enter_the_NGC_URL()"
});
formatter.result({
  "duration": 9951854872,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef1.user_selects_the_conditional_form_on_NGC_home_page()"
});
formatter.result({
  "duration": 887301830,
  "status": "passed"
});
formatter.scenario({
  "line": 135,
  "name": "",
  "description": "",
  "id": "condition;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 113,
      "name": "@Condition"
    }
  ]
});
formatter.step({
  "line": 115,
  "name": "User enter first name \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "User enter last name \"name\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "User enter street Address \"willow st\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "User enter city \"karachi\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "User select state \"5\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "User enter Zip \"12345\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "User enter email \"A@yahoo.com\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "User selects department to contact customer service",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "User has not open a trouble ticket",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "User enter subject \"Good subject to read\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "User enter message \"Good message to read\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "User click Next",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "User validate the error message",
  "keyword": "Then "
});
formatter.step({
  "line": 128,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 23
    }
  ],
  "location": "Stepdef1.user_enter_first_name(String)"
});
formatter.result({
  "duration": 146665147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 22
    }
  ],
  "location": "Stepdef1.user_enter_last_name(String)"
});
formatter.result({
  "duration": 131777876,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "willow st",
      "offset": 27
    }
  ],
  "location": "Stepdef1.user_enter_street_Address(String)"
});
formatter.result({
  "duration": 138308017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karachi",
      "offset": 17
    }
  ],
  "location": "Stepdef1.user_enter_city(String)"
});
formatter.result({
  "duration": 84229654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 19
    }
  ],
  "location": "Stepdef1.user_select_state(int)"
});
formatter.result({
  "duration": 310037730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "Stepdef1.user_enter_Zip(String)"
});
formatter.result({
  "duration": 160221645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A@yahoo.com",
      "offset": 18
    }
  ],
  "location": "Stepdef1.user_enter_email(String)"
});
formatter.result({
  "duration": 226557730,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef1.user_selects_department_to_contact_customer_service()"
});
formatter.result({
  "duration": 131766355,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef1.user_has_not_open_a_trouble_ticket()"
});
formatter.result({
  "duration": 133940225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Good subject to read",
      "offset": 20
    }
  ],
  "location": "Stepdef1.user_enter_subject(String)"
});
formatter.result({
  "duration": 177362147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Good message to read",
      "offset": 20
    }
  ],
  "location": "Stepdef1.user_enter_message_message(String)"
});
formatter.result({
  "duration": 177592974,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef1.user_click_Next()"
});
formatter.result({
  "duration": 785070231,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef1.user_validate_the_error_message()"
});
formatter.result({
  "duration": 48263316,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef1.close_browser()"
});
formatter.result({
  "duration": 1076824418,
  "status": "passed"
});
});