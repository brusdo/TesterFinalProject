package support

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import utils.ConfigReader


class Hooks extends  ScalaDsl with EN {

  val options = new ChromeOptions()
  options.addArguments("--headless=new")

  Before {
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver(options)
    DriverManager.driver.manage().window().maximize()
    DriverManager.driver.get(ConfigReader.get("base.url"))
  }

  After  {


    println("Closing browser after scenario...")
    DriverManager.driver.quit()
  }

}
