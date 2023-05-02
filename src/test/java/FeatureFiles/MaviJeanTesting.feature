@ParallelTest
Feature: Jeans Selection Guide

  Scenario: User selection of suitable jeans using the Jean Selection Guide
    Given Navigate to Basqar
    When  The user should click on the Jean section.
    And   The user answers the Gender question as Male.
    And   Verifies that the User Filtering section exists.
    And   The user answers the Waist Type question as Normal Waist.
    And   The user answers Slim Fit to the Jean Cut question.
    And   The user answers the Color question Black.
    And   The user answers the price range question of [fivehundred - fivehundred ninety nine] TL.
    And   The user clicks on the Slim Fit Black Jean option.
    And   User should make size and height selections
    And   User should click Add to Cart.
    And   Added to Cart text should be verified and go to cart
    And   Verify that the item has arrived in the cart and the order summary and delete the item from the cart.
    Then  Verify that the basket is empty and return to the main page.

