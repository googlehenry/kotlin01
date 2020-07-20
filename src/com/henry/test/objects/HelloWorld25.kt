package com.henry.test.objects

//extension
//扩展的作用域
//1.扩展函数所在的类的实例叫做分发接收者(dispatch receiver)
//2.扩展函数扩展的目标类的实例叫做扩展接收者(extension receiver)
//3.以上两个名字出现冲突时，扩展接收者优先级高，就是原配优先级高
//扩展可以解决java中的各种辅助类问题
//Collections.swap(list,4,10)
//list.swap(4,10)

class DD {
    fun dd() {
        println("DD.dd()")
    }
}

class EE {
    fun ee() {
        println("EE.ee()")
    }

    fun DD.hello() {//可以使用DD和EE的方法
        dd()
        ee()
    }

    //解决重名问题
    fun DD.output() {
        println(toString())//DD's toString
        println(this@EE.toString())//use this to all EE's toString
    }

    fun test(){
        DD().output()
    }
}

fun main() {
    EE().test()
}