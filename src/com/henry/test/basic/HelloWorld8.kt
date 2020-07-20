package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {

    var a = 5
    var b = 10
    if (a in 2..b) {//[2,b]
        println("in the range")
    }
    if (a !in 2..b) {
        println("not in the range")
    }

    println("---------------------")
    for (i in 2..b) {
        println("$i")
    }

    println("---------------------")
    for (i in 2.rangeTo(b)) {
        println("$i")
    }


    println("---------------------")
    for (i in 2..b step 2) {
        println("$i")
    }
    println("---------------------")
    for (i in 10 downTo 1 step 2) {
        println("$i")
    }

}
