package pages

import locators.CartLocators.{CartItem, CheckoutButton, ContinueShoppingButton}
import locators.CheckoutLocators.expectedCheckoutTitle
import utils.Assertion

object CartPage extends BasePage {

  def clickCheckoutButton(): Unit = {
    clickOn(CheckoutButton)
  }

  def clickContinueShoppingButton(): Unit = {
    clickOn(ContinueShoppingButton)
  }

  def getCartItemsCount(): Int = {
    driver.findElements(CartItem).size()
  }

  def verifyCartHasItems(): Unit = {
    val itemCount = getCartItemsCount()
    require(itemCount > 0, s"found $itemCount items. Cart should have at least 1 item")
  }

  def verifyCheckoutPageTitle(): Unit = {
    Assertion.assert(getText(locators.CheckoutLocators.CheckoutPageTitle), expectedCheckoutTitle)
  // The Assertion is checking if the condition is true, if not, it will fail
  }

}

