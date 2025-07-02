package support

// ExtentManager.scala
import com.aventstack.extentreports._
import com.aventstack.extentreports.reporter.ExtentSparkReporter

object ExtentManager {
  private val reporter = new ExtentSparkReporter("target/extent-report.html")
  val extent: ExtentReports = new ExtentReports()
  extent.attachReporter(reporter)

  // Holds the current scenario's test instance
  var currentTest: Option[ExtentTest] = None
}

