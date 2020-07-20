package com.henry.test.objects

//Kotlin中，所有类默认无法被继承，避免类被乱继承。

open class MyParent() {
    open val name:String="parent"
}

class MyChild:MyParent(){
    override val name:String="child"
}

class MyChild2(override val name:String="child2"):MyParent(){

}

open class MyParent3{
    open fun method(){
        println("parent 3 method")
    }
    open val name:String get() = "parent3"
}

class MyChild3:MyParent3(){
    override fun method() {
        super.method()
        println("child3 method")
    }
    override val name:String get() = super.name+" child3"
}

//parent:val->child:val good,get->get
//parent:val->child:var good,get/set->get/set
//parent:var->child:val bad,get/set->get
fun main() {
    val name:String = "111"
    //name = "222"
    println(MyChild().name)
    println(MyChild2().name)
    println("--------------------")
    MyChild3().method()
    println("--------------------")
    println(MyChild3().name)
}