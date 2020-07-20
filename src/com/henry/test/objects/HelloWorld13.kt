package com.henry.test.objects


//简化的属性构造方式，加上private var变量申明
class Person2 constructor(private var username: String, private var age: Int, private var address: String) {

    fun print() {
        println("username=$username,age=$age,address=$address")
    }
}

//简化的属性构造方式，设置默认初始值,所有参数有默认值，会生成无参构造方法
class Person3 constructor( var username: String= "zhangsan", private var age: Int=20) {

    fun print() {
        println("username=$username,age=$age")
    }
}

fun main() {
    Person2("lisi", 23, "sichuan").print()
    Person3().print()
    println(Person3().username)
}