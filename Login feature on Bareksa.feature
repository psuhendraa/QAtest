Feature: Login feature on Bareksa
Scenario Outline:Test login with valid credentials

Given User navigates to login page
When User enters <email> and <password>
And Click on login button
Then User is navigated to homepage Bareksa


Examples:
  | email | password |
  |   purbosuhendra@gmail.com    |   iAN9t1dNXG5Iv2tb19Zyjw==   |
 