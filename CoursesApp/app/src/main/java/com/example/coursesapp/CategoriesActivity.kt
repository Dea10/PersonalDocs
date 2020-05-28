package com.example.coursesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_categories.*

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        bindUI();
    }

    fun bindUI() {
        val editTextNewCategory = findViewById<EditText>(R.id.editTextNewCategory);
        val btnAddNewCategory = findViewById<Button>(R.id.btnAddNewCategory);

        //set click listeners
        btnAddNewCategory.setOnClickListener {
            view -> addNewCategory(editTextNewCategory.text.toString());
        }
    }

    fun addNewCategory(category : String) {
        // validate null values
        if(!category.equals("")) {
            val firebaseDatabase = FirebaseDatabase.getInstance()
            val categoriesDatabaseRef = firebaseDatabase.getReference("Categories")

            // create Category instance
            val categoryObject = Category(category)

            // send Category instance
            categoriesDatabaseRef.push().setValue(categoryObject)
        } else {
            editTextNewCategory.error = "Required field!"
        }
    }
}
