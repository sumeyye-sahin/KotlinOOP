package com.sumeyyesahin.kotlinoop

class SuperTeacher(name: String, branch: String, age: Int) :
    Teacher(name, branch, age) {

        fun superTeacherFun(){
            println("Hello from SuperTeacher")
        }

}