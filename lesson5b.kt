// Circle class
class Circle {
    // properties
    var radius = 7
    var pie = 3.142

    // behaviours
    fun circleArea() {
        val areaOfCircle = pie * radius * radius
        println("the area of the circle is: " + areaOfCircle)
    }

    fun circleCircumference() {
        val circumference = 2 * pie * radius
        println("the circumference of the circle is: " + circumference)
    }
}

// Rectangle class
class Rectangle {
    // properties
    var length = 10
    var width = 15

    // behaviours
    fun rectangleArea() {
        val area = length * width
        println("the area of the rectangle is: " + area)
    }

    fun rectanglePerimeter() {
        val perimeter = 2 * length + width
        println("the perimeter of the rectangle is: " + perimeter)
    }
}

// main function (entry point)
fun main() {
    // Circle object
    var myCircle = Circle()
    myCircle.circleArea()
    myCircle.circleCircumference()

    println("----------------------")

    // Rectangle object
    var myRectangle = Rectangle()
    myRectangle.rectangleArea()
    myRectangle.rectanglePerimeter()
}