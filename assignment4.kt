fun convertCelsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9/5) + 32
}

fun calculateCompoundInterest(principal: Double, rate: Double, time: Double): Double {
    return principal * Math.pow((1 + rate / 100), time)
}

fun main() {
    // Celsius to Fahrenheit
    val fahrenheit = convertCelsiusToFahrenheit(25.0)
    println("25°C = $fahrenheit°F")

    // Compound Interest
    val amount = calculateCompoundInterest(10000.0, 10.0, 2.0)
    println("Compound Interest Amount = $amount")
}