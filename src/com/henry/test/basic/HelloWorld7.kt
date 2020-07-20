package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {
    println(myPrint("world"))
    println(myPrint2("henry"))
    println(myPrint3("hello"))

    var a = 6

    var result = when (a) {
        1 -> {
            println("hhh")
            10
        }
        2, 3 -> {
            println("ss")
            20
        }
        in 4..8 -> {
            println("dd")
            50
        }
        9 -> 90
        else -> 100

    }

    println("a=$a,result=$result")

}

fun myPrint(str: String): String {
    when (str) {
        "hello" -> return "HELLO"
        "world" -> return "WORLD"
        else -> return "other input"
    }
}

fun myPrint2(str: String): String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        else -> "other input"
    }
}

fun myPrint3(str: String) = when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    else -> "other input"
}
