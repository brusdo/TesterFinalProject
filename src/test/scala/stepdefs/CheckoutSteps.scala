package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.CartPage.{clickCheckoutButton, getCartItemsCount, verifyCartHasItems}
import pages.CheckoutPage.verifyPersonalInformationFields
import pages.ProductListingPage.{addBackpackToCart, navigateToCart}
import pages.CheckoutPage.{verifyPersonalInformationFields, verifyCheckoutPageTitle => verifyCheckoutTitle}


class CheckoutSteps extends ScalaDsl with EN {
  Given("""^the user adds items to their cart$""") { () =>
    addBackpackToCart()
    println("Added Sauce Labs Backpack to cart")
  }

  And("""^the user navigates to the cart page$""") { () =>
    navigateToCart()
    println("Navigated to cart page")
  }

  And("""^the user verifies they have 1 or more items in my cart$""") { () =>
    verifyCartHasItems()
    val itemCount = getCartItemsCount()
    println(s"Verified cart has $itemCount item(s)")
  }

  When("""^the user clicks the "Checkout" button on the cart page$""") { () =>
    clickCheckoutButton()
    println("Clicked Checkout button")
  }

  Then("""^the user is prompted to enter their personal information$""") { () =>
    verifyPersonalInformationFields()
    println("Verified personal information fields are displayed")
  }

  And("""^the user should be on the checkout page$""") { () =>
    verifyCheckoutTitle()
    println("Verified user is on checkout page")
  }
}