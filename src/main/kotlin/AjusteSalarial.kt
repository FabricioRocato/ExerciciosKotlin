package main.kotlin

fun main() {
    print("Digite o salário mensal do trabalhador: ")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o percentual de reajuste a ser aplicado: ")
    val percentualReajuste = readLine()?.toDoubleOrNull() ?: 0.0

    val novoSalario = salario * (1 + (percentualReajuste / 100))

    println("O novo salário é R\$ %.2f".format(novoSalario))
}