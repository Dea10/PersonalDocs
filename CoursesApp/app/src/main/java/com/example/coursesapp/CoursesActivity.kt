package com.example.coursesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_courses.*

class CoursesActivity : AppCompatActivity() {

    val TAG : String = "CoursesActivity"
    val categories = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        // get Categories from Firebase

        setAdapter();
        bindUI();

    }

    fun setAdapter() {
        val databaseReference: DatabaseReference
        databaseReference = FirebaseDatabase.getInstance().getReference("Categories")

        val childEventListener = object : ChildEventListener {
            override fun onChildAdded(dataSnapshot: DataSnapshot, previousChildName: String?) {
                Log.d(TAG, "onChildAdded:" + dataSnapshot.key!!)

                // A new comment has been added, add it to the displayed list
                val incomingCategory = dataSnapshot.getValue(Category::class.java)
                categories.add(incomingCategory!!.categoryName!!.toString());
                val arrayAdapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, categories)
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

                spinnerCategories.adapter = arrayAdapter
                arrayAdapter.notifyDataSetChanged()
                // ...
            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, previousChildName: String?) {
                Log.d(TAG, "onChildChanged: ${dataSnapshot.key}")

                // A comment has changed, use the key to determine if we are displaying this
                // comment and if so displayed the changed comment.
                // val newComment = dataSnapshot.getValue(Comment::class.java)
                // val commentKey = dataSnapshot.key

                // ...
            }

            override fun onChildRemoved(dataSnapshot: DataSnapshot) {
                Log.d(TAG, "onChildRemoved:" + dataSnapshot.key!!)

                // A comment has changed, use the key to determine if we are displaying this
                // comment and if so remove it.
                // val commentKey = dataSnapshot.key

                // ...
            }

            override fun onChildMoved(dataSnapshot: DataSnapshot, previousChildName: String?) {
                Log.d(TAG, "onChildMoved:" + dataSnapshot.key!!)

                // A comment has changed position, use the key to determine if we are
                // displaying this comment and if so move it.
                // val movedComment = dataSnapshot.getValue(Comment::class.java)
                // val commentKey = dataSnapshot.key

                // ...
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.w(TAG, "postComments:onCancelled", databaseError.toException())
            }
        }
        databaseReference.addChildEventListener(childEventListener)
    }


    fun bindUI() {
        // set click listeners
        btnAddNewCourse.setOnClickListener {
                view -> addNewCourse(editTextCourseName.text.toString(), spinnerCategories.selectedItem.toString(), editTextTeacherName.text.toString());
        }
    }

    fun addNewCourse(courseName : String, category: String, teacherName : String) {
        // validate null values

        // create Course instance

        // send Course instance to Firebase
        val firebaseDatabase = FirebaseDatabase.getInstance()

        val coursesDatabaseRef = firebaseDatabase.getReference("Courses")
        val coursesByCategoryRef = firebaseDatabase.getReference("CoursesByCategory")

        // create Course instance
        val courseObject = Course(courseName, category, teacherName)

        // send Course instance
        coursesDatabaseRef.push().setValue(courseObject)

        // update CoursesByCategory
            // get Category id
            // add Course
    }
}
