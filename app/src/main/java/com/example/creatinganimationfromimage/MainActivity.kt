package com.example.creatinganimationfromimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)


        image.setOnClickListener {

            image.animate().apply{
                duration = 1000
                rotationXBy(360f)

            }.withEndAction {
                image.animate().apply{
                    duration= 1000
                    rotationYBy( 3600f)
                }.start()

            }
        }
    }
}