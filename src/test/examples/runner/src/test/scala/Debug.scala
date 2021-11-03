import java.nio.file.{Files, Paths, StandardOpenOption}

object Debug {
  def apply(str: String) {
    Files.write(Paths.get("/home/borys/myfile.txt"), s"$str\n".getBytes(), StandardOpenOption.APPEND);
  }
}