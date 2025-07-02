package utils

import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}
import org.openqa.selenium.io.FileHandler

import java.text.SimpleDateFormat
import java.util.Date
import java.io.File

object ScreenCapture {

  def takeScreenshot(driver: WebDriver, fileName: String): String = {

    val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
    val screenShotDir = new File("target/screenshots")
    if (!screenShotDir.exists())
      screenShotDir.mkdir()
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    val fullFileName: File = new File(screenShotDir, s"$fileName-$timeStamp.png")
    FileHandler.copy(srcTimestamp, fullFileName)
    fullFileName.getPath

  }
}
