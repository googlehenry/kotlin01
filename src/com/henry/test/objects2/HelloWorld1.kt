package com.henry.test.objects2

//数据类
//lombok
//data key word
/*
数据类前置条件：
1.主构造方法至少要一个参数
2.主构造方法参数必须标注var/var表示是成员变量
3.数据类不能是抽象的,open的,sealed以及inner类
数据类编译器自动帮我完成
1.equals/hashcode
2.toString
3.针对属性的componentN方法，按声明顺序,应该已经优化掉了。name,age,address
要点
1.如果有显示定义这些方法或者声明称final,则这些方法不会再定义
2.父类拥有componentN方法且类型兼容，编译器生成并重写。遇到不兼容的或者final的方法报错。
3.不允许显示指定componnetN方法或者copy方法(已经优化了？）
解构声明
主构参数对应每一个component，返回值就是属性值。
 */
/*
无参构造方法只有在提供了所有主构参数的默认赋值
 */
data class Person(val name: String, var age: Int, var address: String) {

}

fun main() {
    var p = Person("zhangsan", 23, "shanghai")
    println(p)
    //具名copy,指定属性名称
    println(p.copy(address = "beijing"))

    //解构
    var (name, age, address) = p
    println("name=$name,age=$age,address=$address")
    var (name1, address1, age1) = p
    println("name=$name1,address=$address1")//按顺序,不能这样使用


}