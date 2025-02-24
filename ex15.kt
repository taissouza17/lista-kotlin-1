fun main () {
    println("Digite total de dias Alugados: ")
    val dias = readln().toInt()
    println("Digite Kms percorridos: ")
    val km = readln().toDouble()

    val totaldias = dias*90
    val totalkm = km * 0.20
    val total = totaldias+totalkm
    println("Valor total do aluguel a pagar é de R$$total")
}