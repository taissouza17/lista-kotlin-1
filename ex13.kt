fun main(){
    println("digite o preço do produto: ")
    val preco =  readln().toDouble()
    val desconto = preco - preco * 0.05
    val descontoF = String.format("%.2f", desconto)

    println("valor promocional 5% de desconto : $descontoF")
}