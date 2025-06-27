package pages

import locators.CheckoutLocators.{CheckoutPageTitle, ContinueButton, FirstNameField, LastNameField, PostalCodeField, expectedCheckoutTitle}
import utils.Assertion

object CheckoutPage extends BasePage {

  def verifyCheckoutPageTitle(): Unit = {
    Assertion.assert(getText(CheckoutPageTitle), expectedCheckoutTitle)
    // The Assertion is checking if the condition is true, if not, it will fail
  }

  def verifyPersonalInformationFields(): Unit = {
    val firstNameVisible = getWebElement(FirstNameField).isDisplayed
    val lastNameVisible = getWebElement(LastNameField).isDisplayed
    val postalCodeVisible = getWebElement(PostalCodeField).isDisplayed

    require(firstNameVisible, "First Name field must be visible")
    require(lastNameVisible, "Last Name field must be visible")
    require(postalCodeVisible, "Postal Code field must be visible")
  }

  def enterPersonalInformation(firstName: String, lastName: String, postalCode: String): Unit = {
    inputText(FirstNameField, firstName)
    inputText(LastNameField, lastName)
    inputText(PostalCodeField, postalCode)
  }

  def clickContinueButton(): Unit = {
    clickOn(ContinueButton)
  }
}

