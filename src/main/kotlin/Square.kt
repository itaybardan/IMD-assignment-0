class Square(name: String, _width: Double, _height: Double) : Shape(name) {
    private var width = _width
    private var height = _height

    override fun printDimensions() {
        println("square's dimensions is ${this.width} ${this.height}")
    }

    override fun setDimensions(vararg dimensions: Double) {
        this.width = dimensions[0]
        this.height = dimensions[1]
    }
    override fun getArea(): Double {
        return width * height
    }

}