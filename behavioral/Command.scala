object Invoker {
  private var history: Seq[() => Unit] = Seq.empty

  def invoke(command: => Unit) { // by-name parameter
    command
    history :+= command _
  }
}

Invoker.invoke(println("foo"))
  
Invoker.invoke {
  println("bar 1")
  println("bar 2")
}
