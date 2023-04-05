fun main() {
    // solicita ao usuário a distância em quilômetros e o tempo em minutos
    print("Digite a distância percorrida em quilômetros: ")
    val distancia = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o tempo gasto em minutos: ")
    val tempo = readLine()?.toDoubleOrNull() ?: 0.0

    // calcula a velocidade em metros por segundo
    val velocidade = (distancia * 1000) / (tempo * 60)

    // exibe o resultado na tela
    println("A velocidade do projétil é de $velocidade metros por segundo.")
}
