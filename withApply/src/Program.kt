import java.time.LocalDate
import java.util.*

class Meeting(var Title: String, var When: LocalDate, var Who: List<String>) {
    fun create() { println(Title) }
}

fun main(args: Array<String>) {
    val m = Meeting("Board Meeting", LocalDate.of(2017, 1, 1), mutableListOf("Kevin"))

    with(m) {
        println(Who)
    }

    m.apply {
        Title = "Bored Meeting"
        When = LocalDate.now()
        Who = mutableListOf("John")
    }.create()
}