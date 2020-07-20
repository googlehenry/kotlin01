package com.henry.test.objects

//Kotlin中，所有类默认无法被继承，避免类被乱继承。

open class Fruit() {
    open fun name(){
        println("fruit")
    }
    fun expire(){
        println("1 month")
    }
}

class Apple:Fruit(){

    override fun name(){
        println("apple")
    }
}

open class Orange:Fruit(){
    final override fun name() {
        println("orange")
    }
}

class Tangeran:Orange(){
    //override fun name(){
    //
    //}
}

fun main() {
    Apple().name()
    Apple().expire()
    Orange().name()
    Tangeran().name()
}