import org.scalatest.FunSuite

class MySpec extends FunSuite {
  test("bob") {
    println("__bob__")
    Debug("__bob__")
  }
  test("rita") {
    println("__rita__")
    Debug("__rita__")
  }
}