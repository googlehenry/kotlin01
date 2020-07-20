package com.henry.test.bad

fun inc(num:Int){
    var num = 2
    if(num>0){
        var num = 3
    }
    println("num:"+num)
}

fun main() {
    inc(4)
}