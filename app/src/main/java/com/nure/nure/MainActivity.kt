package com.nure.nure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.FacebookSdk
import kotlinx.android.synthetic.main.login_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FacebookSdk.sdkInitialize(applicationContext)
        setContentView(R.layout.login_main)
        tv_signin.setOnClickListener { startActivity(Intent(this@MainActivity, MainActivity2::class.java)) }
    }
}
