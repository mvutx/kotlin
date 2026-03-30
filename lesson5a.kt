// Define the class
class Person {
    // properties (attributes)
    var name = "Kivuti"
    var age = 45

    // behaviours (methods)
    fun walk() {
        println("The person can walk")
    }

    fun speak() {
        println("The person can speak")
    }

    fun run() {
        println("The person can run")
    }
}

// Main function (entry point)
fun main() {
    // create object
    val myObject = Person()

    // access methods
    myObject.walk()
    myObject.run()

    // access property
    println("The age of the person is: " + myObject.age)
}