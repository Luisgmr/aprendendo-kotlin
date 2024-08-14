package com.luisgmr.poo.polimorfismo

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val luis = Pessoa("1240589891", "Luis", LocalDate.of(2004, 7, 1))
            luis.adotar(Cachorro())
            luis.adotar(Gato())
            for (animal in luis.animaisAdotados) {
//                when {
//                    animal is Cachorro -> animal.latir()
//                    animal is Gato -> animal.miar()
//                    animal is Mamifero -> println("É um mamífero")
//                    animal is Peixe -> println("É um peixe")
//                }
                (animal as? Gato)?.miar()
                (animal as? Cachorro)?.latir()
            }
        }
    }
}