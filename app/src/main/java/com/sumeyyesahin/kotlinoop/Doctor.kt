package com.sumeyyesahin.kotlinoop

class Doctor : Profession() {

    fun test(){
        super.prof()
    }

    override fun prof(){
        println("From Doktor class")

    }
}