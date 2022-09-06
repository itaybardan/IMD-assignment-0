fun main(args: Array<String>) {
    val c1: Shape = Circle("c1", 3.0)
    val t1: Shape = Triangle("t1", 5.0, 3.0, 4.0)
    val s1: Shape = Square("s1", 10.0, 20.0)
    c1.print()
    t1.print()
    s1.print()
}