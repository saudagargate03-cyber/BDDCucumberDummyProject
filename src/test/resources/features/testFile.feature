

Feature: login to applications

@smoke
Scenario: verify cart page

Given I landed on login page
When I logged into application
And Search for "Tom" in searchbox
Then Home page is displayed



