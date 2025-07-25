package com.pablogarcia.horoscapp.domain

import com.pablogarcia.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}