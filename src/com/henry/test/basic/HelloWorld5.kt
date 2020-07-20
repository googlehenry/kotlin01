package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {

    println(toUpper(22))
    println(toUpper("222"))
}
fun toUpper(str:Any):String?{
    if(str is String){//instance of
        return str.toUpperCase()
    }
    return null
}
