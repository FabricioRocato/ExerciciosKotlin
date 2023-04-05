fun main() {
    println("Digite o número inicial do intervalo:")
    val inicio = readLine()?.toInt() ?: return

    println("Digite o número final do intervalo:")
    val fim = readLine()?.toInt() ?: return

    if (fim <= inicio) {
        println("O número final deve ser maior que o número inicial!")
        return
    }

    fizzBuzz(inicio, fim)
}

fun fizzBuzz(inicio: Int, fim: Int) {
    for (i in inicio..fim) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            i == 0 -> println("0")
            else -> println(i)
        }
    }
}
