package com.henry.test.objects

//empty objects, no need for body
//在kotlin中，一个类可以有1个primary和多个secondary构造方法
class Student constructor(username:String){//primary constructor,类头

}

//五修飾符可以可以不写
class Student2 (username:String){//primary constructor,类头
    private val username:String= username.toUpperCase()
    init {
        println("username:$username")
    }
}

//kotlin的构造方法的可见性
class Student3 private constructor(username:String){//primary constructor,类头
private val username:String= username.toUpperCase()
    init {
        println("username:$username")
    }
}

fun main() {
    var myClass = Student2("zhangsan")
}
