fun main() {
    // solicita ao usuário os três valores inteiros
    print("Digite o primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull() ?: 0

    print("Digite o segundo valor: ")
    val valor2 = readLine()?.toIntOrNull() ?: 0

    print("Digite o terceiro valor: ")
    val valor3 = readLine()?.toIntOrNull() ?: 0

    // calcula a soma dos quadrados dos três valores
    val somaQuadrados = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3)

    // exibe o resultado na tela
    println("A soma dos quadrados dos três valores é: $somaQuadrados")
}
