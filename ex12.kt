import kotlin.math.pow

/**
12 Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
equação do segundo grau e mostre o valor de Delta. (formula Δ = b2 – 4ac)
 **/

fun main(){
    println("Digite valor de A:")
    val A = readln().toDouble()
    println("Digite valor de B:")
    val B = readln().toDouble()
    println("Digite valor de C:")
    val C = readln().toDouble()

    println("Os valores A:$A,  B:$B, C:$C ")
    val delta = B.pow(2) - 4 * A * C
    println("O valor de DELTA É $delta")


}