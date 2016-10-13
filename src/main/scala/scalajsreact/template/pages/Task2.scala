package scalajsreact.template.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object Task2 {

  val component = ReactComponentB.static("Test", <.span("på deg")).buildU

  val header = ReactComponentB.static("Header",
    <.div(
      <.span("Hei"),
      component()
      )
  ).buildU

  def apply() = header()
}
