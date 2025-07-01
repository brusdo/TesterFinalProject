package pages

import locators.ProductListingLocators.{AddSauceLabsBackpackToCart, ProductListingPageHeader, ShoppingCartBadge, ShoppingCartLink, expectedHeader}
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

  def getCartBadgeCount(): Int = {
    getText(ShoppingCartBadge).toInt
  }

  def navigateToCart(): Unit = {
    clickOn(ShoppingCartLink)
  }

}
