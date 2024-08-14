package com.luisgmr.poo.heranca

import java.math.BigDecimal
import java.math.RoundingMode

open class Calculadora {
    /*
    public
    private
    protected
    internal (Pra acessar somente no seu projeto, não possibilitando o acesso de outros projetos de for uma lib)
     */
    protected var resultado: BigDecimal = BigDecimal.ZERO

    fun somar(a: BigDecimal) {
        resultado += a
        mostrarResultado()
    }

    fun subtrair(a: BigDecimal) {
        resultado -= a
        mostrarResultado()
    }

    fun multiplicar(a: BigDecimal) {
        resultado *= a
        mostrarResultado()
    }

    fun dividir(a: BigDecimal) {
        resultado = resultado.divide(a, 4, RoundingMode.HALF_UP)
        mostrarResultado()
    }

    protected fun mostrarResultado() {
        println("O resultado é: $resultado")
    }



}