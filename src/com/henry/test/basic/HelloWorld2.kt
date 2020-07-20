package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {
    val a:Int = 1
    //a = 2
    var b:Int = 1
    b = 2
    println("$a,$b")

    //kotlin can not assign byte to int
    var x:Byte = 1
    var y:Int = 10
    //y = x

//support nested comments
    /**
     * /**
     *
     *
     */*/

    //import functions from other packages, with alias
    doNoth(2,3)

    val arr = intArrayOf(1,2,3)
    //arr = intArrayOf(4,5,6) // can not assign
    arr.set(0,4)//but can set element's value
    arr.forEach { println(it) }

}


