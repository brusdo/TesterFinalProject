package pages

import locators.HeaderLocators.{LogoutOption, MenuButton}
import locators.LoginLocators.Login
import utils.WaitUtils.waitForElementClickable


object HeaderPage extends BasePage {

  //click Menu button
  def buttonMenu(): Unit = {
    clickOn(MenuButton)
  }
  //Click logout option
  def logOut(): Unit = {
    clickOn(LogoutOption)
  }
  //Verify login button is displayed
  def verifyInLoginPage(): Unit = {
    waitForElementClickable(driver, Login, 10)
    assert(getWebElement(Login).isDisplayed)
  }
}
