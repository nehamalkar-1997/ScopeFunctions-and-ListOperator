package com.example.task

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class Person {

    var name: String = "jhon"
    var age: Int = 20

    @Test
    fun withFunction() {
        val person = Person()
        val bio: String = with(person) {
            println(name)
            println(age)
            age + 5
            "He is from US"
        }
        println(bio)
    }

    @Test
    fun applyFunction(){
        val person = Person().apply {
            this.name = "Disney"
            this.age = 3
        }
    }

    @Test
    fun alsoFunction(){
        Person().also {
            it.name = "jhon from US"
            println("New name: ${it.name}")
        }
    }

    @Test
    fun letFunction(){
        val name : String? = "hello"

        val stringLength = name?.let {
            println(it.reversed())
            println(it.capitalize())
            it.length
        }
        println(stringLength)
    }

    @Test
    fun runFunction(){
        val person: Person? = Person()

        val bio = person?.run {
            println(name)
            println(age)
            age + 5
            "He is from US"
        }
        println(bio)
    }
}