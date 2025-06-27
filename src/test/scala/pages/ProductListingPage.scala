package pages

import locators.ProductListingLocators.{AddSauceLabsBackpackToCart, AddSauceLabsBikeLightToCart, ProductListingPageHeader, ShoppingCartLink, expectedHeader}
import utils.Assertion

object ProductListingPage extends BasePage {

  def verifyHeader(): Unit = {
      Assertion.assert(getText(ProductListingPageHeader), expectedHeader)
  }

  def addBackpackToCart(): Unit = {
    clickOn(AddSauceLabsBackpackToCart)
  }

  def addBikeLightToCart(): Unit = {
    clickOn(AddSauceLabsBikeLightToCart)
  }

  def navigateToCart(): Unit = {
    clickOn(ShoppingCartLink)
  }

}
