package com.henry.test.objects

//companion object extension
class CompanionObjExt{
    companion object {

    }
}

fun CompanionObjExt.Companion.method(){
    println("companion.exteded.method")
}
fun main() {
    CompanionObjExt.method()
}
