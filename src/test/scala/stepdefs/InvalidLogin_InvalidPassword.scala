package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.LoginPage.{inputPassword, inputUserName}
import testdata.Data.{invalidPasswordText, userNameText}

class InvalidLogin_InvalidPassword extends ScalaDsl with EN{

  When("""the user enters a valid username"""){ () =>
    inputUserName(userNameText)
    println("User entered valid username")
  }
  And("""the user enters an invalid password"""){ () =>
    inputPassword(invalidPasswordText)
    println("User entered invalid password.")
  }


}
