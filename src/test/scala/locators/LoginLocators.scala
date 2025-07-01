package locators

import org.openqa.selenium.By


object LoginLocators {

  val Username: By = By.id("user-name")
  val Password: By = By.id("password")
  val Login:   By = By.id("login-button")
  val errorMessage: By = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
  val expectedErrorMessage: String = "Epic sadface: Username and password do not match any user in this service"

  val loginPageHeader: By = By.xpath("//*[@id=\"root\"]/div/div[1]")
  val expectedLoginHeader: String = "Swag Labs"

}