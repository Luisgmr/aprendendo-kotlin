package com.luisgmr.basico

fun main() {
    var array = arrayOf(1, 2, 3, 4, 5, 6)
    var lista = listOf(1, 2, 3, 4, 5, 6)
    var arrayList: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5, 6)
    var mutableList = mutableListOf(1, 2, 3, 4, 5, 6)
    arrayList.add(7);
    printarElementos(arrayList)
}

fun printarElementos(lista: List<Int>) {
    lista.forEachIndexed { index, i ->
        println("$index: $i")
    }
}