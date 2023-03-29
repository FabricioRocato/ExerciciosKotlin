fun main(){

    print("Hello and welcome to TwoFer! Please type in your name: ");

    var name = pegaNome()
    print(name)
}

    fun pegaNome() : String {
        var nome = readLine();
        return "One for $nome, one for me! ";
    }