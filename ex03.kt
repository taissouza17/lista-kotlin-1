fun main() {
    println("Digite o nome do funcionario:")
    val nome = readln()

    println("Digite o salario: ")
    val salario = readln().toDouble()
    val format = String.format("%.2f", salario)

    println("O funcionario $nome, tem um salário de $format em junho!  ")
}