package locators

import org.openqa.selenium.By


object LoginLocators {

  val Username: By = By.id("user-name")
  val Password: By = By.id("password")
  val Login:   By = By.id("login-button")
  val errorMessage: By = By.tagName("h3")

  val loginPageHeader: By = By.xpath("//*[@id=\"root\"]/div/div[1]")
  val expectedLoginHeader: String = "Swag Labs"

}