abstract class Shape(_name: String) : Dimensionable {
    var name = _name

    abstract fun getArea(): Double
    fun print() {
        println("name is ${this.name}")
        println("area is ${getArea()}")
        printDimensions()
    }
}