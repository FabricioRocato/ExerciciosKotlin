fun sheldonCooper(jogada1: String, jogada2: String): String {
    return when {
        jogada1 == jogada2 -> "Empate"
        jogada1 == "Pedra" && jogada2 == "Tesoura" || jogada1 == "Tesoura" && jogada2 == "Papel" || jogada1 == "Papel" && jogada2 == "Pedra" ||
                jogada1 == "Pedra" && jogada2 == "Lagarto" || jogada1 == "Lagarto" && jogada2 == "Spock" || jogada1 == "Spock" && jogada2 == "Tesoura" ||
                jogada1 == "Tesoura" && jogada2 == "Lagarto" || jogada1 == "Lagarto" && jogada2 == "Papel" || jogada1 == "Papel" && jogada2 == "Spock" ||
                jogada1 == "Spock" && jogada2 == "Pedra" || jogada1 == "Pedra" && jogada2 == "Tesoura" -> "Jogador 1 ganhou!"
        else -> "Jogador 2 ganhou!"
    }
}

fun cooperSheldon(jogada1: String, jogada2: String): String {
    return when {
        jogada1 == jogada2 -> "Empate"
        jogada1 == "Tesoura" && jogada2 == "Papel" || jogada1 == "Papel" && jogada2 == "Pedra" || jogada1 == "Pedra" && jogada2 == "Lagarto" ||
                jogada1 == "Lagarto" && jogada2 == "Spock" || jogada1 == "Spock" && jogada2 == "Tesoura" || jogada1 == "Tesoura" && jogada2 == "Lagarto" ||
                jogada1 == "Lagarto" && jogada2 == "Papel" || jogada1 == "Papel" && jogada2 == "Spock" || jogada1 == "Spock" && jogada2 == "Pedra" ||
                jogada1 == "Pedra" && jogada2 == "Tesoura" -> "Jogador 1 ganhou!"
        else -> "Jogador 2 ganhou!"
    }
}

fun main() {
    println("Escolha entre: Pedra, Papel, Tesoura, Lagarto ou Spock")
    print("Jogador 1: ")
    val jogada1 = readLine()!!.capitalize()
    print("Jogador 2: ")
    val jogada2 = readLine()!!.capitalize()
    println(cooperSheldon(jogada1, jogada2))
}