fun main() {
    // for loop 
    // it is used to execute a block of odes/statements a number of times until a condition is met

    for(number in 1 .. 10){
        println("the count is: $number")
    }

    println("==========")

    // create a for loop that is able to print from 50 to 65

    for (num in 50 .. 65 ){
        println("the count is: $num")
    }
    println("==========")
 // research on how to increment on the for loop by use of steps

 for(x in 20 .. 40 ){
    if (x % 2 != 0){
        println(x)
    }
 }
     println("==========")
     

      // By use of a for loop, generate the multiplication table for 5 from 1 to 5.
   for(n in 1 .. 5) {
    val prod = n * 5
    println("5 * $n = $prod")
   }  

   println("==========")
   //create a program that is able to find the factorial of number 5

   var factorial = 1
   for (n in 1 .. 5) {
    factorial *= n
    println(factorial)
   }
   println("Factorial of 5 is $factorial")


}
// check on the diff btwn local  variables and global variables

 