package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet.*

class BirthdayGreetActivity : AppCompatActivity() {

    companion object{
        const val name_extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra(name_extra)
        showBirthdayWish.text = "Happy Birthday \n $name"
    }
}