package com.henry.test.objects

//default values, lazy initialization
//lateinit
//kotlin要求非空类型的属性必须在构造方法中初始化，这种要求反人性，无法满足依赖注入，Spring就挂了
//通过lateinit关键字标记属性延迟初始化,满足三个条件
//1.类体中声明的var属性
//2.不能提供自定义的getter/setter
//3.属性类型必须非空,不能为原生数据类型

class TheClass{
    lateinit var name:String //延迟初始化,方便框架

    fun ini(){
        this.name = "zhangsan"
    }
    fun print(){
        println(this.name)
    }
}

fun main() {
    var tc = TheClass()
    tc.ini()
    tc.print()
}