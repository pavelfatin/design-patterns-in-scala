trait Animal
private class Dog extends Animal
private class Cat extends Animal

object Animal {
  def apply(kind: String) = kind match {
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}

Animal("dog")
