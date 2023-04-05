fun main() {
    // solicita ao usuário os três valores inteiros
    print("Digite o primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull() ?: 0

    print("Digite o segundo valor: ")
    val valor2 = readLine()?.toIntOrNull() ?: 0

    print("Digite o terceiro valor: ")
    val valor3 = readLine()?.toIntOrNull() ?: 0

    // calcula o quadrado da soma dos três valores
    val soma = valor1 + valor2 + valor3
    val quadradoSoma = soma * soma

    // exibe o resultado na tela
    println("O quadrado da soma dos três valores é: $quadradoSoma")
}
