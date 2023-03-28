package com.example.applayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityGrid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
    }

    fun send (v: View){
        when (v.getId()){
            R.id.activity_frame_send -> {
                val intent = Intent(this, ActivityFrame::class.java)
                startActivity(intent)
            }
        }
    }

    fun sendCalculadora (v: View){
        when (v.getId()){
            R.id.activity_Calculadora_send -> {
                val intent = Intent(this, ActivityCalculadora::class.java)
                startActivity(intent)
            }
        }
    }
}