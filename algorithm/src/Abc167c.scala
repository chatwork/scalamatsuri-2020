object Solver {
  def solve(n: Int, m: Int, x: Int): String = ???
}

object Main extends App {
	val pw = new java.io.PrintWriter(System.out)
  val sc = new java.util.Scanner(System.in)

	val n, m, x = sc.nextInt

	pw.println(Solver.solve(n, m, x))
	pw.flush()
}
