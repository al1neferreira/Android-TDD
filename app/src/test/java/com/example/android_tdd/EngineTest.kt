package com.example.android_tdd

import org.junit.Assert.assertEquals
import org.junit.Test

class EngineTest {

    //Instancia o objeto
    private val engine = Engine(2000, 189, 15, false)

    @Test
    fun engineTurnsOn(){
        //chama a função
        engine.turnOn()
        //confirma o comportamento esperado, com o oobjeto +
        assertEquals(true, engine.isTurnedOn)
        assertEquals(95, engine.temperature)
    }

   @Test
    fun engineTurnedOff(){
        engine.turnedOff()
        assertEquals(false, engine.isTurnedOn)
        assertEquals(15, engine.temperature)
    }
}