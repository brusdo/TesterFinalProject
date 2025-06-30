package pages

import locators.HeaderLocators.{LogoutOption, MenuButton}
import locators.LoginLocators.Login
import utils.WaitUtils.{setImplicitWait, waitForElementVisible}

import javax.management.NotificationBroadcaster

object HeaderPage extends BasePage {

  //click Menu button
  def buttonMenu(): Unit = {
    clickOn(MenuButton)
  }

  def logOut(): Unit = {
    waitForElementVisible(driver, getWebElement(LogoutOption), 10)
    clickOn(LogoutOption)
  }

  def verifyInLoginPage(): Unit = {
    waitForElementVisible(driver = driver, element = getWebElement(Login), timeoutSeconds = 10)
    assert(driver.getCurrentUrl == "https://www.saucedemo.com/")
  }

}
