fun main(args: Array<String>) {
    println("Enter the dimensions to all shapes one by one")
    val c1: Shape = Circle("c1", readLine()?.toDouble() ?: 0.0)
    val t1: Shape = Triangle("t1", readLine()?.toDouble() ?: 0.0, readLine()?.toDouble() ?: 0.0, readLine()?.toDouble() ?: 0.0)
    val s1: Shape = Square("s1", readLine()?.toDouble() ?: 0.0, readLine()?.toDouble() ?: 0.0)
    c1.print()
    t1.print()
    s1.print()
}