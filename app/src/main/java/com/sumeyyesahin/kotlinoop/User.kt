package com.sumeyyesahin.kotlinoop

class User : People{

    var name : String? = null
    var age : Int? = null


    constructor(nameInput: String, ageInput: Int){
        this.name=nameInput
        this.age=ageInput
        println("User created")
    }

    init {
        println("init")
    }

    fun userFunction(){
        println("Hi from User class")
    }

}