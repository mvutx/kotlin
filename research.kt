// animal system 
// Parent class
open class Animal(val name: String) {

    open fun makeSound() {
        println("$name makes a sound")
    }

    fun sleep() {
        println("$name is sleeping")
    }
}

// Child class 1
class Dog(name: String) : Animal(name) {

    override fun makeSound() {
        println("$name barks")
    }
}

// Child class 2
class Cat(name: String) : Animal(name) {

    override fun makeSound() {
        println("$name meows")
    }
}

// Main function
fun main() {
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    dog.makeSound()
    dog.sleep()

    cat.makeSound()
    cat.sleep()
}