fun main(){
    println("Digite Altura: ")
    val altura = readln().toDouble()
    println("Digite largura: ")
    val largura = readln().toDouble()

    val area = altura * largura
    val tinta = area / 2
    println("sua area de $area m² precisa de $tinta litros de tinta ")
}