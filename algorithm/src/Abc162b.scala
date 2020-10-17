object Main extends App {
  val pw = new java.io.PrintWriter(System.out)
  val sc = new java.util.Scanner(System.in)

  val n  = sc.nextLong

  def solve = (1L to n).filter { i =>
    i % 3 != 0 && i % 5 != 0
  }.sum

  pw.println(solve)
  pw.flush()
}
