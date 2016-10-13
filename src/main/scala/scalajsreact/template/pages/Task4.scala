package scalajsreact.template.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajsreact.template.pages.MovieList.Movie

object Header {
  case class Props(name: String)

  val component = ReactComponentB[Props]("Header").render_P { p =>
    <.span(s"Hei på deg, ${p.name}")
  }.build

  def apply(p: Props) = component(p)
}

object MovieList {
  case class Movie(movieName: String, releaseYear: Int)

  val movieComponent = ReactComponentB[Movie]("Movie").render_P { p =>
    <.div(s"${p.movieName} (${p.releaseYear})")
  }.build

  val component = ReactComponentB[List[Movie]]("Movies").render_P { p =>
    <.ul(
      p.map { movie =>
        <.li(
          movieComponent(movie)
        )
      })
  }.build

  def apply(movies: List[Movie]) = component(movies)
}

object Task4 {
  val mainComponent = ReactComponentB.static("Task4",
    <.div(
      Header(Header.Props("Marius")),
      MovieList(
        List(
          Movie("Gudfaren", 1972),
          Movie(movieName = "Frihetens regn", releaseYear = 1994)
        )
      )
    )
  ).buildU

  def apply() = mainComponent()
}
