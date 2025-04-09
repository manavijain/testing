Feature: Delete product and update quantity in cart

Scenario: Verify the amount after adding multiple products and deleting a product 
Given login is successful and book section is clicked
When add multiple products to the cart
When click on shopping cart and check the subtotal
When remove a product from the cart
When check subtotal again
Then the product should be removed and the amount should be updated
