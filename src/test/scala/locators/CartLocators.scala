package locators

import org.openqa.selenium.By

object CartLocators {
  val CheckoutButton: By = By.id("checkout")
  val ContinueShoppingButton: By = By.id("continue-shopping")
  val CartItem: By = By.cssSelector(".cart_item")
  val CartItemName: By = By.cssSelector(".inventory_item_name")
  val RemoveButton: By = By.cssSelector("[id^='remove-']")
  // [id^='remove-] means: any id that starts with remove-
  val CartBadge: By = By.cssSelector(".shopping_cart_badge")
}