package com.example.zekrshomar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Toast.makeText(this, "نسخه آزمایشی", Toast.LENGTH_SHORT).show()

        var splashTime = object : Thread(){
            override fun run() {
                super.run()
                try {
                    Thread.sleep(4000)
                }catch (e:Exception){

                }finally {
                    startActivity(Intent(this@SplashScreen,MainActivity::class.java))
                }
            }

        }
        splashTime.start()
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
    }
