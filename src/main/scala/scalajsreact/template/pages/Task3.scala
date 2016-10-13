package scalajsreact.template.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object Header {
  case class Props(name: String)

  val component = ReactComponentB[Props]("Header").render_P { p =>
    <.span(s"Hei på deg, ${p.name}")
  }.build

  def apply(p: Props) = component(p)
}

object Task3 {
  def apply() = Header(Header.Props("Marius"))
}
