// inheritance is whereby aa child obtains behaviours of another class (Parent Class)

open class Animal {
    // properties 
    var name = "Name"

    fun walk() {
        println("the animal can walk")
    }
    fun sleep() {
        println("the animal can sleep")

    }
}
// below class inherits from the parent 
class Dog : Animal() {
    fun bark() {
        println("the dog barks")
    }
}

fun main (){
    // create an object
    var myDog = Dog()

    // accessing the behaviours of a dog 
    myDog.bark()
    myDog.sleep()
}