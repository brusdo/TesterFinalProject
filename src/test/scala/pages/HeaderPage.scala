package pages

import locators.HeaderLocators.{LogoutOption, MenuButton}
import utils.WaitUtils.waitForElementVisible

object HeaderPage extends BasePage {

  //click Menu button
  def buttonMenu(): Unit = {
    clickOn(MenuButton)
  }

  def logOut(): Unit = {
    waitForElementVisible(driver, getWebElement(LogoutOption), 10)
    clickOn(LogoutOption)
  }

}
