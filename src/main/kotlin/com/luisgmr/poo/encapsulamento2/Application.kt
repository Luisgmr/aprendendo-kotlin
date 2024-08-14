package com.luisgmr.poo.encapsulamento2

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val luis = Pessoa("12405898918", "Luis", LocalDate.of(2004, 7, 1))
            luis.email = "contato@luisgmr.com"
            luis.falar("funcionou")
        }
    }
}