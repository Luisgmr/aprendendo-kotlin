package com.luisgmr.basico

import kotlin.random.Random
fun main() {
    val multableMap1 = mutableMapOf<Int, String>(
        1 to "Muito ruim",
        2 to "Ruim",
        3 to "Razoável",
        4 to "Bom")

    multableMap1.put(5, "Muito bom")

    println(multableMap1)
}