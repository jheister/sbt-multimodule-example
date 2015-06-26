package example.sbtmultimodule

object StuffInC extends App {
  println("In C: " + TheSharedStuffFromB.stuff)
}
