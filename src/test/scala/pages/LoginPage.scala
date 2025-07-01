package pages

import locators.LoginLocators.{Login, Password, Username, errorMessage, expectedErrorMessage, expectedLoginHeader, loginPageHeader}
import utils.Assertion

object LoginPage extends BasePage {

  // — User Name —

  def inputUserName(text: String): Unit =
    inputText(Username, text)

  // — Password —
  def inputPassword(text: String): Unit = {
    inputText(Password, text)
  }
  // — Login Button —
  def buttonLogin(): Unit = {
    clickOn(Login)
  }

  def getErrorMessage(): String = {
    getText(errorMessage)
  }
  def verifyErrorMessage(): Unit = {
    Assertion.assert(getErrorMessage(), expectedErrorMessage)
  }

  def verifyLoginHeader(): Unit = {
    Assertion.assert(getText(loginPageHeader), expectedLoginHeader)
  }

}

