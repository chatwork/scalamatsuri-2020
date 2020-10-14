object Solver {
  def sovle(h: Int, w: Int, c: Array[Array[Char]]) = ???
}

object Main extends App {
	val pw = new java.io.PrintWriter(System.out)
  val sc = new java.util.Scanner(System.in)

	val h, w = sc.nextInt
  val c = Array.fill(h)(sc.nextLine.toCharArray)

	pw.println(Solver.solve(h, w, c))
	pw.flush()
}
