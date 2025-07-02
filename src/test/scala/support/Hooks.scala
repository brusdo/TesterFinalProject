package support

import io.cucumber.scala.{EN, ScalaDsl, Scenario}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import utils.ConfigReader
import utils.ScreenCapture.takeScreenshot
import ExtentManager._

class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()
  options.addArguments("--headless=new")

  Before {
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver(options)
    DriverManager.driver.manage().window().maximize()
    DriverManager.driver.get(ConfigReader.get("base.url"))
    scenario: Scenario =>
      println(s"Starting scenario: ${scenario.getName}")
      currentTest = Some(extent.createTest(scenario.getName))
  }

  After {
    scenario: Scenario =>


      println(s"Finishing scenario: ${scenario.getName}")
      if (scenario.isFailed) {
        currentTest.foreach(_.fail("Scenario failed"))
        val screenshotPath = takeScreenshot(DriverManager.driver, scenario.getName)
        currentTest.foreach(_.addScreenCaptureFromPath("../" + screenshotPath, "Screenshot"))
      } else
        currentTest.foreach(_.pass("Scenario passed"))

      extent.flush()

      println("Closing browser after scenario...")
      DriverManager.driver.quit()
  }

}
