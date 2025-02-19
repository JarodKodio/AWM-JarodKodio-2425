fun main() {
    // Compare two numbers
    println(CompareTwoNumbers(300,250))
    println(CompareTwoNumbers(300,300))
    println(CompareTwoNumbers(200,220))
}

// Compare two numbers functie
fun CompareTwoNumbers(tijdVandaag :Int, tijdGisteren : Int): Boolean {
    if (tijdVandaag > tijdGisteren) {
        return true
    } else {
        return false
    }
}