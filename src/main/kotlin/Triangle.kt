import kotlin.math.sqrt

open class Triangle(_name: String, _a: Double, _b: Double, _c: Double) : Shape(_name) {
    var a = _a;
    var b = _b;
    var c = _c;
    var s = (a + b + c) / 2 // semi perimeter

    override fun printDimensions() {
        println("triangle dimensions are ${this.a} ${this.b}, ${this.c}")
    }

    override fun setDimensions(vararg dimensions: Double) {
        this.a = dimensions[0]
        this.b = dimensions[1]
        this.c = dimensions[2]
        this.s = (a + b + c) / 2
    }

    override fun getArea(): Double {
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}