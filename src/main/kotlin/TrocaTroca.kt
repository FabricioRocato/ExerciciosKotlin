package main.kotlin

fun main(){

    print("Welcome to TRADE, please type in a digit for one to ten: ")
    val valorUm = readln();
    print("Please type in a second number: ")
    val valorDois = readln();

    println("First number was $valorUm and second number was $valorDois")

    val invertido = Trade(valorUm,valorDois)
    print(invertido)
}

fun Trade(valorUm: String, valorDois: String) : String {

    val valorAux = valorUm;
    val valorUm = valorDois;
    val valorDois = valorAux;

    return "First number now is $valorUm and the second number is $valorDois"
}