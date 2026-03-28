fun main() {
    // below is a function that iis able to add two numbers 
    fun addition () {
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2

        println("The sum of the number is : $sum")
    }
    addition()


    // create a function that is able to multiply three numbers
    fun multiplication () {
        val num1 = 9 
        val num2 = 5 
        val num3 =  7
        val product = num1 * num2 * num3

        println("this is the product: $product")
    }
    multiplication()

    // given two numbers, create a function that is able to find the largest and the smallest of the  numbers 
    fun main() {

    // function to find largest and smallest (same style as multiplication)
    fun findLargestAndSmallest() {
        val num1 = 12
        val num2 = 8

        val largest = maxOf(num1, num2)
        val smallest = minOf(num1, num2)

        println("Largest number is: $largest")
        println("Smallest number is: $smallest")
    }

    findLargestAndSmallest()
}

    // given 179 mins create  a function that is able to convert the said minutes into hours and to show the remeinder 

    fun convertMinutes() {
        val minutes = 179

        val hours = minutes / 60
        val remainder = minutes % 60

        println("Hours: $hours")
        println("Remaining minutes: $remainder")
    }

    convertMinutes()
}
