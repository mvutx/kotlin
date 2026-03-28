fun main() {
    // functions are blocks of statements that perform a given task 
    // it is introduced by the use of the fun keyword followed by the name of the function , parenthesis and the body of the function come last which is introduced by use of curlybraces

    fun sayHello () {
        println("Hello there, Hope you are having a good day")
    }
    // below we invoke our function
    sayHello()

    // create your own example of a function and invoke it 

    fun checkEvenOdd(number: Int) {
        if (number % 2 == 0) {
            println("$number is an even number")
        } else {
            println("$number is an odd number")
        }
    }

    // invoking the function
    checkEvenOdd(7)
    checkEvenOdd(10)
}