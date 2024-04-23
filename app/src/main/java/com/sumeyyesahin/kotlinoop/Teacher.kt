package com.sumeyyesahin.kotlinoop

open class Teacher(name: String, branch: String, age: Int) {
    // encapsulation
    var name: String? = name
        private set
        get

    private var branch: String? = branch

    var age: Int? = age
        get
        private set

    fun courseTime(){
        println("4 times a week")
    }
}