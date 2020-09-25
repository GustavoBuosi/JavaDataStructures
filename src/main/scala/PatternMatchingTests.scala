object PatternMatchingTests extends App {

  val test = "abc"

  val a = test match {
    case a if List("abc","cde").contains(test) => "ok"
  }

}
