package pages

import locators.LoginLocators.{Login, Password, Username}

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

}

