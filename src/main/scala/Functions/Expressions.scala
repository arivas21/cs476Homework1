package Functions


object Expressions extends App {

  case class Scope1(x: Int, y: Int)

  case class Scope2(x: Int, y: Int)

  case class Scope3(x: Int, y: Int)

  case class Macros(x: Int, y: Int)

  object Scope1 {
    def add(x: Int, y: Int): Unit ={
      var result = x + y
      println(result)

    }

  }

  object Scope2 {
    def subtract(x: Int, y: Int): Unit ={
      var result = x - y
      println(result)
    }
  }

  object Scope3 {
    def multiply(x: Int, y: Int): Unit ={
      var result = x * y
      println(result)
    }
  }

  object Macros {
    def area(l: Int, w: Int): Unit ={
      var result = l * w
      println(result)
    }
  }



  println(Scope1.add(5, 4))
  println(Scope2.subtract(20, 8))
  println(Scope3.multiply(60, 4))
  println(Macros.area(40, 5))



}


