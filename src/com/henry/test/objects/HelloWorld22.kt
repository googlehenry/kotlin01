package com.henry.test.objects

//visibility

//private,protected,internal,public
//java: default->package
//kotlin:default->public,anywhere
//kotlin:private->same current file
//kotlin:internal->same module,maven module,gradlemodule
//kotlin:protected->can not modify top-level concepts, can use inside a class(current class+child class)
//local variable->no concept of visibility

fun method(){

}

open class Clazz{
    private val b = 3
    protected open val c =4
    internal val d = 5
}

class SubClazz:Clazz(){
    //c,d
}



class SubClazz2(){
    //d
}

fun main() {

}