object Main extends App {
	val pw = new java.io.PrintWriter(System.out)
	val sc = new java.util.Scanner(System.in)

	val n, m = sc.nextInt

  val ps = (1 to m).foldLeft(Map.empty[Int, Vector[String]]) { case (acc, _) =>
    val p = sc.nextInt
    val s = sc.next
    acc.updated(p, acc.getOrElse(p, Vector.empty[String]) ++ Vector(s))
  }

  def solve = ???

  pw.println(solve)
  pw.flush()
}
