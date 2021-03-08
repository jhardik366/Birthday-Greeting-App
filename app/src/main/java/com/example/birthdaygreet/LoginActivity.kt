package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun crateBirthdayCard(view: View) {

        val name = input_name.editableText.toString()

        if(name=="") {
            Toast.makeText(this, "Please Enter Name", Toast.LENGTH_LONG).show()
        }
        else {

            //Intent to go to another activity
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
            finish()
        }
    }
}