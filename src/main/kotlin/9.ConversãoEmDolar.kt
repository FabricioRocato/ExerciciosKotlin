fun main() {
    // solicita ao usuário a cotação do dólar
    print("Digite a cotação do dólar: ")
    val cotacaoDolar = readLine()?.toDoubleOrNull() ?: 0.0

    // solicita ao usuário a quantidade de reais disponível
    print("Digite a quantidade de reais disponível: ")
    val quantidadeReal = readLine()?.toDoubleOrNull() ?: 0.0

    // realiza a conversão do valor em real para dólar
    val valorDolar = quantidadeReal / cotacaoDolar

    // exibe o valor da conversão em dólar
    println("O valor em dólar é: US$ $valorDolar")
}
 