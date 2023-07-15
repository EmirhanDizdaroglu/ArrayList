package com.example.arraylistislemler

import java.util.*

fun main(){
    val meyveler= ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.isEmpty())//false

    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())

    println(meyveler.contains("kiraz"))

    println(meyveler.max())
    println(meyveler.min())

    println(meyveler.sort())
    println(meyveler.toString())
}