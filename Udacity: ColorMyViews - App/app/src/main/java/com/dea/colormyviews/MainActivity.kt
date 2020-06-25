package com.dea.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews = listOf<View>(
            main_tv_box_one,
            main_tv_box_two,
            main_tv_box_three,
            main_tv_box_four,
            main_tv_box_five,
            main_constraint_layout,
            main_btn_red,
            main_btn_yellow,
            main_btn_green
        )

        clickableViews.forEach { item ->
            item.setOnClickListener { view ->
                makeColored(view)
            }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.main_tv_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.main_tv_box_two -> view.setBackgroundColor(Color.GRAY)

            R.id.main_tv_box_three -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.main_tv_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.main_tv_box_five -> view.setBackgroundResource(android.R.color.holo_orange_dark)

            R.id.main_btn_red -> main_tv_box_three.setBackgroundResource(R.color.my_red)
            R.id.main_btn_yellow -> main_tv_box_four.setBackgroundResource(R.color.my_yellow)
            R.id.main_btn_green -> main_tv_box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundResource(android.R.color.darker_gray)
        }
    }
}