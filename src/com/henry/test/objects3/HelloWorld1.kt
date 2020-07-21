package com.henry.test.objects3
/*嵌套类
对应于java中的静态(static)内部类,kotlin没有static关键字
 */

class OuterClass {
    private val str: String = "helloworld"

    class NestedClass {
        fun doSomething() = "welcome"
    }

    class NestedClass2 {
        fun dosth() {
            NestedClass().doSomething();
        }
    }
}

fun main() {
    println(
        OuterClass
            .NestedClass().doSomething()
    )
}