fun main (){
    println("Digite uma distancia em metros")
    val metros = readln().toDouble()

    val quilometros = metros / 1000
    val centimetros = metros * 100
    val milimetros = metros *1000

    println("A distancia de $metros é equivalente a: ")
    println("${"%.0f".format(centimetros)} centímetros")
    println("${"%.0f".format(milimetros)} milímetros")
    println("${"%.3f".format(quilometros)} quilômetros")
}