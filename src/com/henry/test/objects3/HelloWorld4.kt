package com.henry.test.objects3


class OuterClass4 {
    class NestedClass4 {
        init {
            println("NestedClass4 init")
        }
    }

    inner class InnerClass5(str: String) {
        init {
            println(str)
        }
    }

}

fun main() {
    OuterClass4.NestedClass4()
    OuterClass4().InnerClass5("str")
}