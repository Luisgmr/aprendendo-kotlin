package com.luisgmr.poo.heranca2

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val luis = Pessoa("1240589891", "Luis", LocalDate.of(2004, 7, 1))
            luis.adotar(Cachorro())
            luis.adotar(Gato())
            for (animal in luis.animaisAdotados) {
                animal.comunicar()
            }
        }
    }
}