fun main() {
    // solicita ao usuário os valores do comprimento, largura e altura da caixa
    print("Digite o valor do comprimento da caixa: ")
    val comprimento = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o valor da largura da caixa: ")
    val largura = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o valor da altura da caixa: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    // calcula o valor do volume da caixa
    val volume = comprimento * largura * altura

    // exibe o valor do volume da caixa
    println("O valor do volume da caixa é: $volume")
}