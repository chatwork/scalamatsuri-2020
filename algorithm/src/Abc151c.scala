object Solver {
  def solve(n: Int, m: Int): String = ???
}

object Main extends App {
	val pw = new java.io.PrintWriter(System.out)
	val sc = new java.util.Scanner(System.in)

	val n, m = sc.nextInt

  pw.println(Solver.solve(n, m))
  pw.flush()
}
