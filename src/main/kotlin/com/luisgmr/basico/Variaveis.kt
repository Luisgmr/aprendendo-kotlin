package com.luisgmr.basico

fun main() {
    // Não altera
    val teste = "Val não mutável";

    // Altera
    var teste2 = 5
    teste2 = Integer.parseInt("5") + teste2
    println(teste2)
}