package com.luisgmr.basico

fun main() {
    print("Digite o tipo de rota: ")
    val tipoDeRota: String = readlnOrNull().toString() // CAMINHADA, CARRO, ONIBUS, TREM

//    if (tipoDeRota.uppercase() == "CAMINHADA") {
//        println("Traçando rota a pé");
//    } else if (tipoDeRota.uppercase() == "CARRO") {
//        println("Traçando rota no carro")
//    } else if (tipoDeRota.uppercase() == "ONIBUS") {
//        println("Traçando rota no onibus")
//    } else if (tipoDeRota.uppercase() == "TREM") {
//        println("Traçando rota no trem")
//    }

    when (tipoDeRota.uppercase()) {
        "CAMINHADA" -> {
            println("Traçando rota a pé");
            // Mais coisas se necessário
        }
        "CARRO" -> println("Traçando rota no carro") // Em uma linha não precisa de chaves
        "ONIBUS" -> println("Traçando rota no onibus")
        "TREM" -> println("Traçando rota no trem")
        else -> println("Não existe uma rota com esse tipo")
    }
}