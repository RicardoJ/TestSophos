Feature: Linio
  As a web user
  I want to use Linio 
  to search product


  Scenario: search in linio
    Given that I opened  browser at Linio home page
    And I search a product 'celular'
    And  choose product
    When I add to shopping cart
    Then in the shopping cart show the product is not 'null' with quantity not 'null'


