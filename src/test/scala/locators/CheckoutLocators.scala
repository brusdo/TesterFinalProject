package locators

import org.openqa.selenium.By

object CheckoutLocators {
  val CheckoutPageTitle: By = By.cssSelector(".title")
  val FirstNameField: By = By.id("first-name")
  val LastNameField: By = By.id("last-name")
  val PostalCodeField: By = By.id("postal-code")
  val ContinueButton: By = By.id("continue")
  val CancelButton: By = By.id("cancel")
  val expectedCheckoutTitle: String = "Checkout: Your Information"
}