package com.sohan.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val mytxtView1 = findViewById<TextView>(R.id.textView)
        val mytxtView2 = findViewById<TextView>(R.id.textView2)
        var num = 0;
        btnClickMe.setOnClickListener {
            //To Increase the Number value onclick of the button
            num += 1;
            //To change the Button Text
            btnClickMe.text = "HaHa You Clickd Me"
            //To Display the Emoji
            mytxtView2.text = "\uD83E\uDD73 Party Time...."

            //To Display the Number
            mytxtView1.text = num.toString();

            // To Pop Up the Toast Notification
            Toast.makeText(this, "Hey I am a Toast! $num",Toast.LENGTH_LONG).show()
        }



    }
}