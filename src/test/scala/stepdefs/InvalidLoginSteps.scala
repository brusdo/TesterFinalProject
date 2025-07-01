package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.CartPage.browserLaunch
import pages.LoginPage.{buttonLogin, getErrorMessage, inputPassword, inputUserName, verifyErrorMessage, verifyLoginHeader}
import pages.ProductListingPage.verifyHeader
import testdata.Data.{invalidPasswordText, invalidUserNameText}

class InvalidLoginSteps extends ScalaDsl with EN{


  When("""the user enters invalid username and password""") { () =>
    inputUserName(invalidUserNameText)
    inputPassword(invalidPasswordText)
    println("User entered invalid login details.")
  }

  Then("""the user should see a login failed error message""") { () =>
    verifyErrorMessage()
    println("Error message received:- \n" + getErrorMessage())
  }

  And("""the user should remain on the login page"""){ () =>
    verifyLoginHeader()
    println("The user remained on the login page.")
  }
}
