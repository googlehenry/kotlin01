package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {
    println(toInt("22"))
    println(toInt("aa"))

    multiply("3","6")
    multiply("3","a")
}

fun toInt(txt:String):Int?{
    try{
        return txt.toInt()
    }catch(ex:Exception){
        return null
    }
}

fun multiply(a:String,b:String){
    var ai = toInt(a)
    var bi = toInt(b)
    //println(ai*bi)
    if(null!=ai&&null!=bi){
        println(ai*bi)
    }else{
        println("string can not be cast to int")
    }
}
