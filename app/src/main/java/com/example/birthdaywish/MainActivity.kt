package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createWish(view: View) {

        val name = nameInput.editableText.toString()

        val intent = Intent(this, BirthdayGreetActivity::class.java)
        intent.putExtra(BirthdayGreetActivity.name_extra, name)
        startActivity(intent)

    }
}