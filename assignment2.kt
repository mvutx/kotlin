//1. Using if statements or when statement, create a program to find if given year is leap or not 
//2. Using if statements check if a given number is ODD or Even

// 1
fun main() {
    val year = 2024

    // Using if-else
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }

    // Using when statement
    when {
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) -> println("$year is a leap year")
        else -> println("$year is not a leap year")
    }
}

//2
fun main() {
    val number = 15

    if (number % 2 == 0) {
        println("$number is Even")
    } else {
        println("$number is Odd")
    }
}