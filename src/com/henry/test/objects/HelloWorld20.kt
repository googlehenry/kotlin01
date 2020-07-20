package com.henry.test.objects

//properties

class ThePerson(address: String, name: String) {
    val age: Int
        get() = 20
    var address: String = address
        get() {
            println("gett address")
            return field //backing field
        }
        set(value) {
            println("sett address")
            field = value
        }

}

fun main() {
    var p = ThePerson("shanghai", "zhangsan")

    println(p.age)
    //p.age=222 //read only, getter only
    println(p.address)
    p.address="sh"
    println(p.address)
}