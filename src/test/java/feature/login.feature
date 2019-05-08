Feature: Login into Application

Scenario: Positive test case
Given Initialize the browser with chrome
And Navigate to "https://qaclickacademy.com" site
And click on login link in home poage to land on sign on page
When User enters "test99@gmail.com" and "123456" and login
Then Verify the user is successfully logged in  