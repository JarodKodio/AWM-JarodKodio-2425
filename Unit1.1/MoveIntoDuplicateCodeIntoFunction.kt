fun main() {
    // Move duplicate code into a function
    println(weatherDisplay("Brussels",10,20,99))
}

// Move duplicate into a function
fun weatherDisplay(city : String, lowTemperature : Int, highTemperature : Int, chance : Int) : String {
    val message = "$city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $chance %"
    return message
}