package io.jmdg.spanlyapp

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.jmdg.spanly.*
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Typeface

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Render sample font
        val fontAvenirBold = Typeface.createFromAsset(assets, "fonts/avenir_bold.ttc")
        val fontBrillianteRegular = Typeface.createFromAsset(assets, "fonts/brilliante_regular.ttf")

        // Sample usage
        tvMessage.text =
                Spanly()
                        .append("TALK", font(fontAvenirBold), color(getColor(R.color.colorOrange)), size(1.5f), italic())
                        .space()
                        .append("IS", font(fontAvenirBold), color(Color.WHITE), underline(), size(1.5f))
                        .next()
                        .append("Cheap", font(fontBrillianteRegular), size(5f), color(getColor(R.color.colorBlueLight)))

        // Subscribe to button clicks
        tvMessage.setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
            finish()
        }
    }
}