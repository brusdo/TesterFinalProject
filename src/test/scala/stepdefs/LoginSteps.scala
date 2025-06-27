package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.LoginPage.{browserLaunch, buttonLogin, inputPassword, inputUserName}
import pages.ProductListingPage.verifyHeader
import testdata.Data.{passwordText, userNameText}

class LoginSteps extends ScalaDsl with EN {


  Given("""the user is on the Swag Labs login page""") { () =>
    println("User is on the Swag Labs login page")
  }

  When("""the user enters valid username and password""") { () =>
    inputUserName(userNameText)
    inputPassword(passwordText)
    println("User enters username and password")
  }

  And("""the user clicks the Login button""") { () =>
    buttonLogin()
    println("User clicks the Login button")
  }

  Then("""the user should be redirected to the Product Listing page""") { () =>
    verifyHeader()
    println("User is redirected to the Product Listing page")
  }
}