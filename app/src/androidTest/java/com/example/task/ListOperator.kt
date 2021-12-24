package com.example.task

import org.junit.Test

class ListOperator {

    @Test
    fun performmap(){
        val items : List<String> = listOf("jhon","king","queen")
        val abbrevations : List<Unit> = items.map {

        }
        println(abbrevations)
    }

    @Test
    fun performSearch(){

    }

}