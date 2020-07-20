package com.henry.test.objects

//extension
//扩展函数没有对原有的类加入任何新的方法，不會修改目标类
//扩展函数是静态分发，不同于java中的多态
//调用由声明类型决定，不是对象实际类型决定，声明在父类，继承的子类的实例也不会调用

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
}

fun ExtensionTest.multiply(a: Int, b: Int) = a * b

fun main() {
    var et = ExtensionTest()
    println(et.add(1, 2))
    println(et.subtract(4, 3))
    println("---------------")
    println(et.multiply(3,4))

    println("---------------")
    myPrint(AA())
    myPrint(BB())

    println("---------------")
    CC().foo()
    CC().foo(10)

    var a:String?=null
    println(a.toString())
}

open class AA //父类

class BB:AA()//子类
fun AA.a() = "a"
fun BB.a() = "b"

fun myPrint(aa:AA){//声明什么就运行什么，静态的，不同于java中的多态实在运行时动态决定的
    println(aa.a())
}

class CC{
    fun foo(){
        println("cc.foo")
    }
}
fun CC.foo(){
    println("Extension.CC.foo")
}
fun CC.foo(num:Int){
    println("Extension.CC.foo.param:$num")
}

fun Any?.toString():String{
    if(null==this){
        return "nullxxx"
    }
    return toString()
}