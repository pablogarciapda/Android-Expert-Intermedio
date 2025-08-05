package com.pablogarcia.horoscapp.motherobject

import com.pablogarcia.horoscapp.data.network.response.PredictionResponse
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Aquiarius
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Aries
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Capricor
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Leo
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Libra
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
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