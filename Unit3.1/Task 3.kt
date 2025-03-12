val events = mutableListOf(
    Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
    Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
    Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
    Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
    Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
    Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
    Event(title = "Read Kotlin documentation", daypart = Daypart.EVENING, durationInMinutes = 20)
)
fun main() {
   println(events)
}