Feature: Login
Scenario Outline: To perform multiple user login
Given User should be on login page
When user enters "<username>" and "<password>" and click on submit
Then user login should be successful
Examples:
|username|password|
|mercury|mercury|
|tutorial|turorial|