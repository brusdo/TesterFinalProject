package pages

import locators.CartLocators._
import scala.jdk.CollectionConverters.CollectionHasAsScala

object CartPage extends BasePage {

  def getCartItemNames(): List[String] = {
    driver.findElements(CartItemName).asScala.toList.map(_.getText)
  }

  def verifyItemInCart(itemName: String): Unit = {
    val cartItems = getCartItemNames()
    require(cartItems.contains(itemName), s"$itemName not found in the cart")
  }
}
