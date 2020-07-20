package com.henry.test.objects

interface A {
    fun method(){
        println("A")
    }
    fun method2(){
        println("AA")
    }
}

open class B {
    open fun method() {
        println("B")
    }
    open fun method2(){
        println("BB")
    }
}

class C : A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C")
    }

    override fun method2() {
        println("CC")
    }

}

fun main() {
    C().method()
    println("---------------")
    C().method2()
}