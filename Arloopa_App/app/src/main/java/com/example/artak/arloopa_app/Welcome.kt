package com.example.artak.arloopa_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var return_button = findViewById<Button>(R.id.return_button)

        val intent_additional_info = Intent(this, Additional_info::class.java)

        return_button.setOnClickListener()
        {view ->
            startActivity(intent_additional_info)
        }

    }
}
