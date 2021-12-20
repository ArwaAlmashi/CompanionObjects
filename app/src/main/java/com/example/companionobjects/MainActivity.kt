package com.example.companionobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.companionobjects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.apply {
            button.setOnClickListener {
                if (userInput.text.isNotEmpty()) {
                    Background.changeBackground(userInput.text.toString(), background)
                    if (userInput.text.toString() == "day" || userInput.text.toString() == "night") {
                        text.text = userInput.text
                    } else {
                        text.text = ""
                    }
                    userInput.setText("")
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Please enter Day or Night",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

    }
}