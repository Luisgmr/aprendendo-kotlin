package com.luisgmr.poo.heranca

import com.luisgmr.poo.encapsulamento.Calculadora
import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var calculadora = Calculadora()
            calculadora.somar(BigDecimal("2"))

            val calculadoraCientifica = CalculadoraCientifica()
            calculadoraCientifica.somar(BigDecimal("2"))
            calculadoraCientifica.potencia(17)
        }
    }
}