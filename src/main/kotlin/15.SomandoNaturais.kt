fun main() {
    val inicio = 1
    val fim = 100
    var soma = 0

    println("Intervalo: $inicio a $fim")

    for (i in inicio..fim) {
        soma += i
    }

    println("Soma: $soma")
}
