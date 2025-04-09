Feature: checkout

Scenario: Place the order and verify the order id

Given Products in the cart are displayed

When the user clicks checkout and billing address is entered

Then the user places the order