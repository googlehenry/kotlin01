package com.henry.test.objects

//Kotlin中，所有类默认无法被继承，避免类被乱继承。

open class Parent(name: String, age: Int) {

}

class Child(name: String, age: Int) : Parent(name, age) {

}

//子类无primary构造方法，通过secondary构造方法中super.调用父类的初始化方法
open class Parent2(name: String) {

}

class Child2 : Parent2 {
    constructor(name: String) : super(name) {

    }
}

fun main() {

}