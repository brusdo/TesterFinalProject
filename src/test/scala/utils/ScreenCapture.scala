package utils

import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}
import org.openqa.selenium.io.FileHandler

import java.text.SimpleDateFormat
import java.util.Date
import java.io.File

object ScreenCapture {

  def takeScreenshot_Project(driver: WebDriver, fileName: String): Unit = {

    val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
    val screenShotDir = new File(System.getProperty("user.home") + "/Desktop/ScreenShots")
    if (!screenShotDir.exists())
      screenShotDir.mkdir()
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcTimestamp, new File(s"$screenShotDir/$fileName-$timeStamp.png"))

  }
}
