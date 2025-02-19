fun main() {
    // Implement baisc math operations
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val resultaAdd = add(firstNumber, secondNumber)
    val anotherResultAdd = add(firstNumber, thirdNumber)
    val resultSub = substract(firstNumber, secondNumber)
    val anotherResultSub = substract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $resultaAdd")
    println("$firstNumber + $thirdNumber = $anotherResultAdd")
    println("$firstNumber - $secondNumber = $resultSub")
    println("$firstNumber - $thirdNumber = $anotherResultSub")
}
// Add functie
fun add(getal1 :Int, getal2 :Int) : Int {
    return getal1 + getal2
}
// Substract functie
fun substract(getal1 :Int, getal2 :Int) : Int {
    return getal1 - getal2
}