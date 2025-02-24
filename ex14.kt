fun main (){
    println("Digite seu salario atual: ")
    val salario = readln().toDouble()

    val salario2 = salario*1.15
    val salarioF = String.format("%.2f", salario2)

    println("Seu salario com aumento $salarioF")

}