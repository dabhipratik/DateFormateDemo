package com.app.dateformatedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.app.timeformate.getCurrentTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtDate: TextView =findViewById(R.id.txt_date)
        val btnGetDate: Button =findViewById(R.id.btn_date)

        btnGetDate.setOnClickListener {
            txtDate.text = getCurrentTime("dd-MM-yyyy hh:mm")
        }


    }
}