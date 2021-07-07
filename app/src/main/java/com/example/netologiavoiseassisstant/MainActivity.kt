package com.example.netologiavoiseassisstant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "Ivan"
        val surname = "Ivanov"
        var age = 37
        var height = 172.2
        val summary = "name: $name surname: $surname age: $age height: $height"

        val output : TextView = findViewById(R.id.output)
        //findViewById<TextView>(R.id.output).text=summary
        output.text = summary
        Log.d(TAG, "end of onCreate function")
    }
}