import kotlin.math.pow

class Circle(_name: String, _radius: Double) : Shape(_name) {

    private var radius: Double = _radius

    override fun printDimensions() {
        println("circle's radius is ${this.radius} ")
    }

    override fun setDimensions(vararg dimensions: Double) {
        this.radius = dimensions[0];
    }

    override fun getArea(): Double {
        return radius.pow(2.0) * Math.PI
    }
}