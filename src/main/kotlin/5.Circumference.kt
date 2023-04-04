fun main() {
    val PI = 3.14159265
    var raio: Double
    var area: Double

    println("Digite o valor do raio da circunferência:")
    raio = readLine()!!.toDouble()

    area = PI * raio * raio

    println("A área da circunferência é: $area")
}