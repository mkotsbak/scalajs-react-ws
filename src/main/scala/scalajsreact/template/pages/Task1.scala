package scalajsreact.template.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object Task1 {

  val component = ReactComponentB.static("Test", <.div("Hei på deg")).buildU

  def apply() = component()
}
