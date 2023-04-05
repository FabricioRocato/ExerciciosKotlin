fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()

    print("Digite a quarta nota: ")
    val nota4 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >= 5) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    println("Média obtida: $media")
}
