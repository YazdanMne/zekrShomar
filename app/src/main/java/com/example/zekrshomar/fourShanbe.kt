package com.example.zekrshomar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class fourShanbe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_shanbe)


        var translait = findViewById<Button>(R.id.btnTransition)
        var tarjome = findViewById<TextView>(R.id.TransitionTxt)
        var salavat = findViewById<Button>(R.id.ferestadam)
        var showNumber = findViewById<TextView>(R.id.number1)
        var miuns = findViewById<Button>(R.id.check)
        var remove = findViewById<Button>(R.id.pack)
        var backMenu = findViewById<Button>(R.id.menu)
        var Click = 0

        translait.setOnClickListener {
            tarjome.isVisible=true
            translait.isVisible=false

        }

        salavat.setOnClickListener {
            Click+=1;
            showNumber.text=Click.toString()
        }
        miuns.setOnClickListener {
            Click-=1;
            showNumber.text=Click.toString()
        }

        remove.setOnClickListener {
            Click = 0;
            showNumber.text=Click.toString()
        }
        backMenu.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر مورد نظر خود را انتخاب کنید", Toast.LENGTH_SHORT).show()
        }




    }
}