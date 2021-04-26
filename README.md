# Introduction
Tasks required for LPG Technology Assessment - Software Engineer in Test

## UI testing
Document and create an automated testing framework and strategy for the business-critical user journeys that can
be found on this page - https://gocity.com/boston/en-us/products/all-inclusive

### Business Critical flows
These are the flows where it is essential that there are no breaking defects though further monitoring and discussions would be needed to ensure high traffic flows are also covered.
* User can select a pass to buy (from the banner, and the React product selector)
* User can get to the checkout and purchase the pass
* User can explore the list of included attractions and view an attraction as they can buy a pass from there too

### Running tests
Run in the terminal with ```gradle cucumber```

### Choices
*Selenium* is a common choice for web ui testing and one I have used before, however, Cypress would be my choice for 
functional tests. Cypress is generally faster than Selenium and also lends itself to writing tests that are 
self-contained.  Selenium would be kept for E2E tests that test the critical journeys as it has more support across 
the various cloud based browser and mobile remote test runners.  
*Page Object* is a common pattern to keep elements and functions limited to specific features ensuring that the test code 
remains maintainable and easy to understand.  
*WebDriverManager* was chosen to handle the browser driver versioning as it will automatically download the correct version for the OS and browser used. This is very useful when running it on a remote browser service where we can specifiy any number of OS, browser, and browser version combinations.

### Strategy
I would use Cypress (Javascript) to run functional tests within objects, e.g. choose your pass container. Cypress runs 
much faster with a smaller footprint than Selenium. After discussing with the developers we could use Cypress as a 
suite just above unit tests that verifies feature functions so that we can be sure the website would be functional before too much time had elapsed.  Selenium would be kept for E2E testing as it has a long history in that area with many of the remote browser testing services working well with Selenium, even though Cypress 
is supported by some of them.

Within Selenium, we will use page object models but not with page factories (as these tend to cause stale element 
errors) as this is standard for UI testing.  The Selenium tests will focus only on the critical paths as the lower tests 
will have proven that the look and usage of the functions is correct. We would use production monitoring to find the most used paths and ensure that our E2E tests cover those paths.  

If we do not use Cypress then I would work with the developers to ensure our unit tests cover as much of the functionality as possible so that our time-consuming tests could be limited.

### Incomplete
I was unable to complete the feature as I had a few ide setup issues that took a while to resolve.

### Future changes
* Add a screenshot option on failing steps to help with debugging  
* Add page constants for urls and similar
* Add option to choose browser so that tests can be run across multiple browsers
