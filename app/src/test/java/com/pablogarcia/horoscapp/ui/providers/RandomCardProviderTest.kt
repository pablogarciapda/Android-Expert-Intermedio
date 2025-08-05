package com.pablogarcia.horoscapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest {

    @Test
    fun `getRandomCard shoul return a random card`(){
         val randomCard = RandomCardProvider()

        val card  = randomCard.getLucky()

        assertNotNull(card)
    }
}