package locators

import org.openqa.selenium.By

object ProductListingLocators {
  val ProductListingPageHeader: By = By.cssSelector(".title")
  val expectedHeader:String = "Products"

//  Cart buttons:
//  val AddSauceLabsFleeceJacket: By = By.id("add-to-cart-sauce-labs-fleece-jacket")
  val AddSauceLabsBackpackToCart: By = By.id("add-to-cart-sauce-labs-backpack")

//  Cart elements:
  val ShoppingCartLink: By = By.cssSelector(".shopping_cart_link")
  val ShoppingCartBadge: By = By.cssSelector(".shopping_cart_badge")

}
