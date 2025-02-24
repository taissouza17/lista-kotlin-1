fun main(){
    println("Digite a sua 1° nota: ")
    val nota1 = readln().toDouble()

    println("Digite a sua 2° nota: ")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2

    println("A media entre $nota1 e $nota2 é igual a $media")
}