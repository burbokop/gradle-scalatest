import java.nio.file.{Files, Paths, StandardOpenOption}

object MyRunner {



  def main(args: Array[String]): Unit = {
    Debug("__GGG BEFORE TESTS__")
    println("GGG BEFORE TESTS")

    org.scalatest.tools.Runner.main(args)

    Debug("__GGG AFTER TESTS__")
    println("GGG AFTER TESTS")
  }
}
