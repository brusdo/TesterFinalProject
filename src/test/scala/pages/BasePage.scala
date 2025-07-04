package pages

import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import support.DriverManager
import utils.ConfigReader
import utils.WaitUtils.waitForElementClickable


trait BasePage {
  def driver: WebDriver = DriverManager.driver

  def browserLaunch(): Unit = {
    val testUrl = ConfigReader.get("base.url")
    driver.get(testUrl)
  }

  // Locator Identification
  def findById(id: String): WebElement = driver.findElement(By.id(id))

  def findByName(name: String): WebElement = driver.findElement(By.name(name))

  def findByLinkText(link: String): WebElement = driver.findElement(By.linkText(link))

  def findByPartialLinkText(partialLink: String): WebElement = driver.findElement(By.partialLinkText(partialLink))

  def findByTagName(tag: String): WebElement = driver.findElement(By.tagName(tag))

  def findByCssSelector(css: String): WebElement = driver.findElement(By.cssSelector(css))

  def findByXpath(xpath: String): WebElement = driver.findElement(By.xpath(xpath))

  // Common Actions
  def inputText(selector: By, text: String): Unit =
    driver.findElement(selector).sendKeys(text)

  def clickOn(selector: By): Unit = {
    driver.findElement(selector).click()
  }

  def waitAndClickOn(selector: By): Unit = {
    waitForElementClickable(driver, selector, 10)
    val jsExecutor: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]
    jsExecutor.executeScript("arguments[0].click();", driver.findElement(selector))
  }

  def getText(selector: By): String =
    driver.findElement(selector).getText

  def getWebElement(selector: By): WebElement =
    driver.findElement(selector)
}
