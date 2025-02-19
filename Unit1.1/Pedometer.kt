fun main() {
    // Pedometer
    val steps = 4000
    val caloriesBurned = PedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

// Pedometer functie
fun PedometerStepsToCalories(NumberOfSteps: Int): Double {
    val CaloriesBurnedForEachStep = 0.04
    val TotalCaloriesBurned = NumberOfSteps * CaloriesBurnedForEachStep
    return TotalCaloriesBurned
}