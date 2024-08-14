package com.luisgmr.poo.encapsulamento

import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal("2"))
            calculadora.dividir(BigDecimal("50"))
            println(calculadora.getResultado())
        }
    }
}