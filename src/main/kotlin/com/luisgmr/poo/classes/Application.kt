package com.luisgmr.poo.classes

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val luis = Pessoa("124.058.989-18", "Luis Gustavo", LocalDate.of(2004, 7, 1))
            println(luis)
            luis.falar("Olá mundo")
        }
    }
}