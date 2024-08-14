package com.luisgmr.poo.heranca2

class Gato: Mamifero() {
    fun miar() {
        println("Miau!")
    }

    override fun comunicar() {
        miar()
    }
}