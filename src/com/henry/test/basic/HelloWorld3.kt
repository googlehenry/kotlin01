package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {
    /**var x = 10
     *
    var y = 20
    var max:Int
    var min:Int
    if(x>y){
        max = x
        min = y
    }else{
        max= y
        min = x
    }

    println("max=$max,min=$min")

     **/

    /**
     *
    var x =10
    var y = 20
    var max = if(x>y) x else y
    var min = if(x>y) y else x

    println("max=$max,min=$min")

    */

    var x = 10
    var y = 20

    var max = if(x>y){
        println("do something")
        x
    }else{
        println("do something")
        y
    }
    var min = if(x>y){
        println("do something")
        y
    }else{
        println("do something")
        x
    }
    println("max=$max,min=$min")


}


