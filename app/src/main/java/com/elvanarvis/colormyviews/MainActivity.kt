package com.elvanarvis.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {

        when (view.id) {

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.button_red -> view.setBackgroundColor(resources.getColor(R.color.my_red))
            R.id.button_yellow -> view.setBackgroundColor(resources.getColor(R.color.my_yellow))
            R.id.button_green -> view.setBackgroundColor(resources.getColor(R.color.my_green))
            else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.button_red)
        val yellowButton = findViewById<Button>(R.id.button_yellow)
        val greenButton = findViewById<Button>(R.id.button_green)

        val cliclableViews: List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText,
            boxFiveText, rootConstraintLayout, redButton,
            yellowButton, greenButton
        )

        for (item in cliclableViews) {

            item.setOnClickListener { makeColored(it) }

        }
    }
}









