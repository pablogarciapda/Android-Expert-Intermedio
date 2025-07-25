package com.pablogarcia.horoscapp.data

import android.util.Log
import com.pablogarcia.horoscapp.data.network.HoroscopeApiService
import com.pablogarcia.horoscapp.domain.Repository
import com.pablogarcia.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService)  : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        //Peticion retrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("PabloGarcia", "Ha ocurrido un error en llamada a la Api ${it.message}") }
        return null
    }
}