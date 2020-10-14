object Solver {
  def solve(n: Long): String = ???
}

object Main extends App {
	val pw = new java.io.PrintWriter(System.out)
  val sc = new java.util.Scanner(System.in)

  val n  = sc.nextLong

  pw.println(Solver.solve(n))
  pw.flush()
}
