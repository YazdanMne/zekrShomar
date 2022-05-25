package com.example.zekrshomar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "ذکر مورد نظر خود را انتخاب کنید", Toast.LENGTH_SHORT).show()

    var btnSalavat = findViewById<Button>(R.id.salavat)

        btnSalavat.setOnClickListener {
            Intent(this,ActivitySalavat::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر صلوات", Toast.LENGTH_SHORT).show()
        }
        var btnzekr1 = findViewById<Button>(R.id.shanbeh)
        var btnZekr2 = findViewById<Button>(R.id.Oneshanbeh)
        var btnZekr3 = findViewById<Button>(R.id.twoshanbeh)
        var btnZekr4 = findViewById<Button>(R.id.threeshanbeh)
        var btnZekr5 = findViewById<Button>(R.id.foreshanbeh)
        var btnZekr6 = findViewById<Button>(R.id.fiveshanbeh)
        var btnZekr7 = findViewById<Button>(R.id.sixsshanbeh)

        btnzekr1.setOnClickListener {
            Intent(this,Shanbe::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز شنبه", Toast.LENGTH_SHORT).show()
        }
        btnZekr2.setOnClickListener {
            Intent(this,OneShanbe::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز یکشنبه", Toast.LENGTH_SHORT).show()
        }
        btnZekr3.setOnClickListener {
            Intent(this,TwoShanbe::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز دوشنبه", Toast.LENGTH_SHORT).show()
        }

        btnZekr4.setOnClickListener {
            Intent(this,ThreeShanbe::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز سه شنبه", Toast.LENGTH_SHORT).show()
        }
        btnZekr5.setOnClickListener {
            Intent(this,fourShanbe::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز چهارشنبه", Toast.LENGTH_SHORT).show()
        }
        btnZekr6.setOnClickListener {
            Intent(this,FiveShanbeh::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز پنجشنبه", Toast.LENGTH_SHORT).show()
        }

        btnZekr7.setOnClickListener {
            Intent(this,Jomee::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "ذکر روز جمعه", Toast.LENGTH_SHORT).show()
        }



    }
}