package com.luisgmr.poo.encapsulamento

import java.math.BigDecimal
import java.math.RoundingMode

class Calculadora {
    /*
    public
    private
    protected
    internal (Pra acessar somente no seu projeto, não possibilitando o acesso de outros projetos de for uma lib)
     */
    private var resultado: BigDecimal = BigDecimal.ZERO

    fun somar(a: BigDecimal) {
        resultado += a
    }

    fun subtrair(a: BigDecimal) {
        resultado -= a
    }

    fun multiplicar(a: BigDecimal) {
        resultado *= a
    }

    fun dividir(a: BigDecimal) {
        resultado = resultado.divide(a, 4, RoundingMode.HALF_UP)
    }


    fun getResultado(): BigDecimal {
        return resultado;
    }



}