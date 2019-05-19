package com.nure.nure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nure.nure.R.layout.birthday_layout
import kotlinx.android.synthetic.main.birthday_layout.*

class BirthdayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(birthday_layout)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

    }
}
