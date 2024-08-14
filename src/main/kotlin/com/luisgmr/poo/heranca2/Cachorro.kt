package com.luisgmr.poo.heranca2

class Cachorro: Mamifero() {

    fun latir() {
        println("Au au!")
    }

    override fun comunicar() {
        latir()
    }

}