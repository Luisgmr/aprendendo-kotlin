package com.luisgmr.basico

import java.math.BigDecimal

fun main() {
    // Byte, Short, Int, Long
    val byte: Byte = Byte.MAX_VALUE
    val short: Short = Short.MAX_VALUE
    val int: Int = Int.MAX_VALUE
    val long: Long = Long.MAX_VALUE

    println("Byte: $byte \nShort: $short\nInt: $int\nLong: $long")

    // Float, Double
    val float: Float = Float.MAX_VALUE
    val double: Double = Double.MAX_VALUE
    val bigDecimal: BigDecimal = BigDecimal("1.48908319084103548932")

    println("Float: $float\nDouble: $double\nFloat: $float")

    // Boolean
    val boolean: Boolean = true

    // char
    val charL: Char = 'L'
    val charU: Char = 'U'
    val charI: Char = 'I'
    val charS: Char = 'S'

    // String
    val string: String = "Luis Gustavo, $charL$charU$charI$charS"
    println(string)

    // Array
    val array: Array<Char> = arrayOf(charL, charU, charI, charS);
    println("Array ${array.toList()}")

    val array2 = arrayOf(1, 2, 3)
    val array3 = arrayOf(1, 2, 3)
    println(array2 == array3) // Memory Ref
    println(array2.contentEquals(array3)) // Objetos 'iguais'

}