package locators

import org.openqa.selenium.By

object ProductListingLocators {
  val ProductListingPageHeader: By = By.cssSelector(".title")
  val expectedHeader:String = "Products"

//  Cart elements:
  val ShoppingCartLink: By = By.cssSelector(".shopping_cart_link")
  val ShoppingCartBadge: By = By.cssSelector(".shopping_cart_badge")

  // Add specific products to cart btn
  val AddSauceLabsBackpackToCart: By = By.id("add-to-cart-sauce-labs-backpack")
  val AddSauceLabsBikeLightToCart: By = By.id("add-to-cart-sauce-labs-bike-light")

}
