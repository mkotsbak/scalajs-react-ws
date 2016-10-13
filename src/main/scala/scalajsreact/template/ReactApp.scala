package scalajsreact.template

import japgolly.scalajs.react._
import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalajsreact.template.pages.Task3

@JSExport
object ReactApp extends JSApp {

  @JSExport
  override def main(): Unit = {
    ReactDOM.render(Task3(), dom.document.getElementById("my-app"))
  }
}

