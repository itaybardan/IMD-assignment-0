class EquilateralTriangle(_name: String, _a: Double) : Triangle(_name, _a, _a, _a) {
    override fun printDimensions() {
        println("triangle dimensions are ${this.a} ${this.b}, ${this.c}")
    }
}