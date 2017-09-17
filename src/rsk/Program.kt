package rsk

fun main(args: Array<String>) {
    val program = Program()
    var total = 0

    program.fibonacci(8, ::println)

    program.fibonacci(8, {it -> total += it})
    println("total: $total")

    program.fibonacci(8) { s -> println(s) }
}

class Program {
    fun fibonacci(limit: Int, func: (Int) -> Unit) {
        var current = 1
        var previous = 0
        var temp = 0

        for (i: Int in 1..limit) {
            func(current)

            temp = current
            current += previous
            previous = temp
        }
    }
}
