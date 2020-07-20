package com.henry.test.objects2

/*
密封类(sealed class)
子类的个数是受限的，类似于枚举.直接子类定义在同一个文件？
 */

sealed class Calculator

class Add : Calculator()

class Subtract : Calculator()

class Multiply:Calculator()

fun calculate(a: Int, b: Int, c: Calculator) = when (c) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply ->a*b
}

fun main() {
    println(calculate(3, 5, Add()))
    println(calculate(3, 5, Subtract()))
}