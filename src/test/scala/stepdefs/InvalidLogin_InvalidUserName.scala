package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.LoginPage.{inputPassword, inputUserName}
import testdata.Data.{invalidUserNameText, passwordText}

class InvalidLogin_InvalidUserName extends ScalaDsl with EN{

  When("""the user enters an invalid username"""){ () =>
    inputUserName(invalidUserNameText)
    println("User entered invalid username.")
  }

  And("""the user enters a valid password"""){ () =>
    inputPassword(passwordText)
    println("User entered valid password.")
  }

}
