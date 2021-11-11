$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/changingInformation.feature");
formatter.feature({
  "name": "Changing any information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that user change personal information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies to be homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_verifies_to_be_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks log in icon",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_clicks_log_in_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Username and Password button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_clicks_Username_and_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills personal credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_fills_personal_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Log in button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_clicks_Log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click Mina Uppgifter button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_click_Mina_Uppgifter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click Redigera Uppgifter button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_click_Redigera_Uppgifter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user changes info",
  "keyword": "And "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_changes_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user cliks Save button",
  "keyword": "When "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_cliks_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user monitors new information",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_monitors_new_information()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c0731111111\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.Arbetsformedlingen.pages.MyPage.monitorNewValue(MyPage.java:45)\r\n\tat com.Arbetsformedlingen.step_definitions.changingStepDef.the_user_monitors_new_information(changingStepDef.java:62)\r\n\tat ✽.the user monitors new information(file:///C:/Users/a/IdeaProjects/arbetsformedlingen/src/test/resources/features/changingInformation.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});