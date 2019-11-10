package com.example.artak.arloopa_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegistrationActivity : AppCompatActivity() , View.OnClickListener
{


    override fun onClick(v: View?)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_activity)
        var actionbar = supportActionBar

        actionbar!!.title = "Register"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var full_registration = findViewById<Button>(R.id.register_button)
        var finish_button = findViewById<Button>(R.id.finish_button)

        val intent_additional_info = Intent(this, Additional_info::class.java)
        val intent_welcome = Intent(this, Welcome::class.java)


        finish_button.setOnClickListener()
        {view ->

            startActivity(intent_welcome)
        }

        full_registration.setOnClickListener()
        {view ->

            startActivity(intent_additional_info)
        }
    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }

    //        finish_button.setOnClickListener()
//        {view ->
//            val textFragment = Welcome()
//
//            // Get the support fragment manager instance
//            val manager = supportFragmentManager
//
//            // Begin the fragment transition using support fragment manager
//            val transaction = manager.beginTransaction()
//
//            // Replace the fragment on container
//            transaction.replace(R.id.fragment_container,textFragment)
//            transaction.addToBackStack(null)
//
//            // Finishing the transition
//            transaction.commit()
}





