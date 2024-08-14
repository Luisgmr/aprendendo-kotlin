package com.luisgmr.poo.classes

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val nome: String,
    val dataNascimento: LocalDate)
{
    val idade = LocalDate.now().year - dataNascimento.year

    fun falar(mensagem: String) {
        println("$nome falou: $mensagem")
    }

    override fun toString(): String {
        return "Pessoa(cpf='$cpf', nome='$nome', dataNascimento=$dataNascimento, idade=$idade)"
    }


}