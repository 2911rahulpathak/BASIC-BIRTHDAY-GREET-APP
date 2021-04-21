package com.example.birthdaygreetbyrahul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    //GO TO XML and type ONCLICK and type the name you want to make//
    fun createBirthdayCard(view: View) {

      //  val name = nameinput.editableText.toString()


        val intent= Intent(this,BirthdayGreetingActivity::class.java)
        //intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}