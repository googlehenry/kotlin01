package com.henry.test.basic

import com.henry.test.basic.doNothing2 as doNoth

fun main(vars: Array<String>) {

    var a:String="hello \\n world"
    println(a)

    println("-------------------------")

    var b:String = """hello \n
        |
        |world""".trimMargin()
    println(b)

}
