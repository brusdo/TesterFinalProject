package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.LoginPage.{browserLaunch, buttonLogin, inputPassword, inputUserName}
import testdata.Data.{passwordText, userNameText}

class LoginSteps extends ScalaDsl with EN {


  Given("""the user is on the Swag Labs login page""") { () =>
    browserLaunch()
  }

  When("""the user enters valid username and password""") { () =>
    inputUserName(userNameText)
    inputPassword(passwordText)
  }

  And("""the user clicks the Login button""") { () =>
    buttonLogin()
  }

  Then("""the user should be redirected to the Product Listing page""") { () =>
  }
}