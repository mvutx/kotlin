fun main() {

    // ============================
    // Assignment 3: Array of 7 counties using for loop
    // ============================
    val counties = Array(7) { "" } // create empty array of size 7

    // Fill the array with county names using for loop
    for (i in counties.indices) {
        counties[i] = "County ${i + 1}"
    }

    // Loop through the array and print each county
    println("List of 7 counties:")
    for (i in counties.indices) {
        println(counties[i])
    }
    println("=======")

    // Assignment 1: For loop to print years from 2000 to 2025
    println("Years from 2000 to 2025:")
    for (year in 2000..2025) {
        println(year)
    }
    println("===========")

    // Assignment 2: For loop to print from 100 to 1
    println("Numbers from 100 to 1:")
    for (num in 100 downTo 1) {
        println(num)
    }
    println("==============")
    // Assignment 3 (while loop): Print from -20 to +20
    println("Numbers from -20 to 20:")
    var num = -20
    while (num <= 20) {
        println(num)
        num++
    }
    println("===========")


    // Assignment 4 (while loop): Print all EVEN years from 2000 to 2025
    println("Even years from 2000 to 2025:")
    var year = 2000
    while (year <= 2025) {
        if (year % 2 == 0) {
            println(year)
        }
        year++
    }
}