package com.henry.test.objects3

/*
内部类
对应于java中的非静态(static)内部类
 */



class OuterClass2 {
    private val str: String = "helloworld"

    inner class InnerClass {
        fun doSomething() = "welcome inner:" + this@OuterClass2
    }
}

fun main() {
    println(
        OuterClass2().InnerClass().doSomething()
    )
}