package com.pablogarcia.horoscapp.data.providers

import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Cancer,
            Capricor,
            Gemini,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Aquiarius,
            Pisces
        )
    }
}