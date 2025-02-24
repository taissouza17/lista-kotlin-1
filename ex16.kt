/**Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
hora trabalhada.**/

fun main (){
    println("Digite Total de dias trabalhados: ")
    val dias = readln().toInt()
    val horas = 25* 8
    val total = dias* horas
    println("$dias dia recebe R$$total")
}