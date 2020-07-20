package com.henry.test.objects


//object declaration,对象声明

object MyObject {
    fun method() {
        println("method")
    }
}

//companion object,半生对象，随着ui想的生命而存在
//kotlin中无静态方法，将包级别的函数作为静态方法。
//一个类只能由一个伴生对象

class MyTest {
    companion object MyObject {
        var a: Int = 100
        @JvmStatic
        //build static method inside MyTest directly
        //use javap -c MyTest to verify
        //外部类的静态方法
        fun method() {
            println("method invoked : $a")
        }
        //内部类的实例方法
        fun method2(){
            println("method2 invoked")
        }
    }
}
class MyTest2 {
    companion object {
        var a: Int = 100
        fun method() {
            println("method invoked : $a")
        }
    }
}

fun main() {
    MyObject.method()
    println("-----------------")
    MyTest.MyObject.method()//可以,不起名字使用companion引用，不重要
    MyTest.method()//相当于静态方法
    println("----------------")
    MyTest2.Companion.method()
    MyTest2.method()
    println("---------------")

    println(MyTest.MyObject.javaClass)//静态内部类
    println(MyTest2.Companion.javaClass)


}