package com.example.applayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityConstraint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
    }

    fun send (v: View){
        when (v.getId()){
            R.id.activity_constraint_send -> {
                val intent = Intent(this, ActivityGrid::class.java)
                startActivity(intent)
            }
        }
    }

}