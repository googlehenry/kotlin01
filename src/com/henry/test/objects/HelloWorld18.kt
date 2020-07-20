package com.henry.test.objects


open class BaseClass{
    open fun method(){

    }
}

abstract class ChildClass:BaseClass(){
    override abstract fun method()
}

fun main() {

}