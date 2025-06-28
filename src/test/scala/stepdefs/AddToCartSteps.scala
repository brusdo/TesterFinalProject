package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import pages.CartPage.verifyItemInCart
import pages.HeaderPage.{buttonMenu, logOut}
import pages.ProductListingPage.{addBackpackToCart, getCartBadgeCount, navigateToCart, verifyHeader}


class AddToCartSteps extends ScalaDsl with EN {

  Given("""the user is on the products page""") { () =>
  }

  When("""the user clicks on "Add to cart" for a product""") { () =>
    addBackpackToCart()
  }

  Then("""the shopping cart icon will display "1" inside a red circle""") { () =>
    val badgeCount = getCartBadgeCount()
    badgeCount shouldBe 1
  }

  And("""the product will appear in the "Your Cart" page""") { () =>
    navigateToCart()
    verifyItemInCart("Sauce Labs Backpack")
  }


}