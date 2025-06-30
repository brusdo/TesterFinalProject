package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.HeaderPage.{buttonMenu, logOut, verifyInLoginPage}
import pages.LoginPage.driver
import pages.ProductListingPage.verifyHeader
import utils.WaitUtils.setImplicitWait


class LogoutSteps extends ScalaDsl with EN {
  When("""the user clicks the menu button"""){ () =>
    buttonMenu()
    println("User clicks the menu button")
  }
  And("""the user select Logout from the options"""){ () =>
    logOut()
    println("User select logout")
  }
  Then("""the user should be taken to the Login page"""){ () =>

    verifyInLoginPage()
  }
}