package com.example.companionobjects

import android.widget.ImageView

class Background {

    companion object {
        fun changeBackground(text: String, imageView: ImageView) {
            when (text) {
                "day" -> imageView.setImageResource(Mood.dayImg)
                "night" -> imageView.setImageResource(Mood.nightImg)
                else -> imageView.setImageResource(0)
            }
        }
    }
}