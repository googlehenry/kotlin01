package com.henry.test.objects

class Person constructor(username: String) {
    private var username: String
    private var age: Int
    private var address: String

    init {
        println("cons init")
        this.username = username
        age = 0
        address = "SH"
    }

    constructor(username:String,age:Int):this(username){
        println("cons 2")
        this.age = age
    }

    constructor(username:String,age:Int,add:String):this(username,age){
        println("cons 3")
        this.address=add
    }

    fun print(){
        println("username=$username,age=$age,address=$address")
    }

}

fun main() {
    var p = Person("zhangsan",20,"shanghai")

    p.print()
}