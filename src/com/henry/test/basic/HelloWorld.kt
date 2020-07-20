package com.henry.test.basic

import java.util.function.Consumer

fun main(vars: Array<String>) {
    print("hello world!")
    val list: List<String> = listOf("hello", "world", "helloworld")

    for (str in list) {
        println(str)
    }
    println("----------------")

    list.forEach(Consumer { println(it) })

    println("----------------")

    list.forEach(System.out::println)

    println(sum(1,2))
    println(sum2(1,2))
    println(sum3(1,2))

    println("-----------------")
    doNothing(1,2)
    doNothing2(1,2)

}

//sum=sum2=sum3
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int): Int = a + b
fun sum3(a: Int, b: Int) = a + b
//function return void

fun doNothing(a:Int,b:Int){
    println(a+b)
}
fun doNothing2(a:Int,b:Int):Unit{
    println("$a+$b=${a+b}")
}

//kotlin, package didn't need to match folder structure, but avoid to use


