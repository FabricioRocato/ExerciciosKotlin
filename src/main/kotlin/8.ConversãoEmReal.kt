fun main() {
    // solicita ao usuário a cotação do dólar
    print("Digite a cotação do dólar: ")
    val cotacaoDolar = readLine()?.toDoubleOrNull() ?: 0.0

    // solicita ao usuário a quantidade de dólares disponível
    print("Digite a quantidade de dólares disponível: ")
    val quantidadeDolar = readLine()?.toDoubleOrNull() ?: 0.0

    // realiza a conversão do valor em dólar para real
    val valorReal = cotacaoDolar * quantidadeDolar

    println("O valor em real é: R$ $valorReal")
}
