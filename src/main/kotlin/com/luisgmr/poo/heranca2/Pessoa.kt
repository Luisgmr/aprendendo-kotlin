package com.luisgmr.poo.heranca2

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val nome: String,
    val dataNascimento: LocalDate)
{
    val animaisAdotados = arrayListOf<Animal>()
    val idade = LocalDate.now().year - dataNascimento.year
    var email = ""
        set(value) {
            if (!Regex("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)) {
                throw Exception("Email inválido.")
            }
            field = value
        }

    fun falar(mensagem: String) {
        println("$nome falou: $mensagem")
    }

    fun adotar(animal: Animal) {
        animaisAdotados.add(animal)
    }
}