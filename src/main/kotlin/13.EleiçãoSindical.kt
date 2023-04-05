fun main() {
    // solicita a quantidade de votos válidos para cada candidato, votos nulos e em branco
    print("Digite a quantidade de votos válidos para o candidato A: ")
    val votosA = readLine()?.toIntOrNull() ?: 0

    print("Digite a quantidade de votos válidos para o candidato B: ")
    val votosB = readLine()?.toIntOrNull() ?: 0

    print("Digite a quantidade de votos válidos para o candidato C: ")
    val votosC = readLine()?.toIntOrNull() ?: 0

    print("Digite a quantidade de votos nulos: ")
    val votosNulos = readLine()?.toIntOrNull() ?: 0

    print("Digite a quantidade de votos em branco: ")
    val votosBranco = readLine()?.toIntOrNull() ?: 0

    // calcula o número total de eleitores
    val totalEleitores = votosA + votosB + votosC + votosNulos + votosBranco

    // exibe o resultado na tela
    println("Número total de eleitores: $totalEleitores")
    println("Percentual de votos válidos em relação à quantidade de eleitores: ${(votosA + votosB + votosC) * 100.0 / totalEleitores}%")
    println("Percentual de votos válidos do candidato A em relação à quantidade de eleitores: ${votosA * 100.0 / totalEleitores}%")
    println("Percentual de votos válidos do candidato B em relação à quantidade de eleitores: ${votosB * 100.0 / totalEleitores}%")
    println("Percentual de votos válidos do candidato C em relação à quantidade de eleitores: ${votosC * 100.0 / totalEleitores}%")
    println("Percentual de votos nulos em relação à quantidade de eleitores: ${votosNulos * 100.0 / totalEleitores}%")
    println("Percentual de votos em branco em relação à quantidade de eleitores: ${votosBranco * 100.0 / totalEleitores}%")
}
