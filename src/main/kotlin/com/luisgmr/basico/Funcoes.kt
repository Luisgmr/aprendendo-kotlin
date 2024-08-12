package com.luisgmr.basico

fun main() {
    val precoDosProdutos: Array<Double> = arrayOf(5.0, 5.2, 5.3, 10.5, 31.99)
    println(somarProdutos(precoDosProdutos))
}

fun somarProdutos(produtos: Array<Double>): Double {
    var total = 0.0
    for (produto in produtos) {
        total += produto
    }
    return total
}