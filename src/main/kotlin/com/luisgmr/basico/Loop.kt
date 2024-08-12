package com.luisgmr.basico

import javax.swing.JOptionPane

fun main() {
    var precoTotal = 0.0
    print("Digite a quantidade de produtos: ")
    var quantidade = readLine()!!.toInt()
    var precoDosProdutos: Array<Double> = Array(quantidade) {0.0}

    // for (int i = 0; i < quantidade; i++)
    println("For com <")
    for (i in 0 until quantidade) {
        println(i)
    }

    // for (int i = 0; i < quantidade; i++)
    println("For com <=")
    for (i in 0..quantidade) {
        println(i)
    }

    for (i in 1..quantidade) {
        print("Digite o preço do produto $i: ")
        precoDosProdutos[i-1] = readLine()!!.toDouble()
    }

    for (preco in precoDosProdutos) {
        precoTotal += preco
    }

    println("Preço total: $precoTotal")
}

