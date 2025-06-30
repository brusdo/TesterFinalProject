package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.HeaderPage.{buttonMenu, logOut}
import pages.LoginPage.verifyLoginHeader
import pages.ProductListingPage.verifyHeader


class LogoutSteps extends ScalaDsl with EN {
  When("""the user clicks the menu button"""){ () =>
    buttonMenu()
    println("User clicks the menu button")
  }
  And("""the user select Logout from the options"""){ () =>
    logOut()
    verifyLoginHeader()
    println("User is logged out")
  }
}