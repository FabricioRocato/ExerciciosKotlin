fun main() {

    print("Digite o valor da hora-aula: ")
    val valorHoraAula = readLine()!!.toDouble()

    print("Digite o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readLine()!!.toDouble()

    print("Digite o percentual de desconto do INSS: ")
    val percentualDesconto = readLine()!!.toDouble()

    val salarioBruto = valorHoraAula * horasTrabalhadas
    val desconto = salarioBruto * (percentualDesconto / 100)
    val salarioLiquido = salarioBruto - desconto

    println("Salário bruto: R$%.2f".format(salarioBruto))
    println("Desconto do INSS: R$%.2f".format(desconto))
    println("Salário líquido: R$%.2f".format(salarioLiquido))
}