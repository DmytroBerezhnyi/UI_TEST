package com.nure.nure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.name_surname.*
import kotlinx.android.synthetic.main.phone_email_signup.toolbar

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name_surname)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        fab_next.setOnClickListener {
            val intent = Intent(this@MainActivity3, BirthdayActivity::class.java)
            intent.putExtra("name", et_name_surname.text.toString())
            startActivity(intent)
        }
    }
}
