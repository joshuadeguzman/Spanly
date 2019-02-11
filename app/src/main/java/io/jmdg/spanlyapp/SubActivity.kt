package io.jmdg.spanlyapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.jmdg.spanly.*
import kotlinx.android.synthetic.main.activity_sub.*

//
// Created by Joshua de Guzman on 11/02/2019.
// https://github.com/joshuadeguzman
// https://jmdg.io
//

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppThemeViolet)
        setContentView(R.layout.activity_sub)

        // Render sample font
        val fontAvenirBold = Typeface.createFromAsset(assets, "fonts/avenir_bold.ttc")
        val fontBrillianteRegular = Typeface.createFromAsset(assets, "fonts/brilliante_regular.ttf")

        // Sample usage
        tvMessage.text =
                Spanly()
                        .append("SHOW", font(fontAvenirBold), color(getColor(R.color.colorOrange)), size(1.5f), strike())
                        .space()
                        .append("ME", font(fontAvenirBold), color(Color.WHITE), italic(), size(1.5f))
                        .next()
                        .append("T    H    E", font(fontAvenirBold), color(getColor(R.color.colorVioletLight)), size(1.5f))
                        .next()
                        .append("Code", font(fontBrillianteRegular), size(5f), color(getColor(R.color.colorVioletLight)))

        // Subscribe to button clicks
        tvMessage.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}