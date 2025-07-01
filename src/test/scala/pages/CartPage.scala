package pages

import locators.CartLocators._
import scala.jdk.CollectionConverters.CollectionHasAsScala
import locators.CartLocators.{CartItem, CheckoutButton, ContinueShoppingButton}
import locators.CheckoutLocators.expectedCheckoutTitle
import utils.Assertion

object CartPage extends BasePage {

  def getCartItemNames(): List[String] = {
    driver.findElements(CartItemName).asScala.toList.map(_.getText)
  }

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

  def verifyItemInCart(itemName: String): Unit = {
    val cartItems = getCartItemNames()
    require(cartItems.contains(itemName), s"$itemName not found in the cart")
  }

  def verifyCheckoutPageTitle(): Unit = {
    Assertion.assert(getText(locators.CheckoutLocators.CheckoutPageTitle), expectedCheckoutTitle)
    // The Assertion is checking if the condition is true, if not, it will fail
  }
}
