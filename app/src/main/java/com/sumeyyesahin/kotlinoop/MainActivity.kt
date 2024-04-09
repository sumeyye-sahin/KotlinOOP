package com.sumeyyesahin.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("John", 45) // User sınıfından myUser adında obje oluşturuldu
                            // Oluşturulurken constructor çalıştı ve nameInput - ageInput girmek gerekti
                            // init fonk.da çalıştı

        myUser.name="Justin"
        myUser.age=76

        println(myUser.age.toString())
        println(myUser.name)

        var james = Teacher("James","Math",32)


        println(james.name)
        println(james.age.toString())



    }
}