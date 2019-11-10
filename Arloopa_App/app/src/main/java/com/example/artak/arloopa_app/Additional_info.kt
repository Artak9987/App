package com.example.artak.arloopa_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Additional_info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.additional_info)

        var actionbar = supportActionBar

        actionbar!!.title = "Additional Info"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }

}
