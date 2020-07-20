package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {

    var array = listOf("hell", "allo", "world", "welcome")

    println("----------------")

    when {
        "world" in array -> println("world is in collection,when...")
    }

    if ("world" in array) {
        println("world is in collection, if...")
    }

    //filter collection
    array.filter { it.length > 5 }.forEach { println(it.toUpperCase()) }

    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }


}
