package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {
    var array:IntArray = intArrayOf(1,2,2,4)

    array.forEach { println(it) }//values

    println("--------------------")
    for( i:Int in array.indices){
        println("array[$i]=${array[i]}")
    }

    println("--------------------")
    array.indices.forEach { println("array[$it]=${array[it]}") }

    println("--------------------")
    for( (i:Int,v:Int) in array.withIndex()){
        println("array[$i]=$v")
    }

}