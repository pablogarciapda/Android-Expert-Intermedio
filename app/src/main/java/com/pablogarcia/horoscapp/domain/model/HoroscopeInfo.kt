package com.pablogarcia.horoscapp.domain.model

import com.pablogarcia.horoscapp.R

sealed class HoroscopeInfo (val imagen:Int, val name:Int ){
    data object Aries: HoroscopeInfo(R.drawable.aries, R.string.aries)
    data object Taurus: HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    data object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    data object Capricor: HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    data object Gemini: HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    data object Leo: HoroscopeInfo(R.drawable.leo, R.string.leo)
    data object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.virgo)
    data object Libra: HoroscopeInfo(R.drawable.libra, R.string.libra)
    data object Scorpio: HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    data object Sagittarius: HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    data object Aquiarius: HoroscopeInfo(R.drawable.aquario, R.string.aquarius)
    data object Pisces: HoroscopeInfo(R.drawable.piscis, R.string.pisces)

}