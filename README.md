# Introduction
Tasks required for LPG Technology Assessment - Software Engineer in Test

## UI testing
Document and create an automated testing framework and strategy for the business-critical user journeys that can
be found on this page - https://gocity.com/boston/en-us/products/all-inclusive

### Business Critical flows
These are the flows where it is essential that there are no breaking defects
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

### Strategy
I would use Cypress (Javascript) to run functional tests within objects, e.g. choose your pass container. Cypress runs 
much faster with a smaller footprint than Selenium. After discussing with the developers we could use Cypress as a 
suite just above unit tests that verify feature functions.  Selenium would be kept for E2E testing as it has a long 
history in that area with many of the remote browser testing suppliers working well with Selenium, even though Cypress 
is supported by some of them.

Within Selenium, we will use page object models but not with page factories (as these tend to cause stale element 
errors) as this is standard for UI testing.  The Selenium tests will focus only on the critical paths as the lower tests 
will have proven that the look and usage of the functions is correct.

### Incomplete
I was unable to complete the feature as I had a few ide setup issues that took a while to resolve. 

### Future changes
* Add a screenshot option on failing steps to help with debugging  
* Add page constants for urls and similar
* Add option to choose browser so that tests can be run across multiple browsers