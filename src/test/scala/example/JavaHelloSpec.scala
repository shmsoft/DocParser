package example

import org.scalatest._

class JavaHelloSpec extends FlatSpec with Matchers {
  "The JavaHello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
    JavaHello.main(new Array[String](1));
  }
}
