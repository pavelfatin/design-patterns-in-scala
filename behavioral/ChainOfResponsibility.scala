case class Event(source: String)

type EventHandler = PartialFunction[Event, Unit]

val defaultHandler: EventHandler = PartialFunction(_ => ())

val keyboardHandler: EventHandler = {
  case Event("keyboard") => /* ... */
}

def mouseHandler(delay: Int): EventHandler = {
  case Event("mouse") => /* ... */
}

keyboardHandler.orElse(mouseHandler(100)).orElse(defaultHandler)
