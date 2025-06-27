package pages

import locators.ProductListingLocators.{ProductListingPageHeader, expectedHeader}
import utils.Assertion

object ProductListingPage extends BasePage {

  def verifyHeader(): Unit = {
    // — Verifying the header —
    def verifyHeader(): Unit = {
      Assertion.assert(getText(ProductListingPageHeader), expectedHeader)
    }
  }

}
