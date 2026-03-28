fun main() {
    // functions with parameters 
    // these are inputs that are passed as arguments on invoking a function 
    // NOTE : for parameters to work we must specify their data types 

    fun greeting(name: String){
        println("Hello $name , Hope you had a good day")
    }
    // on invoking the function  you pass the name as an argument 
    greeting("james")
    greeting("John")

    print("==========")

    //below is an example of a function that is able to calculate the bmi of someone 
    fun BMI (weight : Double, height : Double){
        val answer = weight / (height * height)
        println("the BMI s :" + answer)
    }
    BMI(69.5, 1.732)
    BMI(58.6, 1.87)

    // create a function that acceptsand chckswhether a given number is odd or even 

    // Function to check if a number is odd or even
    fun checkOddOrEven(number: Int) {
        if (number % 2 == 0) {
            println("The number $number is even")
        } else {
            println("The number $number is odd")
        }
    }

    // Invoking the function with sample numbers
    checkOddOrEven(15)
    checkOddOrEven(28)

    // create a function that accepts parameter that is able to do conversion of degree celcius into farenheight

    // create a function that is able to calculate the compound interest of a person 

    //research on inheritance in kotlin .come up with an example of a programm 
}