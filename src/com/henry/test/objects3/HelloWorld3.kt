package com.henry.test.objects3
/*dd
注意特定scope this@class的使用，在内部类中调用。
 */
class Person(val name:String,var age:Int){

    private val str:String = "text-outclass..."
    private inner class Feature(var height:Int,var weight:Int){
        private val str:String = "text-inside-innerclass..."
        fun getFeature(){
            val str:String = "text-inside-method..."
            println("height:$height,weight:$weight")
            this@Person.dosomething()
            println(this@Person.str)
            println(this.str)
            println(str)
        }
    }

    fun dosomething(){
        println("do something in person")
    }
    fun getPerson(){
        Feature(177,220).getFeature()
    }
}
fun main() {
  Person("zhang",22).getPerson()
}