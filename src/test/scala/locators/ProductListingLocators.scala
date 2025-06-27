package locators

import org.openqa.selenium.By

object ProductListingLocators {
  val ProductListingPageHeader: By = By.cssSelector(".title")
  val expectedHeader:String = "Products"

//  val AddSauceLabsFleeceJacket: By = By.id("add-to-cart-sauce-labs-fleece-jacket")

  // Add specific products to cart btn
  val AddSauceLabsBackpackToCart: By = By.id("add-to-cart-sauce-labs-backpack")
  val AddSauceLabsBikeLightToCart: By = By.id("add-to-cart-sauce-labs-bike-light")

  // Shopping cart link
  val ShoppingCartLink: By = By.cssSelector(".shopping_cart_link")

}
