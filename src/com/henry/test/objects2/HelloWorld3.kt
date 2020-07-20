package com.henry.test.objects2

import com.henry.test.objects.MyTest

/*
泛型（generic）,
协变(co-variant)，逆变(contra-variant)
List<Object>
List<String>

List<String> list= new ArrayList<>();
List<Object> list2=  list;//编译失败
list2.add(new Date())

list.get(0)//Throw error, class cast exception

java solution:
List<? extends Object> list ...

List<String> 是 List<? extends Object>的子类型，限制上界，so-called协变。
List<? super String>限制下界

in: 写入某个变量 ? super lowerBound
out: 读取某个变量 ? extends upperBound

 */

class MyGeneric<T>(t: T) {
    var va: T = t

    fun text(): T {
        return this.va
    }
}

class MyGeneric2<out T>(t: T) {
   private var va: T
    init {
        this.va=t
    }

    fun text(): T {
        return this.va
    }
}


fun myTest(clazz:MyGeneric2<String>){
    var obj:MyGeneric2<Any> = clazz
    println(obj.text())
}

fun main() {
    println(MyGeneric<String>("hangsan").text())
    println(MyGeneric<Int>(33).text())
    println(MyGeneric2<String>("wwww").text())
}