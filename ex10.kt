fun main(){
    println("Digite saldo atual: ")
    val saldo = readln().toDouble()
    val dolar = 1*5.16

    val conver = saldo / dolar
    val converF = String.format("%.2f", conver)

    println("Com R$$saldo voce pode comprar US$$converF ")


}