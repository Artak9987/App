package com.example.artak.arloopa_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(),  View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)
        var registerButton = findViewById<Button>(R.id.register_button)

        val intent = Intent(this,RegistrationActivity::class.java)
        registerButton.setOnClickListener()
        {view ->
            startActivity(intent)
        }
    }

    override fun onClick(v: View)
    {
//        when (v.id)
//        {
//            R.id.register_button ->
//            {
//                val intent = Intent(this, RegistrationActivity::class.java)
//                startActivity(intent)
//                Log.d("ARTAK", "TAG")
//            }
//            else ->
//            {
//                // else condition
//            }
//        }
    }
}


