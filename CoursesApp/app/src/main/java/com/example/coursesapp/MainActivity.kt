package com.example.coursesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindUI()
    }

    fun bindUI() {
        val btnCat = findViewById<Button>(R.id.btnCat);
        val btnCourses = findViewById<Button>(R.id.btnCourses);

        //set click listeners
        btnCat.setOnClickListener {
            view -> goToCategoriesActivity();
        }

        btnCourses.setOnClickListener {
            view -> goToCoursesActivity();
        }
    }

    fun goToCategoriesActivity() {
        val intent = Intent(this, CategoriesActivity::class.java);
        startActivity(intent);
    }

    fun goToCoursesActivity() {
        val intent = Intent(this, CoursesActivity::class.java);
        startActivity(intent);
    }
}
