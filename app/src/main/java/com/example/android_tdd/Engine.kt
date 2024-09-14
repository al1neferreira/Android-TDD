package com.example.android_tdd

//Cria o objeto
class Engine(
    val cc: Int,
    val horsePower: Int,
    var temperature: Int,
    var isTurnedOn: Boolean
) {

    fun turnOn() {
        isTurnedOn = true
        temperature = 95
    }

    fun turnedOff() {
        isTurnedOn = false
        temperature = 15
    }

}