object Main extends App {
	val pw = new java.io.PrintWriter(System.out)
  val sc = new java.util.Scanner(System.in)

	val Array(h, w) = io.StdIn.readLine().split(' ').map(_.toInt)
  val c = Array.fill(h)(sc.nextLine.toCharArray)

  def sovle = ???

	pw.println(solve)
	pw.flush()
}
