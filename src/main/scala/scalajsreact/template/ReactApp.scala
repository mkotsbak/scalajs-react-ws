package scalajsreact.template

import japgolly.scalajs.react._
import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalajsreact.template.pages.Task1

@JSExport
object ReactApp extends JSApp {

  @JSExport
  override def main(): Unit = {
    ReactDOM.render(Task1(), dom.document.getElementById("my-app"))
  }
}

