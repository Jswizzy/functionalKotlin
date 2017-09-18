fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)

    //val smallInts =
    ints
            .filter { it < 4 }

    //ints.map { it * it }.forEach { println("Square of $it") }

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    meetings
            .filter { it.title.startsWith("C") }
            .map { it.title }
            .forEach { println(it) }
}

class Meeting(val id: Int, val title: String)