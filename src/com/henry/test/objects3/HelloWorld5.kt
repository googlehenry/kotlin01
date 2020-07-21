package com.henry.test.objects3

import javax.swing.AbstractAction

/*
对象表达式(object expression)
对标java匿名内部类
object:Parent1,Parent2 {

}
 */

interface MyInterface {
    fun myprint(i: Int)
}

abstract class AbstractClass {
    abstract val age: Int
    abstract fun printInfo()
}

fun main() {
    //对象表达式相当于匿名内部类
    var obj = object : MyInterface {
        override fun myprint(i: Int) {
            println("i=$i")
        }
    }
    obj.myprint(88)
    println("-------------")

    var obj2 = object {
        init {
            println("init object")
        }

        var prop: String = "hello"
        fun dosth() = "dosomething"
    }

    obj2.dosth()

    println("-------------")

    //java只能实现一个或者多个接口或者父类，开启了很多可能性。
    var obj3 = object : MyInterface, AbstractClass() {
        override fun myprint(i: Int) {
            println("MyInterface print")
        }

        override val age: Int
            get() = 100

        override fun printInfo() {
            println("AbstractClass print")
        }

    }

    obj3.printInfo()
    obj3.myprint(88)

}