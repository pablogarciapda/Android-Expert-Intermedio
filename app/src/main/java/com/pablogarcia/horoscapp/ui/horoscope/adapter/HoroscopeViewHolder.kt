package com.pablogarcia.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.pablogarcia.horoscapp.databinding.ItemHoroscopeBinding
import com.pablogarcia.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {
        val context = binding.tvTitle.context
        binding.tvTitle.text = context.getString(horoscopeInfo.name)
        binding.ivHoroscope.setImageResource(horoscopeInfo.imagen)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope, newLamda = { onItemSelected(horoscopeInfo)})
//            onItemSelected(horoscopeInfo)
        }
    }

    fun startRotationAnimation(view: View, newLamda: ()-> Unit) {
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLamda() }
            start()
        }
    }
}